package tree.evaluationnodes.terminals;

import tree.IEvaluationNode;
import maze.Maze;


public class SouthNode implements IEvaluationNode {

    @Override
    public boolean evaluate(Maze pMaze) {
        return pMaze.isWallSouth();
    }

    @Override
    public String evaluationToString() {
        return "pMaze.isWallSouth()";
    }

}
