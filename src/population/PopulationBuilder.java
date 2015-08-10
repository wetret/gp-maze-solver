package population;

import java.util.ArrayList;
import java.util.List;

import maze.Maze;
import tree.IMoveNode;
import tree.TreeBuilder;


public class PopulationBuilder {

    public static List<Agent> build(int pPopulationSize, int pMazeNumber) {
        List<Agent> population = new ArrayList<Agent>(pPopulationSize);

        for (int i = 0; i < pPopulationSize; i++) {
            IMoveNode root = new TreeBuilder().build();
            Maze maze = new Maze(pMazeNumber);

            Agent agent = new Agent(root, maze);
            population.add(agent);
        }

        return population;
    }
}
