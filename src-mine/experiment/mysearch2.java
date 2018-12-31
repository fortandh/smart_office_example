//package experiment;
//
//import at.ac.tuwien.big.moea.SearchAnalysis;
//import at.ac.tuwien.big.moea.SearchExperiment;
//import at.ac.tuwien.big.moea.experiment.analyzer.SearchAnalyzer;
//import at.ac.tuwien.big.moea.experiment.executor.listener.CollectiveProgressListener;
//import at.ac.tuwien.big.moea.print.IPopulationWriter;
//import at.ac.tuwien.big.moea.print.ISolutionWriter;
//import at.ac.tuwien.big.moea.search.algorithm.EvolutionaryAlgorithmFactory;
//import at.ac.tuwien.big.moea.search.algorithm.LocalSearchAlgorithmFactory;
//import at.ac.tuwien.big.moea.search.algorithm.MyNSGAII;
//import at.ac.tuwien.big.moea.search.algorithm.operator.mutation.PlaceholderMutation;
//import at.ac.tuwien.big.moea.search.algorithm.provider.IRegisteredAlgorithm;
//import at.ac.tuwien.big.moea.search.fitness.dimension.IFitnessDimension;
//import at.ac.tuwien.big.momot.ModuleManager;
//import at.ac.tuwien.big.momot.TransformationResultManager;
//import at.ac.tuwien.big.momot.TransformationSearchOrchestration;
//import at.ac.tuwien.big.momot.problem.solution.TransformationSolution;
//import at.ac.tuwien.big.momot.search.algorithm.operator.mutation.TransformationVariableMutation;
//import at.ac.tuwien.big.momot.search.fitness.EGraphMultiDimensionalFitnessFunction;
//import at.ac.tuwien.big.momot.search.fitness.IEGraphMultiDimensionalFitnessFunction;
//import at.ac.tuwien.big.momot.search.fitness.dimension.AbstractEGraphFitnessDimension;
//import at.ac.tuwien.big.momot.search.fitness.dimension.TransformationLengthDimension;
//import at.ac.tuwien.big.momot.util.MomotUtil;
//import experiment.RequirementFactory;
//import experiment.RequirementFactory.Observable;
//
//import java.io.File;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.text.SimpleDateFormat;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Date;
//import java.util.List;
//
//import org.eclipse.emf.common.util.URI;
//import org.eclipse.emf.ecore.EObject;
//import org.eclipse.emf.henshin.interpreter.EGraph;
//import org.moeaframework.algorithm.NSGAII;
//import org.moeaframework.core.Algorithm;
//import org.moeaframework.core.Population;
//import org.moeaframework.core.Solution;
//import org.moeaframework.core.operator.OnePointCrossover;
//import org.moeaframework.core.operator.TournamentSelection;
//import org.moeaframework.core.operator.TwoPointCrossover;
//import org.moeaframework.util.progress.ProgressListener;
//
//import smart_office.Clazz;
//import smart_office.Room;
//import smart_office.SmartOffice;
//import smart_office.Smart_officePackage;
//
//@SuppressWarnings("all")
//public class mysearch2 {
//	
//  protected final static int RUN_TIMES = 1;
//	
//  protected final static String INITIAL_MODEL = "input/new_case.xmi";
//  
//  protected final String[] modules = new String[] { "transformations/smart_office.henshin" };
//  
//  protected final int nrRuns = 1;
//  
//  protected String baseName;
//  
//  
//  protected IFitnessDimension<TransformationSolution> makeCalculator(final TransformationSearchOrchestration orchestration, Observable calculator) {
//    return new AbstractEGraphFitnessDimension("anonymous", at.ac.tuwien.big.moea.search.fitness.dimension.IFitnessDimension.FunctionType.Maximum) {
//    		@Override
//    		protected double internalEvaluate(TransformationSolution solution) {
//    	   		EGraph graph = solution.execute();
//    	   		SmartOffice smartOffice = (SmartOffice) MomotUtil.getRoot(graph);
//	  		return calculator.cal(smartOffice);
//    		}
//    };
//  }
//  
//  protected IFitnessDimension<TransformationSolution> makeCalculators(final TransformationSearchOrchestration orchestration, Observable[] calculators) {
//    return new AbstractEGraphFitnessDimension("anonymous", at.ac.tuwien.big.moea.search.fitness.dimension.IFitnessDimension.FunctionType.Maximum) {
//    		@Override
//    		protected double internalEvaluate(TransformationSolution solution) {
//    	   		EGraph graph = solution.execute();
//    	   		SmartOffice smartOffice = (SmartOffice) MomotUtil.getRoot(graph);
//    	   		double res = 0;
//    	   		for (Observable calculator : calculators) {
//    	   			res += calculator.cal(smartOffice);
//    	   		}
//    	   		return res;
//    		}
//    };
//  }
//  
//  
//  protected IFitnessDimension<TransformationSolution> _createObjectiveHelper_1() {
//    TransformationLengthDimension _transformationLengthDimension = new TransformationLengthDimension();
//    return _transformationLengthDimension;
//  }
//  
//  protected IFitnessDimension<TransformationSolution> _createObjective_1(final TransformationSearchOrchestration orchestration) {
//    IFitnessDimension<TransformationSolution> dimension = _createObjectiveHelper_1();
//    dimension.setName("SolutionLength");
//    dimension.setFunctionType(at.ac.tuwien.big.moea.search.fitness.dimension.IFitnessDimension.FunctionType.Minimum);
//    return dimension;
//  }
//  
//  protected ModuleManager createModuleManager() {
//    ModuleManager manager = new ModuleManager();
//    for(String module : modules) {
//       manager.addModule(URI.createFileURI(new File(module).getPath().toString()).toString());
//    }
//    return manager;
//  }
//  
//  protected IEGraphMultiDimensionalFitnessFunction createFitnessFunction(
//		  final TransformationSearchOrchestration orchestration,
//		  final boolean heuristic,
//		  final boolean merged) {
//    IEGraphMultiDimensionalFitnessFunction function = new EGraphMultiDimensionalFitnessFunction();
//        
//    Observable calculators[] = {
//		new RequirementFactory.HeaterOff("pr2", 0.07 * 0.05),
//		new RequirementFactory.HeaterOff("pr4", 0.07 * 0.05),
//		new RequirementFactory.HeaterOff("pr6", 0.07 * 0.05),
//	    new RequirementFactory.HeaterOff("pr6", 0.07 * 0.05),
//	    new RequirementFactory.HeaterOff("pr12", 0.07 * 0.05),
//	    new RequirementFactory.HeaterOff("phda", 0.07 * 0.1),
//	    new RequirementFactory.HeaterOff("st", 0.07 * 0.1),
//	    new RequirementFactory.HeaterOff("bf", 0.07 * 0.2),
//	    new RequirementFactory.HeaterOff("phdb", 0.07 * 0.1),
//	    new RequirementFactory.HeaterOff("sec", 0.07 * 0.1),
//	    new RequirementFactory.HeaterOff("chr", 0.07 * 0.15),
//	    
//	    new RequirementFactory.LightOff("pr1", 0.03 * 0.05),
//	    new RequirementFactory.LightOff("pr3", 0.03 * 0.05),
//	    new RequirementFactory.LightOff("pr5", 0.03 * 0.05),
//	    new RequirementFactory.LightOff("pr9", 0.03 * 0.05),
//	    new RequirementFactory.LightOff("pr11", 0.03 * 0.05),
//	    new RequirementFactory.LightOff("pr13", 0.03 * 0.05),
//	    new RequirementFactory.LightOff("bd", 0.03 * 0.1),
//	    new RequirementFactory.LightOff("bm", 0.03 * 0.1),
//	    new RequirementFactory.LightOff("maestro", 0.03 * 0.2),
//	    new RequirementFactory.LightOff("meet", 0.03 * 0.1),
//	    new RequirementFactory.LightOff("rec", 0.03 * 0.1),
//	    new RequirementFactory.LightOff("lab", 0.03 * 0.1),
//	    
//	    new RequirementFactory.TemperatureHigh("pr7", 0.16 * 0.6),
//	    new RequirementFactory.TemperatureHigh("pr10", 0.16 * 0.4),
//	    
//	    new RequirementFactory.BrightnessHigh("pr7", 0.16 * 0.3),
//	    new RequirementFactory.BrightnessHigh("pr14", 0.16 * 0.7),
//	    
//	    heuristic ? new RequirementFactory.AssetNotCollectedHeuristic("prt1", 0.1 * 0.3) : new RequirementFactory.AssetCollected("prt1", 0.1 * 0.3),
//		heuristic ? new RequirementFactory.AssetNotCollectedHeuristic("prt2", 0.1 * 0.4) : new RequirementFactory.AssetCollected("prt2", 0.1 * 0.4),
//		heuristic ? new RequirementFactory.AssetNotCollectedHeuristic("prt3", 0.1 * 0.3) : new RequirementFactory.AssetCollected("prt3", 0.1 * 0.3),
//		
//		heuristic ? new RequirementFactory.DirtyHeuristic("pr7", 0.08 * 0.2) : new RequirementFactory.Clean("pr7", 0.08 * 0.2),
//		heuristic ? new RequirementFactory.DirtyHeuristic("pr10", 0.08 * 0.5) : new RequirementFactory.Clean("pr10", 0.08 * 0.5),
//		heuristic ? new RequirementFactory.DirtyHeuristic("pr14", 0.08 * 0.3) : new RequirementFactory.Clean("pr14", 0.08 * 0.3),
//		
//		new RequirementFactory.NoRoomba("pr7", 0.08 * 0.25),
//		new RequirementFactory.NoRoomba("pr10", 0.08 * 0.25),
//		new RequirementFactory.NoRoomba("pr14", 0.08 * 0.25),
//		new RequirementFactory.NoRoomba("srv", 0.08 * 0.25),
//		
//		heuristic ? new RequirementFactory.SecretaryNotInHeuristic("srv", 0.32 * 1) : new RequirementFactory.WithSecretary("srv", 0.32 * 1)
//    };
//    if (merged) {
//    	function.addObjective(makeCalculators(orchestration, calculators));
//    } else {
//		for (Observable calculator: calculators)
//			function.addObjective(makeCalculator(orchestration, calculator));
//    }
//    return function;
//  }
//  
//  protected IEGraphMultiDimensionalFitnessFunction createObjectiveNumber(
//		  final TransformationSearchOrchestration orchestration,
//		  final boolean merged) {
//    IEGraphMultiDimensionalFitnessFunction function = new EGraphMultiDimensionalFitnessFunction();
//        
//    Observable calculators[] = {
//		new RequirementFactory.HeaterOff("pr2", 1),
//		new RequirementFactory.HeaterOff("pr4",1),
//		new RequirementFactory.HeaterOff("pr6", 1),
//	    new RequirementFactory.HeaterOff("pr6", 1),
//	    new RequirementFactory.HeaterOff("pr12", 1),
//	    new RequirementFactory.HeaterOff("phda", 1),
//	    new RequirementFactory.HeaterOff("st", 1),
//	    new RequirementFactory.HeaterOff("bf", 1),
//	    new RequirementFactory.HeaterOff("phdb", 1),
//	    new RequirementFactory.HeaterOff("sec", 1),
//	    new RequirementFactory.HeaterOff("chr", 1),
//	    
//	    new RequirementFactory.LightOff("pr1", 100),
//	    new RequirementFactory.LightOff("pr3", 100),
//	    new RequirementFactory.LightOff("pr5", 100),
//	    new RequirementFactory.LightOff("pr9", 100),
//	    new RequirementFactory.LightOff("pr11", 100),
//	    new RequirementFactory.LightOff("pr13", 100),
//	    new RequirementFactory.LightOff("bd", 100),
//	    new RequirementFactory.LightOff("bm", 100),
//	    new RequirementFactory.LightOff("maestro", 100),
//	    new RequirementFactory.LightOff("meet", 100),
//	    new RequirementFactory.LightOff("rec", 100),
//	    new RequirementFactory.LightOff("lab", 100),
//	    
//	    new RequirementFactory.TemperatureHigh("pr7", 10000),
//	    new RequirementFactory.TemperatureHigh("pr10", 10000),
//	    
//	    new RequirementFactory.BrightnessHigh("pr7", 100000),
//	    new RequirementFactory.BrightnessHigh("pr14", 100000),
//	    
//	    new RequirementFactory.AssetCollected("prt1", 1000000),
//		new RequirementFactory.AssetCollected("prt2", 1000000),
//		new RequirementFactory.AssetCollected("prt3", 1000000),
//		
//		new RequirementFactory.Clean("pr7", 10000000),
//		new RequirementFactory.Clean("pr10", 10000000),
//		new RequirementFactory.Clean("pr14", 10000000),
//		
//		new RequirementFactory.NoRoomba("pr7", 100000000),
//		new RequirementFactory.NoRoomba("pr10", 100000000),
//		new RequirementFactory.NoRoomba("pr14", 100000000),
//		new RequirementFactory.NoRoomba("srv", 100000000),
//		
//		new RequirementFactory.WithSecretary("srv", 1000000000)
//    };
//    if (merged) {
//		function.addObjective(makeCalculators(orchestration, calculators));
//    } else {
//		for (Observable calculator: calculators)
//			function.addObjective(makeCalculator(orchestration, calculator));
//    }
//    return function;
//  }
//  
//  protected IRegisteredAlgorithm<MyNSGAII> _createRegisteredAlgorithm_0(final TransformationSearchOrchestration orchestration, final EvolutionaryAlgorithmFactory<TransformationSolution> moea, final LocalSearchAlgorithmFactory<TransformationSolution> local) {
//    IRegisteredAlgorithm<MyNSGAII> _createNSGAII = moea.createNSGAII();
//    return _createNSGAII;
//  }
//  
//  protected EGraph createInputGraph(final String initialGraph, final ModuleManager moduleManager) {
//    EGraph graph = moduleManager.loadGraph(initialGraph);
//    return graph;
//  }
//  
//  protected TransformationSearchOrchestration createOrchestration(
//		  final String initialGraph, 
//		  final int solutionLength, 
//		  final int populationSize,
//		  final String algorithmName,
//		  final boolean heuristic,
//		  final boolean merged) {
//    TransformationSearchOrchestration orchestration = new TransformationSearchOrchestration();
//    ModuleManager moduleManager = createModuleManager();
//    EGraph graph = createInputGraph(initialGraph, moduleManager);
//    orchestration.setModuleManager(moduleManager);
//    orchestration.setProblemGraph(graph);
//    orchestration.setSolutionLength(solutionLength);
//    orchestration.setFitnessFunction(createFitnessFunction(orchestration, heuristic, merged));
//    
//    EvolutionaryAlgorithmFactory<TransformationSolution> moea = orchestration.createEvolutionaryAlgorithmFactory(populationSize);
//    LocalSearchAlgorithmFactory<TransformationSolution> local = orchestration.createLocalSearchAlgorithmFactory();
//    
//    final IRegisteredAlgorithm<? extends Algorithm> algorithm = 
//    		algorithmName.equals("NSGAII") ? 
//			moea.createNSGAII(
//				new TournamentSelection(2),
//				new TwoPointCrossover(0.9),
//				new PlaceholderMutation(0.1), 
//				new TransformationVariableMutation(orchestration.getSearchHelper(), 0.2)) : 
//		algorithmName.equals("NSGAIII") ? 
//			moea.createNSGAIII() : 
//		algorithmName.equals("PAES") ?
//			moea.createPAES(8, 100000, 
//				new PlaceholderMutation(0.1), 
//				new TransformationVariableMutation(orchestration.getSearchHelper(), 0.9)) :
//		algorithmName.equals("eMOEA") ? 
//			moea.createEpsilonMOEA(0.01, new TournamentSelection(2), new TwoPointCrossover(1.0),
//		            new PlaceholderMutation(0.1)) :
//			moea.createRandomSearch();
//    orchestration.addAlgorithm(algorithm);
//    
//    return orchestration;
//  }
//  
//  protected SearchExperiment<TransformationSolution> createExperiment(
//		  final TransformationSearchOrchestration orchestration,
//		  final int maxEvaluations, final int maxPatternMatchings) {
//    SearchExperiment<TransformationSolution> experiment = new SearchExperiment<TransformationSolution>(orchestration, maxEvaluations, maxPatternMatchings);
//    experiment.setNumberOfRuns(nrRuns);
//    return experiment;
//  }
//  
//  protected void deriveBaseName(final TransformationSearchOrchestration orchestration) {
//    EObject root = MomotUtil.getRoot(orchestration.getProblemGraph());
//    if(root == null || root.eResource() == null || root.eResource().getURI() == null)
//    	baseName = getClass().getSimpleName();
//    else
//    	baseName = root.eResource().getURI().trimFileExtension().lastSegment();
//  }
//  
//  protected TransformationResultManager handleResults(final SearchExperiment<TransformationSolution> experiment, final boolean merged) {
//	ISolutionWriter<TransformationSolution> solutionWriter = experiment.getSearchOrchestration().createSolutionWriter();
//	IPopulationWriter<TransformationSolution> populationWriter = experiment.getSearchOrchestration().createPopulationWriter();
//	TransformationResultManager resultManager = new TransformationResultManager(experiment);
//	Population population;
//	population = 
//		TransformationResultManager.createApproximationSet(experiment, (String[])null);
//	System.out.println("- Save objectives of all algorithms to 'output/objectives/objective_values.txt'");
//	TransformationResultManager.saveObjectives(
//		"output/objectives/objective_values.txt",
//		population
//	);
//	System.out.println("---------------------------");
//	System.out.println("Objectives of all algorithms");
//	System.out.println("---------------------------");
////	String []ress = TransformationResultManager.printObjectives(population).split("\n");
////    for (String res : ress) {
////    		String []arr = res.split(" ");
////    		double val = 0;
////    		for (String raw : arr) {
////    			val -= Double.parseDouble(raw);
////    		}
////    		System.out.println(val);
////    }
////    System.out.println(TransformationResultManager.printObjectives(population));
//    IEGraphMultiDimensionalFitnessFunction function = createFitnessFunction((TransformationSearchOrchestration)experiment.getSearchOrchestration(), false, merged);
//    double fin = 0;
//    for (Solution solution: population) {
//    		double tmp = -function.evaluate((TransformationSolution) solution);
//    		if (tmp > fin)
//    			fin = tmp;
//    }
//    System.out.println("Best satisfaction");
//    System.out.println("---------------------------");
//	System.out.println(fin);
//	
//	IEGraphMultiDimensionalFitnessFunction nums = createObjectiveNumber((TransformationSearchOrchestration)experiment.getSearchOrchestration(), merged);
//	double average_coverages[] = {0, 0, 0, 0, 0, 0, 0, 0};
//	double max_coverages[] = {0, 0, 0, 0, 0, 0, 0, 0};
//    for (Solution solution: population) {
//    		double tmp = -nums.evaluate((TransformationSolution) solution);
//    		double coverages[] = {
//			(int)(tmp % 100) / 12.0, 
//			(int)(tmp / 100 % 100) / 12.0, 
//			(int)(tmp / 10000 % 10) / 2.0, 
//			(int)(tmp / 100000 % 10) / 2.0, 
//			(int)(tmp / 1000000 % 10) / 3.0, 
//			(int)(tmp / 10000000 % 10) / 3.0,
//			(int)(tmp / 100000000 % 10) / 4.0,
//			(int)(tmp / 1000000000 % 10) / 1.0
//		};
//    		for (int i = 0; i < 8; i ++) {
//    			if (coverages[i] > max_coverages[i])
//    				max_coverages[i] = coverages[i];
//    			average_coverages[i] += coverages[i];
//    		}
//    		
//    }
//    String ma = "";
//    String ave = "";
//    for (int i = 0; i < 8; i ++) {
//		ma += String.format("%.2f", max_coverages[i]) + ", ";
//		ave += String.format("%.2f", average_coverages[i] / population.size()) + ", ";
//	}
//    System.out.println("max coverage");
//    System.out.println("---------------------------");
//    System.out.println(ma);
//    System.out.println("average coverage");
//    System.out.println("---------------------------");
//    System.out.println(ave);
//    
////	population = 
////		TransformationResultManager.createApproximationSet(experiment, (String[])null);
////	System.out.println("- Save solutions of all algorithms to 'output/solutions/objective_values.txt'");
////	TransformationResultManager.savePopulation(
////		"output/solutions/objective_values.txt",
////		population,
////		populationWriter
////	);
////	System.out.println("- Save solutions of all algorithms to 'output/solutions/objective_values.txt'");
////	TransformationResultManager.saveSolutions(
////		"output/solutions/",
////		baseName,
////		MomotUtil.asIterables(
////			population,
////			TransformationSolution.class),
////		solutionWriter
////	);
//	
////	population = 
////    	TransformationResultManager.createApproximationSet(experiment, (String[])null);
////    System.out.println("- Save models of all algorithms to 'output/models/'");
////    TransformationResultManager.saveModels(
////    	"output/models/",
////    	baseName,
////    	population
////    );
//	
//	return resultManager;
//  }
//  
//  public void performSearch(
//		  final String initialGraph, 
//		  final int solutionLength, 
//		  final int populationSize,
//		  final int maxEvaluations,
//		  final int maxPatternMatchings,
//		  final String algorithName,
//		  final boolean heuristic,
//		  final boolean merged
//		  ) {
//	  TransformationSearchOrchestration orchestration = createOrchestration(initialGraph, solutionLength, populationSize, algorithName, heuristic, merged);
//	  deriveBaseName(orchestration);
//	  SearchExperiment<TransformationSolution> experiment = createExperiment(orchestration, maxEvaluations, maxPatternMatchings);
//	  experiment.run();
//	  handleResults(experiment, merged);
//  }
//  
//  public static void initialization() {
//	  Smart_officePackage.eINSTANCE.eClass();
//	  System.out.println("Search started.");
//  }
//  
//  public static void finalization() {
//	  System.out.println("Search finished.");
//  }
//  
//  public static void main(final String... args) {
//	  
//	  int eb = 100;
//	  int pb = 3000000;
//	  int populationSize = 3000;
//	  initialization();
//	  mysearch2 search = new mysearch2();
//	  search.performSearch(INITIAL_MODEL, eb, populationSize, 10 * pb, pb, "NSGAII", true, true);
//	  finalization();
//	  
//  }
//}
