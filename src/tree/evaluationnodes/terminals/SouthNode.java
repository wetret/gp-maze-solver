package tree.evaluationnodes.terminals;

import java.util.ArrayList;
import java.util.List;

import tree.IEvaluationNode;
import tree.INode;
import maze.Maze;


public class SouthNode implements IEvaluationNode {
    
    private INode mParent;
    
    public SouthNode(INode pParent) {
       setParent(pParent);
    }

    @Override
    public boolean evaluate(Maze pMaze) {
        return pMaze.isWallSouth();
    }

    @Override
    public String evaluationToString() {
        return "pMaze.isWallSouth()";
    }
    
    @Override
    public List<INode> getFlattenedTree() {
        List<INode> nodes = new ArrayList<INode>();
        nodes.add(this);
        
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
