package evaluationtree.evaluationnodes.terminals;

import evaluationtree.IEvaluationNode;
import maze.Maze;


public class NorthNode implements IEvaluationNode {

    @Override
    public boolean evaluate(Maze pMaze) {
        return pMaze.isWallNorth();
    }

    @Override
    public String evaluationToString() {
        // TODO Auto-generated method stub
        return null;
    }

}
