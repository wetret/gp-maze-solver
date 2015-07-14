package evaluationtree.evaluationnodes.terminals;

import evaluationtree.IEvaluationNode;
import maze.Maze;


public class SouthEastNode implements IEvaluationNode {

    @Override
    public boolean evaluate(Maze pMaze) {
        return pMaze.isWallSouthEast();
    }

    @Override
    public String evaluationToString() {
        // TODO Auto-generated method stub
        return null;
    }

}
