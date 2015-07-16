package tree.movenodes.terminals;

import java.util.ArrayList;
import java.util.List;

import tree.IMoveNode;
import tree.INode;
import tree.Move;
import maze.Maze;


public class MoveNorth implements IMoveNode{
    
    private INode mParent;
    
    public MoveNorth(INode pParent) {
        setParent(pParent);
    }

    @Override
    public Move evaluate(Maze pMaze) {
        return Move.NORTH;
    }

    @Override
    public String evaluationToString() {
        return "Move.NORTH;";
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
