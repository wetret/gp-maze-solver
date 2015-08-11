package gp;

import java.util.Collections;
import java.util.List;

import population.Agent;
import utils.AgentComparator;
import utils.Config;


public class Fitness {

    public static void calculate(List<Agent> pPopulation, int pFitnessFunction) {
        if (pFitnessFunction == 1) {
            absoluteDistance(pPopulation);
        } else if (pFitnessFunction == 2) {
            breadcrumbs(pPopulation);
        } else if (pFitnessFunction == 3) {
            countOfMoves(pPopulation);
        }

        Collections.sort(pPopulation, new AgentComparator());
    }

    private static void absoluteDistance(List<Agent> pPopulation) {
        for (Agent agent : pPopulation) {
            int xGoalDist = Config.DEFAULT.getGoalCordX() - agent.getXCord();
            int yGoalDist = Config.DEFAULT.getGoalCordY() - agent.getYCord();
            int fitness = -1 * (Math.abs(xGoalDist) + Math.abs(yGoalDist));

            agent.setFitness(fitness);

            agent.resetValues();
        }
    }

    private static void countOfMoves(List<Agent> pPopulation) {
        for (Agent agent : pPopulation) {
            int fitness;
            if (agent.isGoalReached()) {
                fitness = Config.DEFAULT.getMaxMoves() - agent.getStepsTaken();
            } else {
                fitness = agent.getStepsTaken() - Config.DEFAULT.getMaxMoves();
            }

            agent.setFitness(fitness);

            agent.resetValues();
        }
    }

    private static void breadcrumbs(List<Agent> pPopulation) {
        for (Agent agent : pPopulation) {
            int fitness = agent.getCollectedWayPoints();

            agent.setFitness(fitness);

            agent.resetValues();
        }
    }
}
