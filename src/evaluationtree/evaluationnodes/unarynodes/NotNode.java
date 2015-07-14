package evaluationtree.evaluationnodes.unarynodes;

import java.util.ArrayList;
import java.util.List;

import maze.Maze;
import evaluationtree.IEvaluationNode;
import evaluationtree.IMoveNode;
import evaluationtree.moves.Move;


public class NotNode implements IEvaluationNode{
    

    private List<IEvaluationNode> children = new ArrayList<IEvaluationNode>(1);

    @Override
    public boolean evaluate(Maze pMaze) {
        return !children.get(1).evaluate(pMaze);
    }

    @Override
    public String evaluationToString() {
        // TODO Auto-generated method stub
        return null;
    }

}
