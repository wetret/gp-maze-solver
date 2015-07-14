package tree.evaluationnodes.terminals;

import tree.IEvaluationNode;
import maze.Maze;


public class SouthEastNode implements IEvaluationNode {

    @Override
    public boolean evaluate(Maze pMaze) {
        return pMaze.isWallSouthEast();
    }

    @Override
    public String evaluationToString() {
        return "pMaze.isWallSouthEast()";
    }

}
