package tree.evaluationnodes.unarynodes;

import java.util.ArrayList;
import java.util.List;

import tree.IEvaluationNode;
import tree.INode;
import tree.NodeBuilder;
import maze.Maze;


public class NotNode implements IEvaluationNode{
    

    private List<IEvaluationNode> mChildren;
    private INode mParent;
    
    public NotNode(INode pParent) {
        mChildren = new ArrayList<IEvaluationNode>(1);
        setParent(pParent);
        setChildren();
    }
    
    private void setChildren() {
        mChildren.add(NodeBuilder.getEvaluationNode(this));
    }

    @Override
    public boolean evaluate(Maze pMaze) {
        return !mChildren.get(0).evaluate(pMaze);
    }

    @Override
    public String evaluationToString() {
        return "!( " + mChildren.get(0).evaluationToString() + " )";
    }
    
    @Override
    public List<INode> getFlattenedTree() {
        List<INode> nodes = new ArrayList<INode>();
        nodes.add(this);
        
        nodes.addAll(mChildren.get(0).getFlattenedTree());
        
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
