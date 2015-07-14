package tree.evaluationnodes.binarynodes;

import java.util.ArrayList;
import java.util.List;

import tree.IEvaluationNode;
import tree.NodeBuilder;
import maze.Maze;


public class OrNode implements IEvaluationNode{
    

    private List<IEvaluationNode> mChildren;
    
    public OrNode() {
        mChildren = new ArrayList<IEvaluationNode>(2);
        setChildren();
    }

    @Override
    public boolean evaluate(Maze pMaze) {
        return mChildren.get(1).evaluate(pMaze) || mChildren.get(2).evaluate(pMaze);
    }

    @Override
    public String evaluationToString() {
       return "( " + mChildren.get(0).evaluationToString() + " || " + mChildren.get(1).evaluationToString() + " )";
    }
    
    private void setChildren() {
        for (int i = 0; i < 2; i++){
            mChildren.add(NodeBuilder.getEvaluationNode());
        }
    }

}
