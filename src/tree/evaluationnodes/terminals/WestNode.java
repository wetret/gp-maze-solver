package tree.evaluationnodes.terminals;

import tree.IEvaluationNode;
import maze.Maze;


public class WestNode implements IEvaluationNode {

    @Override
    public boolean evaluate(Maze pMaze) {
        return pMaze.isWallWest();
    }

    @Override
    public String evaluationToString() {
       return "pMaze.isWallWest()";
    }

}
