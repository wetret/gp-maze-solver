package tree.evaluationnodes.terminals;

import tree.IEvaluationNode;
import maze.Maze;


public class EastNode implements IEvaluationNode {

    @Override
    public boolean evaluate(Maze pMaze) {
       return pMaze.isWallEast();
    }

    @Override
    public String evaluationToString() {
        return "pMaze.isWallEast()";
    }
    
}
