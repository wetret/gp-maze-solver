package evaluationtree.conditionalnodes;

import java.util.ArrayList;
import java.util.List;

import maze.Maze;
import evaluationtree.IEvaluationNode;
import evaluationtree.IMoveNode;
import evaluationtree.moves.Move;


public class ConditionalNode implements IMoveNode{
    
    private List<IEvaluationNode> evaluationChildren = new ArrayList<IEvaluationNode>();
    private List<IMoveNode> moveChildren = new ArrayList<IMoveNode>(2);

    @Override
    public Move evaluate(Maze pMaze) {
        if (evaluationChildren.get(1).evaluate(pMaze)) {
            return moveChildren.get(1).evaluate(pMaze);
        } else {
            return moveChildren.get(2).evaluate(pMaze);
        }
    }

    @Override
    public String evaluationToString() {
        // TODO Auto-generated method stub
        return null;
    }

}
