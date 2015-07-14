package tree.movenodes.ternarynodes;

import java.util.ArrayList;
import java.util.List;

import tree.IEvaluationNode;
import tree.IMoveNode;
import tree.Move;
import tree.NodeBuilder;
import maze.Maze;


public class ConditionalNode implements IMoveNode{
    
    private IEvaluationNode mEvaluationChild;
    private List<IMoveNode> mMoveChildren;
    
    public ConditionalNode() {
        mMoveChildren = new ArrayList<IMoveNode>(2);
        setChildren();
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
            mMoveChildren.add(NodeBuilder.getMoveNode());
        }
        
        mEvaluationChild = NodeBuilder.getEvaluationNode();
    }
    
}
