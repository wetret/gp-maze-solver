package gp;

import java.util.Collections;
import java.util.List;

import population.Agent;
import utils.AgentComparator;
import utils.Config;


public class Fitness {
    
    public static void calculate(List<Agent> pPopulation) {
        absoluteDistance(pPopulation);
        
        Collections.sort(pPopulation, new AgentComparator());
    }
    
    private static void absoluteDistance(List<Agent> pPopulation){
        for(Agent agent : pPopulation){
            int xGoalDist = Config.DEFAULT.getGoalCordX() - agent.getXCord();
            int yGoalDist = Config.DEFAULT.getGoalCordY() - agent.getYCord();
            int fitness = Math.abs(xGoalDist) + Math.abs(yGoalDist);
            
            agent.setFitness(fitness);
            
            agent.setAgentXCord(Config.DEFAULT.getAgentXCordStart());
            agent.setAgentYCord(Config.DEFAULT.getAgentYCordStart());
            agent.getMaze().setNewAgentCord(Config.DEFAULT.getAgentXCordStart(), Config.DEFAULT.getAgentYCordStart());
        }
    }

}
