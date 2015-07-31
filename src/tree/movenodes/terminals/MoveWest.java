package tree.movenodes.terminals;

import java.util.ArrayList;
import java.util.List;

import tree.IMoveNode;
import tree.INode;
import tree.Move;
import maze.Maze;


public class MoveWest implements IMoveNode{
    
    public MoveWest(){
    }

    @Override
    public Move evaluate(Maze pMaze) {
        return Move.WEST;
    }

    @Override
    public String evaluationToString() {
        return "Move.WEST;";
    }

    @Override
    public List<INode> getFlattenedTree() {
        List<INode> nodes = new ArrayList<INode>();
        nodes.add(this);
        
        return nodes;
    }

    @Override
    public INode getCopy() {
        return new MoveWest();
    }

}
