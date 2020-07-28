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
import experiment.DemandFactory.Demand;
import smart_nursing_home.SmartNursingHome;

public class MySNHContext {
	private static final IFitnessDimension<TransformationSolution> makeObjective(Demand req, boolean propagation) {
	    return new AbstractEGraphFitnessDimension("Req_" + req.hashCode(), at.ac.tuwien.big.moea.search.fitness.dimension.IFitnessDimension.FunctionType.Maximum) {
	    		@Override
	    		protected double internalEvaluate(TransformationSolution solution) {
	    	   		EGraph graph = solution.execute();
	    	   		SmartNursingHome smartNursingHome = (SmartNursingHome) MomotUtil.getRoot(graph);
		  		try {
					return req.eval(smartNursingHome, solution, propagation);
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
	    
	    List<Demand> reqs = levels.get(level);
	    for (Demand req : reqs) {
	    		function.addObjective(makeObjective(req, propagation));
	    }
	    return function;
	}
	
	private static IEGraphMultiDimensionalFitnessFunction currentFitness = null;
	
	private static List<List<Demand>> levels = null;
	
	private static int graphTransformationTimes = 0;
	
	public static FileWriter fw = null;
	
	public static IEGraphMultiDimensionalFitnessFunction getCurrentFitness() {
		return currentFitness;
	}
	
	public static final void init(boolean propagation, int level) {
		resetGraphTransformationTimes();
		levels = DemandFactory.defaultDemands();
		currentFitness = satisfaction(propagation, level);
	}
	
	public static final String evaluate(Population solutions) {
		double tmp = 0;
		
	    
	    List<Demand> reqs = levels.get(0);
	    List<IFitnessDimension<TransformationSolution>> dimensions = new ArrayList<>();
	    for (Demand req : reqs) {
	    		dimensions.add(makeObjective(req, false));
	    }
		
		for (Solution solution : solutions) {
			double cur = dimensions.stream().mapToDouble(d -> d.doEvaluate(solution)).sum();
			if (cur > tmp) tmp = cur;
		}
		String res = graphTransformationTimes + "," + String.format("%.3f", tmp);

		return res;
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
