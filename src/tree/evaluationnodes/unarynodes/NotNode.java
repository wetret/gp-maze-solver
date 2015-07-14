package tree.evaluationnodes.unarynodes;

import tree.IEvaluationNode;
import tree.NodeBuilder;
import maze.Maze;


public class NotNode implements IEvaluationNode{
    

    private IEvaluationNode child;
    
    public NotNode() {
        child = NodeBuilder.getEvaluationNode();
    }

    @Override
    public boolean evaluate(Maze pMaze) {
        return !child.evaluate(pMaze);
    }

    @Override
    public String evaluationToString() {
        return " !( " + child.evaluationToString() + " )";
    }

}
