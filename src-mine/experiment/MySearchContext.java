package experiment;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.henshin.interpreter.EGraph;
import org.moeaframework.core.Population;
import org.moeaframework.core.Solution;

import at.ac.tuwien.big.moea.search.fitness.dimension.IFitnessDimension;
import at.ac.tuwien.big.momot.problem.solution.TransformationSolution;
import at.ac.tuwien.big.momot.search.fitness.EGraphMultiDimensionalFitnessFunction;
import at.ac.tuwien.big.momot.search.fitness.IEGraphMultiDimensionalFitnessFunction;
import at.ac.tuwien.big.momot.search.fitness.dimension.AbstractEGraphFitnessDimension;
import at.ac.tuwien.big.momot.util.MomotUtil;
import experiment.RequirementFactory.Requirement;
import smart_office.SmartOffice;

import parallel.smart_office.Paralleler;

public class MySearchContext {
	
	private static final IFitnessDimension<TransformationSolution> makeObjective(Requirement req, boolean propagation) {
	    return new AbstractEGraphFitnessDimension("Req_" + req.hashCode(), at.ac.tuwien.big.moea.search.fitness.dimension.IFitnessDimension.FunctionType.Maximum) {
	    		@Override
	    		protected double internalEvaluate(TransformationSolution solution) {
	    	   		EGraph graph = solution.execute();
	    	   		SmartOffice smartOffice = (SmartOffice) MomotUtil.getRoot(graph);
		  		try {
					return req.eval(smartOffice, propagation);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
		  		return 0;
	    		}
	    };
	}
	
	public static final IEGraphMultiDimensionalFitnessFunction satisfaction(final boolean propagation, final int level) {
	    IEGraphMultiDimensionalFitnessFunction function = new EGraphMultiDimensionalFitnessFunction();
	    
	    List<Requirement> reqs = levels.get(level);
	    for (Requirement req : reqs) {
	    		function.addObjective(makeObjective(req, propagation));
	    }
	    return function;
	}
	
	private static IEGraphMultiDimensionalFitnessFunction currentFitness = null;
	
	private static List<List<Requirement>> levels = null;
	
	private static int graphTransformationTimes = 0;
	
	public static FileWriter fw = null;
	
	public static IEGraphMultiDimensionalFitnessFunction getCurrentFitness() {
		return currentFitness;
	}
	
	public static final void init(boolean propagation, int level) {
		resetGraphTransformationTimes();
		levels = RequirementFactory.defaultRequirements();
		currentFitness = MySearchContext.satisfaction(propagation, level);
	}
	
	public static final void init(boolean propagation, double propagationRate, int level, String path) {
		resetGraphTransformationTimes();
		RequirementFactory.PROPAGATION_RATE = propagationRate;
		levels = RequirementFactory.fromFile(path);
		currentFitness = MySearchContext.satisfaction(propagation, level);
	}
	
	public static final double my_evaluate(Solution solution) {
		double tmp = 0;
		
		List<Requirement> reqs = levels.get(0);
		for(Requirement req : reqs) {
			IFitnessDimension<TransformationSolution> dimension = makeObjective(req, false);
			tmp += dimension.doEvaluate(solution);
		}
		return tmp;
	}
	
	public static List<IFitnessDimension<TransformationSolution>> getMyEvaluationFunction() {
		List<Requirement> reqs = levels.get(0);
		List<IFitnessDimension<TransformationSolution>> dimensions = new ArrayList<>();
		for(Requirement req : reqs) {
			IFitnessDimension<TransformationSolution> dimension = makeObjective(req, false);
			dimensions.add(dimension);
		}
		return dimensions;
	}
	
	public static final String evaluate(Population solutions) {
		double tmp = 0;
		
	    
	    List<Requirement> reqs = levels.get(0);
	    List<IFitnessDimension<TransformationSolution>> dimensions = new ArrayList<>();
	    for (Requirement req : reqs) {
	    		dimensions.add(makeObjective(req, false));
	    }
		
		for (Solution solution : solutions) {
			double cur = dimensions.stream().mapToDouble(d -> d.doEvaluate(solution)).sum();
			if (cur > tmp) tmp = cur;
		}
		String res = graphTransformationTimes + "," + String.format("%.3f", tmp);

		return res;
	}
	
	public static final String evaluate(Population solutions, int level) {
		double tmp = 0;
		Solution bestSolution = null;
	    
	    List<Requirement> reqs = levels.get(0);
	    List<IFitnessDimension<TransformationSolution>> dimensions = new ArrayList<>();
	    for (Requirement req : reqs) {
	    		dimensions.add(makeObjective(req, false));
	    }
		
		for (Solution solution : solutions) {
			double cur = dimensions.stream().mapToDouble(d -> d.doEvaluate(solution)).sum();
			if (cur > tmp) {
				tmp = cur;
				bestSolution = solution;
			}
		}
		
		// 获取权值
		reqs = levels.get(level);
		dimensions.clear();
		for(Requirement req : reqs) {
			dimensions.add(makeObjective(req, false));
		}
		String res = String.format("%d", graphTransformationTimes);
		
		// 计算执行时间
		// res += String.format(",%d", Paralleler.durationCal(bestSolution));
		
		for(IFitnessDimension<TransformationSolution> dimension : dimensions) {
			double value = dimension.doEvaluate(bestSolution);
			res += String.format(",%.3f", value);
		}

		return res;
	}
	
	public static final String log(Population solutions) {
	    
	    List<Requirement> leafReqs = levels.get(3);
	    List<Double> satisfactions = new ArrayList<>();
	    List<IFitnessDimension<TransformationSolution>> dimensions = new ArrayList<>();
	    List<String> res = new ArrayList<>();
	    
	    for (Requirement req : leafReqs) {
	    		IFitnessDimension<TransformationSolution> dimension = makeObjective(req, false);
	    		dimensions.add(dimension);
	    		
	    		double satisfaction = 0.0;
	    		for (Solution solution : solutions) {
	    			satisfaction += dimension.doEvaluate(solution);
	    		}
	    		satisfaction /= solutions.size();
	    		satisfactions.add(satisfaction);
	    }
	    
		for (Solution solution : solutions) {
			List<String> ind = dimensions.stream().map(d -> String.format("%.3f", d.doEvaluate(solution))).collect(Collectors.toList());
			res.add(graphTransformationTimes + "," + String.join(",", ind));
		}

		return String.join("\n", res);
	}

	public static int getGraphTransformationTimes() {
		return graphTransformationTimes;
	}

	public static void increaseGraphTransformationTimes() {
		graphTransformationTimes ++;
	}
	
	public static void resetGraphTransformationTimes() {
		graphTransformationTimes = 0;
	}
}
