package evaluationtree.evaluationnodes.binarynodes;

import java.util.ArrayList;
import java.util.List;

import maze.Maze;
import evaluationtree.IEvaluationNode;


public class AndNode implements IEvaluationNode{
    

    private List<IEvaluationNode> children = new ArrayList<IEvaluationNode>(2);

    @Override
    public boolean evaluate(Maze pMaze) {
        return children.get(1).evaluate(pMaze) && children.get(2).evaluate(pMaze);
    }

    @Override
    public String evaluationToString() {
        // TODO Auto-generated method stub
        return null;
    }

}
