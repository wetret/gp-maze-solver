package tree.evaluationnodes.terminals;

import tree.IEvaluationNode;
import maze.Maze;


public class NorthEastNode implements IEvaluationNode {

    @Override
    public boolean evaluate(Maze pMaze) {
        return pMaze.isWallNorthEast();
    }

    @Override
    public String evaluationToString() {
        return "pMaze.isWallNorthEast()";
    }

}
