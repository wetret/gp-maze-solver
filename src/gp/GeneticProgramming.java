package gp;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import population.Agent;
import population.PopulationBuilder;
import utils.ERandom;


public class GeneticProgramming {
    
    private List<Agent> mPopulation;
    private Random rand;
    
    public GeneticProgramming(int pPopulationSize) {
        mPopulation = PopulationBuilder.build(pPopulationSize);
        rand = ERandom.INSTANCE.getRandom();
    }
    
    public Agent evolve(){
        int generation = 0;
        
        TestRun.apply(mPopulation);
        Fitness.calculate(mPopulation);
        
        while(mPopulation.get(0).getFitness() != 0) { 
            if(generation % 100 == 0){
                System.out.println("Generation: " + generation + " Best Fitness: " + mPopulation.get(0).getFitness() /**/+ " " +  mPopulation.get(0).getEvaluationTree().evaluationToString()/**/);
            }
            
            List<Agent> newPopulation = new ArrayList<Agent>();
            
            Reproduction.apply(mPopulation, newPopulation);
            while(newPopulation.size() < mPopulation.size()){
               int rand1 = rand.nextInt(mPopulation.size());
               int rand2 = rand.nextInt(mPopulation.size());
               newPopulation.add(Crossover.apply(mPopulation.get(rand1).getCopy(), mPopulation.get(rand2).getCopy()));
            }
            Mutation.apply(newPopulation);
            
            mPopulation = new ArrayList<Agent>(newPopulation);
            
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
