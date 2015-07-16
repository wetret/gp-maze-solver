package utils;

import java.util.Comparator;

import population.Agent;


public class AgentComparator implements Comparator<Agent>{

    @Override
    public int compare(Agent one, Agent two) {
        return one.getFitness() - two.getFitness();
    }
}
