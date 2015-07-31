package tree.evaluationnodes.binarynodes;

import java.util.ArrayList;
import java.util.List;

import tree.IEvaluationNode;
import tree.IEvaluationNonTerminal;
import tree.INode;
import tree.NodeBuilder;
import maze.Maze;


public class OrNode implements IEvaluationNode, IEvaluationNonTerminal{
    

    private List<IEvaluationNode> mChildren;
    
    public OrNode() {
        mChildren = new ArrayList<IEvaluationNode>(2);
        setChildren();
    }
    
    // Copy constructor
    private OrNode(OrNode pToCopy){
        mChildren = new ArrayList<IEvaluationNode>(2);
        mChildren.add((IEvaluationNode) pToCopy.getChildren().get(0).getCopy());
        mChildren.add((IEvaluationNode) pToCopy.getChildren().get(1).getCopy());
    }

    @Override
    public boolean evaluate(Maze pMaze) {
        return mChildren.get(0).evaluate(pMaze) || mChildren.get(1).evaluate(pMaze);
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
    public List<IEvaluationNode> getChildren() {
        return mChildren;
    }
    
    @Override
    public void setChild(int pPosition, IEvaluationNode pNewChild) {
        mChildren.set(pPosition, pNewChild);
    }

    @Override
    public INode getCopy() {
       return new OrNode(this);
    }

}
