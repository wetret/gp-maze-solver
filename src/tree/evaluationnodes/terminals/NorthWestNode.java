package tree.evaluationnodes.terminals;

import java.util.ArrayList;
import java.util.List;

import tree.IEvaluationNode;
import tree.INode;
import maze.Maze;


public class NorthWestNode implements IEvaluationNode {
    
    public NorthWestNode() {
    }

    @Override
    public boolean evaluate(Maze pMaze) {
        return pMaze.isWallNorthWest();
    }

    @Override
    public String evaluationToString() {
        return "pMaze.isWallNorthWest()";
    }
    
    @Override
    public List<INode> getFlattenedTree() {
        List<INode> nodes = new ArrayList<INode>();
        nodes.add(this);
        
        return nodes;
    }

    @Override
    public INode getCopy() {
        return new NorthWestNode();
    }

}
