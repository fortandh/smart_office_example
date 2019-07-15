package experiment;

import at.ac.tuwien.big.moea.SearchAnalysis;
import at.ac.tuwien.big.moea.SearchExperiment;
import at.ac.tuwien.big.moea.experiment.analyzer.SearchAnalyzer;
import at.ac.tuwien.big.moea.experiment.executor.listener.CollectiveProgressListener;
import at.ac.tuwien.big.moea.print.IPopulationWriter;
import at.ac.tuwien.big.moea.print.ISolutionWriter;
import at.ac.tuwien.big.moea.search.algorithm.EvolutionaryAlgorithmFactory;
import at.ac.tuwien.big.moea.search.algorithm.LocalSearchAlgorithmFactory;
import at.ac.tuwien.big.moea.search.algorithm.MyNSGAII;
import at.ac.tuwien.big.moea.search.algorithm.operator.mutation.PlaceholderMutation;
import at.ac.tuwien.big.moea.search.algorithm.provider.IRegisteredAlgorithm;
import at.ac.tuwien.big.moea.search.fitness.comparator.AggregatedFitnessComparator;
import at.ac.tuwien.big.moea.search.fitness.comparator.ObjectiveFitnessComparator;
import at.ac.tuwien.big.moea.search.fitness.dimension.IFitnessDimension;
import at.ac.tuwien.big.momot.ModuleManager;
import at.ac.tuwien.big.momot.TransformationResultManager;
import at.ac.tuwien.big.momot.TransformationSearchOrchestration;
import at.ac.tuwien.big.momot.problem.solution.TransformationSolution;
import at.ac.tuwien.big.momot.search.algorithm.local.neighborhood.IncreasingNeighborhoodFunction;
import at.ac.tuwien.big.momot.search.algorithm.local.neighborhood.MutationNeighborhoodFunction;
import at.ac.tuwien.big.momot.search.algorithm.operator.mutation.TransformationVariableMutation;
import at.ac.tuwien.big.momot.search.fitness.EGraphMultiDimensionalFitnessFunction;
import at.ac.tuwien.big.momot.search.fitness.IEGraphMultiDimensionalFitnessFunction;
import at.ac.tuwien.big.momot.search.fitness.dimension.AbstractEGraphFitnessDimension;
import at.ac.tuwien.big.momot.search.fitness.dimension.TransformationLengthDimension;
import at.ac.tuwien.big.momot.util.MomotUtil;
import experiment.RequirementFactory;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.henshin.interpreter.ApplicationMonitor;
import org.eclipse.emf.henshin.interpreter.EGraph;
import org.moeaframework.algorithm.NSGAII;
import org.moeaframework.analysis.collector.Collector;
import org.moeaframework.core.Algorithm;
import org.moeaframework.core.Population;
import org.moeaframework.core.Solution;
import org.moeaframework.core.operator.OnePointCrossover;
import org.moeaframework.core.operator.TournamentSelection;
import org.moeaframework.core.operator.TwoPointCrossover;
import org.moeaframework.util.progress.ProgressListener;

import smart_office.Clazz;
import smart_office.Room;
import smart_office.SmartOffice;
import smart_office.Smart_officePackage;

@SuppressWarnings("all")
public class mysearch3 {
  
//  protected final static int []pbs = {10000000};
//  protected final static int []populations = {100, 200, 300, 500, 1000};
//  protected final static int []ebs = {10, 20, 30, 50, 100};
//  protected final static double []propagationRates = {0.95, 0.9, 0.8, 0.6, 0.4, 0.1};
//  protected final static boolean propagations[] = {false};
//  protected final static int levels[] = {0};
  
  protected final String[] modules = new String[] { "transformations/smart_office.henshin" };
  
  protected String baseName;
  
  protected ModuleManager createModuleManager() {
    ModuleManager manager = new ModuleManager();
    for(String module : modules) {
       manager.addModule(URI.createFileURI(new File(module).getPath().toString()).toString());
    }
    return manager;
  }
  
  protected EGraph createInputGraph(final String initialGraph, final ModuleManager moduleManager) {
    EGraph graph = moduleManager.loadGraph(initialGraph);
    return graph;
  }
  
  protected TransformationSearchOrchestration createOrchestration(
		  final String initialGraph, 
		  final int solutionLength, 
		  final int populationSize,
		  final String algorithmName
		  ) {
    TransformationSearchOrchestration orchestration = new TransformationSearchOrchestration();
    ModuleManager moduleManager = createModuleManager();
    EGraph graph = createInputGraph(initialGraph, moduleManager);
    orchestration.setModuleManager(moduleManager);
    orchestration.setProblemGraph(graph);
    orchestration.setSolutionLength(solutionLength);
    orchestration.setFitnessFunction(MySearchContext.getCurrentFitness());
    
    EvolutionaryAlgorithmFactory<TransformationSolution> moea = orchestration.createEvolutionaryAlgorithmFactory(populationSize);
    LocalSearchAlgorithmFactory<TransformationSolution> local = orchestration.createLocalSearchAlgorithmFactory();
    
    final IRegisteredAlgorithm<? extends Algorithm> algorithm = 
    		algorithmName.equals("NSGAII") ? 
			moea.createNSGAII(
				new TournamentSelection(2),
				new TwoPointCrossover(1.0),
				new PlaceholderMutation(0.1), 
				new TransformationVariableMutation(orchestration.getSearchHelper(), 0.2)) : 
		algorithmName.equals("NSGAIII") ? 
			moea.createNSGAIII(new TournamentSelection(2),
					new TwoPointCrossover(1.0),
					new PlaceholderMutation(0.01), 
					new TransformationVariableMutation(orchestration.getSearchHelper(), 0.09)) : 
		algorithmName.equals("PAES") ?
			moea.createPAES(8, 100000, 
				new PlaceholderMutation(0.1), 
				new TransformationVariableMutation(orchestration.getSearchHelper(), 0.9)) :
		algorithmName.equals("eMOEA") ? 
			moea.createEpsilonMOEA(0.01, 
					new TournamentSelection(2), 
					new TwoPointCrossover(1.0),
		            new PlaceholderMutation(0.01), 
		            new TransformationVariableMutation(orchestration.getSearchHelper(), 0.09)) :
//    	algorithmName.equals("HillClimbing") ? 
//			local.createHillClimbing(new MutationNeighborhoodFunction(new TransformationVariableMutation(orchestration.getSearchHelper(), 1), populationSize),
//					new AggregatedFitnessComparator<TransformationSolution>()) :
    	algorithmName.equals("RandomDescent") ? 
            local.createRandomDescent(new MutationNeighborhoodFunction(new TransformationVariableMutation(orchestration.getSearchHelper(), 1), populationSize),
            		new AggregatedFitnessComparator<TransformationSolution>()) :
			moea.createRandomSearch();
    orchestration.addAlgorithm(algorithm);
    
    return orchestration;
  }
  
  protected SearchExperiment<TransformationSolution> createExperiment(
		  final TransformationSearchOrchestration orchestration,
		  final int maxEvaluations) {
    SearchExperiment<TransformationSolution> experiment = new SearchExperiment<TransformationSolution>(orchestration, maxEvaluations);
    experiment.setNumberOfRuns(1);
    return experiment;
  }
  
  protected void deriveBaseName(final TransformationSearchOrchestration orchestration) {
    EObject root = MomotUtil.getRoot(orchestration.getProblemGraph());
    if(root == null || root.eResource() == null || root.eResource().getURI() == null)
    	baseName = getClass().getSimpleName();
    else
    	baseName = root.eResource().getURI().trimFileExtension().lastSegment();
  }
  
  protected TransformationResultManager handleResults(final SearchExperiment<TransformationSolution> experiment) {
	ISolutionWriter<TransformationSolution> solutionWriter = experiment.getSearchOrchestration().createSolutionWriter();
	IPopulationWriter<TransformationSolution> populationWriter = experiment.getSearchOrchestration().createPopulationWriter();
	TransformationResultManager resultManager = new TransformationResultManager(experiment);
	Population population;
	population = 
		TransformationResultManager.createApproximationSet(experiment, (String[])null);
//	for (Solution solution : population) {
//		System.out.println(Arrays.toString(solution.getObjectives()));
//	}
//	String res = MySearchContext.my_evaluate(population);
//	System.out.println(res);
//	try {
//		MySearchContext.fw.write(res + "\n");
//  	} catch(final IOException e) {
//  		// TODO Auto-generated catch block
//  		e.printStackTrace();
//  	}
	return resultManager;
  }
  
  public void performSearch(
		  final String initialGraph, 
		  final int solutionLength, 
		  final int populationSize,
		  final int maxEvaluations,
		  final String algorithName
		  ) {
	  TransformationSearchOrchestration orchestration = createOrchestration(initialGraph, solutionLength, populationSize, algorithName);
	  deriveBaseName(orchestration);
	  SearchExperiment<TransformationSolution> experiment = createExperiment(orchestration, maxEvaluations);
	  experiment.addProgressListener(new CollectiveProgressListener());
	  final long st = System.currentTimeMillis();
	  experiment.run();
	  System.out.println(solutionLength + " Total cost: " + (double) (System.currentTimeMillis() - st) / (double) 1000);
	  handleResults(experiment);
  }
  
  public static void initialization() {
	  Smart_officePackage.eINSTANCE.eClass();
//	  System.out.println("Search started.");
  }
  
  public static void finalization() {
//	  System.out.println("Search finished.");
  }
  
  public static void main(final String... args) {
	  String algoName = "NSGAII";
	  
	  int repeatTimes = 1;
	  int population = 1000;
	  int eb = 100;
	  int pb = eb * population * 100;
	  double propagationRate = 0.6;
	  boolean propagations[] = {true, false};
	  int levels[] = {0, 1, 2, 3};
	  
	  System.out.println(System.getProperty("user.dir"));
	  File folder = new File("E:/work");
	  File[] listOfFiles = folder.listFiles();
	  for (int i1 = 0; i1 < listOfFiles.length; i1 ++) {
		  if (! listOfFiles[i1].isDirectory()) continue;
		  String caseName = listOfFiles[i1].getName();
		  String input = listOfFiles[i1].getAbsolutePath();
		  String model = input + "/instance.xmi";
		  String goal = input + "/goal.json";
		  System.out.println("start for case " + caseName);
		  for (int level : levels) {
			  for (boolean propagation : propagations) {
				  // TODO mkdir named by levels & propagations
				  for (int i = 0; i < repeatTimes; i ++) {
//					  String n = new SimpleDateFormat("MM-dd-HH-mm").format(new Date()) + "_" + algoName + "_prop_" + propagationRate + "_eb_" + eb + "_population_" + population + "_";
					  String conf = (propagation ? "p_" : "np_") + level;
					  System.out.println("start for conf " + conf);
					  try {
						  File file = new File(input + "/results6/" + conf + "/" + i + ".csv");
						  file.getParentFile().mkdirs();
						  MySearchContext.fw = new FileWriter(file, false);
						  MySearchContext.init(propagation, propagationRate, level, goal);
						  initialization();
						  mysearch3 search = new mysearch3();
						  search.performSearch(model, eb, population, pb / eb, algoName);
						  finalization();
						  MySearchContext.fw.close();
					  } catch (IOException e) {
						  // TODO Auto-generated catch block
						  e.printStackTrace();
					  }
				  }
			  }
		  }
	  }
	  
	  System.out.println("finished");
  }
}
