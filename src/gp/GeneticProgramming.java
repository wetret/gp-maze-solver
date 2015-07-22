package gp;

import java.util.List;

import population.Agent;
import population.PopulationBuilder;


public class GeneticProgramming {
    
    private List<Agent> mPopulation;
    
    public GeneticProgramming(int pPopulationSize) {
        mPopulation = PopulationBuilder.build(pPopulationSize);
    }
    
    public Agent evolve(){
        int generation = 0;
        
        TestRun.apply(mPopulation);
        Fitness.calculate(mPopulation);
        
        while(mPopulation.get(0).getFitness() != 0) { 
            if(generation % 1000 == 0){
                System.out.println("Generation: " + generation + " Best Fitness: " + mPopulation.get(0).getFitness());
            }
            
            Crossover.apply(mPopulation);
            Mutation.apply(mPopulation);
            TestRun.apply(mPopulation);
            Fitness.calculate(mPopulation);
            
            generation++;
        }
        
        // Return the best Agent
        return mPopulation.get(0);
    }
    
    public void print(int step){
        for(int i = 0; i < mPopulation.size(); i++){
            System.out.println(step + " Fitness: " + mPopulation.get(i).getFitness() + "\nAgentFunction: " + mPopulation.get(i).getEvaluationTree().evaluationToString() + "\n");
        }
    }
    
}
