package tree.movenodes.ternarynodes;

import java.util.ArrayList;
import java.util.List;

import tree.IEvaluationNode;
import tree.IMoveNode;
import tree.INode;
import tree.Move;
import tree.NodeBuilder;
import maze.Maze;


public class ConditionalNode implements IMoveNode{
    
    private IEvaluationNode mEvaluationChild;
    private List<IMoveNode> mMoveChildren;
    private INode mParent;
    
    public ConditionalNode(INode pParent) {
        mMoveChildren = new ArrayList<IMoveNode>(2);
        setParent(pParent);
        setChildren();
    }
    
    private ConditionalNode(ConditionalNode pToCopy){
        List<INode> children = pToCopy.getChildren();
        mEvaluationChild = (IEvaluationNode) children.get(2);
        
        mMoveChildren = new ArrayList<IMoveNode>(2);
        mMoveChildren.add((IMoveNode) children.get(0));
        mMoveChildren.add((IMoveNode) children.get(1));
        mParent = pToCopy.getParent();
    }

    @Override
    public Move evaluate(Maze pMaze) {
        if (mEvaluationChild.evaluate(pMaze)) {
            return mMoveChildren.get(0).evaluate(pMaze);
        } else {
            return mMoveChildren.get(1).evaluate(pMaze);
        }
    }

    @Override
    public String evaluationToString() {
        return "if ( " + mEvaluationChild.evaluationToString() + " ) { " +
                    getString(mMoveChildren.get(0)) +
               " } else { " + 
                   getString(mMoveChildren.get(1)) +
               " }";
    }
    
   private String getString(IMoveNode node){
       if(node instanceof ConditionalNode) {
           return node.evaluationToString();
       } else {
           return "return " + node.evaluationToString();
       }
   }
    
    private void setChildren() {
        for(int i = 0; i < 2; i++){
            mMoveChildren.add(NodeBuilder.getMoveNode(this));
        }
        
        mEvaluationChild = NodeBuilder.getEvaluationNode(this);
    }

    @Override
    public List<INode> getFlattenedTree() {
        List<INode> nodes = new ArrayList<INode>();
        nodes.add(this);
        
        nodes.addAll(mEvaluationChild.getFlattenedTree());
        
        for(IMoveNode moveChild : mMoveChildren){
            nodes.addAll(moveChild.getFlattenedTree());
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
    
    public List<INode> getChildren(){
        List<INode> children = new ArrayList<INode>();
        children.addAll(mMoveChildren);
        children.add(mEvaluationChild);
        
        return children;
    }
    
    public void setChild(int pPosition, INode pNewChild){
        if(pNewChild instanceof IEvaluationNode){
            mEvaluationChild = (IEvaluationNode) pNewChild;
        } else {
            if(pNewChild instanceof IMoveNode){
                mMoveChildren.set(pPosition, (IMoveNode) pNewChild);
                
            }
        }
    }

    @Override
    public INode getCopy() {
        return new ConditionalNode(this);
    }
    
}
