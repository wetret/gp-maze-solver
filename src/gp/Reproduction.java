package gp;

import java.util.List;

import population.Agent;


public class Reproduction {
    
    public static void apply(List<Agent> pOldPopulation, List<Agent> pNewPopulation){
        
        for(int i = 0; i < (pOldPopulation.size() / 10); i++){
            pNewPopulation.add(pOldPopulation.get(i).getCopy());
        }
        
    }

}
