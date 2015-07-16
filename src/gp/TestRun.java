package gp;

import java.util.List;

import population.Agent;
import utils.Config;


public class TestRun {

    public static void apply(List<Agent> pPopulation) {
        for(Agent agent : pPopulation){
            for(int i = 0; i < Config.DEFAULT.getMaxMoves(); i++){
                agent.move();
            }
        }
    }
}
