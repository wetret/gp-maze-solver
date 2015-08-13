package tree.movenodes.terminals;

import java.util.ArrayList;
import java.util.List;

import tree.IMoveNode;
import tree.INode;
import tree.Move;
import maze.Maze;


public class MoveSouth
        implements IMoveNode {

    public MoveSouth() {
    }

    @Override
    public Move evaluate(Maze pMaze) {
        return Move.SOUTH;
    }

    @Override
    public String evaluationToString() {
        return "Move.SOUTH;";
    }

    @Override
    public List<INode> getFlattenedTree() {
        List<INode> nodes = new ArrayList<INode>();
        nodes.add(this);

        return nodes;
    }

    @Override
    public INode getCopy() {
        return new MoveSouth();
    }
}
