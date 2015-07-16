package tree.evaluationnodes.binarynodes;

import java.util.ArrayList;
import java.util.List;

import tree.IEvaluationNode;
import tree.INode;
import tree.NodeBuilder;
import maze.Maze;


public class AndNode implements IEvaluationNode{
    

    private List<IEvaluationNode> mChildren;
    private INode mParent;
    
    public AndNode(INode pParent) {
        mChildren = new ArrayList<IEvaluationNode>(2);
        setParent(pParent);
        setChildren();
    }

    @Override
    public boolean evaluate(Maze pMaze) {
        return mChildren.get(0).evaluate(pMaze) && mChildren.get(1).evaluate(pMaze);
    }

    @Override
    public String evaluationToString() {
        return "( " + mChildren.get(0).evaluationToString() + " && " + mChildren.get(1).evaluationToString() + " )";
    }
    
    private void setChildren() {
        for (int i = 0; i < 2; i++){
            mChildren.add(NodeBuilder.getEvaluationNode(this));
        }
    }
    
    @Override
    public List<INode> getFlattenedTree() {
        List<INode> nodes = new ArrayList<INode>();
        nodes.add(this);
        
        for(IEvaluationNode child : mChildren){
            nodes.addAll(child.getFlattenedTree());
        }
        
        return nodes;
    }

    @Override
    public INode getParent() {
        return mParent;
    }

    @Override
    public void setParent(INode pParent) {
        mParent = pParent;
    }

}
