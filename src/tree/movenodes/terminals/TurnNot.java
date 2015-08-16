package tree.movenodes.terminals;

import java.util.ArrayList;
import java.util.List;

import maze.Maze;
import tree.EOrientation;
import tree.ETurn;
import tree.IMoveNode;
import tree.INode;


public class TurnNot
        implements IMoveNode {

    public TurnNot() {
    }

    @Override
    public ETurn evaluate(Maze pMaze, EOrientation pOrientation) {
        return ETurn.NOT;
    }

    @Override
    public String evaluationToString() {
        return "ETurn.NOT;";
    }

    @Override
    public List<INode> getFlattenedTree() {
        List<INode> nodes = new ArrayList<INode>();
        nodes.add(this);

        return nodes;
    }

    @Override
    public INode getCopy() {
        return new TurnNot();
    }
}
