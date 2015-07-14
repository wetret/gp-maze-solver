package tree.evaluationnodes.terminals;

import tree.IEvaluationNode;
import maze.Maze;


public class NorthNode implements IEvaluationNode {

    @Override
    public boolean evaluate(Maze pMaze) {
        return pMaze.isWallNorth();
    }

    @Override
    public String evaluationToString() {
        return "pMaze.isWallNorth()";
    }

}
