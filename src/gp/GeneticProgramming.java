package gp;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import maze.Maze;
import population.Agent;
import population.PopulationBuilder;
import tree.NodeBuilder;
import utils.ERandom;


public class GeneticProgramming {

    private List<Agent> mPopulation;
    private Random      rand;
    private int         mPopulationSize;
    private int         mFitnessFunction;

    public GeneticProgramming(int pPopulationSize, int pFitnessFunction, int pMazeNumber) {
        mPopulation = PopulationBuilder.build(pPopulationSize, pMazeNumber);
        rand = ERandom.INSTANCE.getRandom();
        mFitnessFunction = pFitnessFunction;
        mPopulationSize = pPopulationSize;
    }

    public Agent evolve() {
        int generation = 0;

        TestRun.apply(mPopulation);

        Fitness.calculate(mPopulation, mFitnessFunction);

        while (generation < 500) {
            if (generation % 10 == 0) {
                System.out.println("Generation: " + generation + " Best Fitness: " + mPopulation.get(0).getFitness());
            }

            List<Agent> newPopulation = new ArrayList<Agent>(mPopulationSize);

            Reproduction.apply(mPopulation, newPopulation);

            int mazeNumber = mPopulation.get(0).getMaze().getMazeNumber();
            for (int i = 0; i < mPopulation.size() / 10; i++) {
                newPopulation.add(new Agent(NodeBuilder.getMoveNode(), new Maze(mazeNumber)));
            }

            while (newPopulation.size() < mPopulation.size()) {
                int rand1 = rand.nextInt(mPopulationSize);
                int rand2 = rand.nextInt(mPopulationSize);
                newPopulation.add(Crossover.apply(mPopulation.get(rand1).getCopy(), mPopulation.get(rand2).getCopy()));
            }

            Mutation.apply(newPopulation);

            mPopulation = new ArrayList<Agent>(newPopulation);

            TestRun.apply(mPopulation);

            Fitness.calculate(mPopulation, mFitnessFunction);

            generation++;
        }

        // Return the best Agent
        return mPopulation.get(0);
    }

    public void print(int step) {
        for (int i = 0; i < mPopulation.size(); i++) {
            System.out.println(step + " Fitness: " + mPopulation.get(i).getFitness() + "\nAgentFunction: " + mPopulation.get(i).getEvaluationTree().evaluationToString() + "\n");
        }
    }
}
