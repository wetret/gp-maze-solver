package tree.movenodes.terminals;

import java.util.ArrayList;
import java.util.List;

import maze.Maze;
import tree.EOrientation;
import tree.ETurn;
import tree.IMoveNode;
import tree.INode;


public class TurnLeft
        implements IMoveNode {

    public TurnLeft() {
    }

    @Override
    public ETurn evaluate(Maze pMaze, EOrientation pOrientation) {
        return ETurn.LEFT;
    }

    @Override
    public String evaluationToString() {
        return "ETurn.LEFT;";
    }

    @Override
    public List<INode> getFlattenedTree() {
        List<INode> nodes = new ArrayList<INode>();
        nodes.add(this);

        return nodes;
    }

    @Override
    public INode getCopy() {
        return new TurnLeft();
    }
}
