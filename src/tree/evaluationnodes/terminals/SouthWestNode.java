package tree.evaluationnodes.terminals;

import tree.IEvaluationNode;
import maze.Maze;


public class SouthWestNode implements IEvaluationNode {

    @Override
    public boolean evaluate(Maze pMaze) {
        return pMaze.isWallSouthWest();
    }

    @Override
    public String evaluationToString() {
        return "pMaze.isWallSouthWest()";
    }

}
