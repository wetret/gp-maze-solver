package evaluationtree.evaluationnodes.terminals;

import evaluationtree.IEvaluationNode;
import maze.Maze;


public class EastNode implements IEvaluationNode {

    @Override
    public boolean evaluate(Maze pMaze) {
       return pMaze.isWallEast();
    }

    @Override
    public String evaluationToString() {
        // TODO Auto-generated method stub
        return null;
    }
    
}
