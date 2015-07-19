package gp;

import java.util.List;

import population.Agent;
import population.PopulationBuilder;


public class GeneticProgramming {
    
    private List<Agent> mPopulation;
    
    public GeneticProgramming(int pPopulationSize) {
        mPopulation = PopulationBuilder.build(pPopulationSize);
    }
    
    public String evolve(){
        
        print(1);
        
        Crossover.apply(mPopulation);
//        Mutation.apply(mPopulation);
        TestRun.apply(mPopulation);
        Fitness.calculate(mPopulation);
        
        print(2);
        
        // Return the best AgentFunction
        return mPopulation.get(0).getEvaluationTree().evaluationToString();
    }
    
    public void print(int step){
        for(int i = 0; i < mPopulation.size(); i++){
            System.out.println(step + " Fitness: " + mPopulation.get(i).getFitness() + "\nAgentFunction: " + mPopulation.get(i).getEvaluationTree().evaluationToString() + "\n");
        }
    }
    
}
