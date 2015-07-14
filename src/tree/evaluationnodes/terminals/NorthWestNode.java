package tree.evaluationnodes.terminals;

import tree.IEvaluationNode;
import maze.Maze;


public class NorthWestNode implements IEvaluationNode {

    @Override
    public boolean evaluate(Maze pMaze) {
        return pMaze.isWallNorthWest();
    }

    @Override
    public String evaluationToString() {
        return "pMaze.isWallNorthWest()";
    }

}
