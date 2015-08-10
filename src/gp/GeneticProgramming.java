package gp;

import java.util.ArrayList;
import java.util.List;
import population.Agent;
import population.PopulationBuilder;


public class GeneticProgramming {

    private List<Agent> mPopulation;
    private int         mPopulationSize;
    private int         mFitnessFunction;

    public GeneticProgramming(int pPopulationSize, int pFitnessFunction, int pMazeNumber) {
        mPopulation = PopulationBuilder.build(pPopulationSize, pMazeNumber);
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

            int i = 0;
            while (newPopulation.size() < mPopulation.size()) {
                newPopulation.addAll(Crossover.apply(mPopulation.get(i).getCopy(), mPopulation.get(i + 1).getCopy()));
                i = i + 2;
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
