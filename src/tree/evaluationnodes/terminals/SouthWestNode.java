package tree.evaluationnodes.terminals;

import java.util.ArrayList;
import java.util.List;

import tree.IEvaluationNode;
import tree.INode;
import maze.Maze;


public class SouthWestNode
        implements IEvaluationNode {

    public SouthWestNode() {
    }

    @Override
    public boolean evaluate(Maze pMaze) {
        return pMaze.isWallSouthWest();
    }

    @Override
    public String evaluationToString() {
        return "pMaze.isWallSouthWest()";
    }

    @Override
    public List<INode> getFlattenedTree() {
        List<INode> nodes = new ArrayList<INode>();
        nodes.add(this);

        return nodes;
    }

    @Override
    public INode getCopy() {
        return new SouthWestNode();
    }
}
