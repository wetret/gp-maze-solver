package gp;

import java.util.List;

import population.Agent;
import population.PopulationBuilder;


public class GeneticProgramming {
    
    List<Agent> mPopulation;
    
    public GeneticProgramming(int pPopulationSize) {
        mPopulation = PopulationBuilder.build(pPopulationSize);
    }
    
    public void evolve(){
        
    }
}
