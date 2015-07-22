package gp;

import java.util.Collections;
import java.util.List;

import population.Agent;
import utils.AgentComparator;
import utils.Config;


public class Fitness {
    
    public static void calculate(List<Agent> pPopulation) {
        for(Agent agent : pPopulation){
            int xGoalDist = Config.DEFAULT.getGoalCordX() - agent.getXCord();
            int yGoalDist = Config.DEFAULT.getGoalCordY() - agent.getYCord();
            int fitness = xGoalDist*xGoalDist + yGoalDist*yGoalDist;
            
            agent.setFitness(fitness);
            
            agent.setAgentXCord(Config.DEFAULT.getAgentXCordStart());
            agent.setAgentYCord(Config.DEFAULT.getAgentYCordStart());
            agent.getMaze().setNewAgentCord(Config.DEFAULT.getAgentXCordStart(), Config.DEFAULT.getAgentYCordStart());
        }
        
        Collections.sort(pPopulation, new AgentComparator());
    }

}
