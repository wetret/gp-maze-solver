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
        
//        Crossover.apply(mPopulation);
//        Mutation.apply(mPopulation);
        TestRun.apply(mPopulation);
        Fitness.calculate(mPopulation);
        
        print();
        
        // Return the best AgentFunction
        return mPopulation.get(0).getEvaluationTree().evaluationToString();
    }
    
    public void print(){
        for(int i = 0; i < mPopulation.size(); i++){
            System.out.println("Fitness: " + mPopulation.get(i).getFitness() + "\nAgentFunction: " + mPopulation.get(i).getEvaluationTree().evaluationToString() + "\n");
        }
    }
    
}
