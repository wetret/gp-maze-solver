package tree.evaluationnodes.terminals;

import java.util.ArrayList;
import java.util.List;

import tree.IEvaluationNode;
import tree.INode;
import maze.Maze;


public class SouthEastNode
        implements IEvaluationNode {

    public SouthEastNode() {
    }

    @Override
    public boolean evaluate(Maze pMaze) {
        return pMaze.isWallSouthEast();
    }

    @Override
    public String evaluationToString() {
        return "pMaze.isWallSouthEast()";
    }

    @Override
    public List<INode> getFlattenedTree() {
        List<INode> nodes = new ArrayList<INode>();
        nodes.add(this);

        return nodes;
    }

    @Override
    public INode getCopy() {
        return new SouthEastNode();
    }
}
