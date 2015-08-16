package tree.evaluationnodes.terminals;

import java.util.ArrayList;
import java.util.List;

import maze.Maze;
import tree.EOrientation;
import tree.IEvaluationNode;
import tree.INode;


public class WallRightAhead
        implements IEvaluationNode {

    public WallRightAhead() {
    }

    @Override
    public boolean evaluate(Maze pMaze, EOrientation pOrientation) {
        return pMaze.isWallRightAhead(pOrientation);
    }

    @Override
    public String evaluationToString() {
        return "pMaze.isWallRightAhead(pOrientation)";
    }

    @Override
    public List<INode> getFlattenedTree() {
        List<INode> nodes = new ArrayList<INode>();
        nodes.add(this);

        return nodes;
    }

    @Override
    public INode getCopy() {
        return new WallRightAhead();
    }
}
