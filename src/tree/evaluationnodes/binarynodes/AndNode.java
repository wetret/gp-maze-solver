package tree.evaluationnodes.binarynodes;

import java.util.ArrayList;
import java.util.List;

import tree.EOrientation;
import tree.IEvaluationNode;
import tree.IEvaluationNonTerminal;
import tree.INode;
import tree.NodeBuilder;
import maze.Maze;


public class AndNode
        implements IEvaluationNode, IEvaluationNonTerminal {

    private List<IEvaluationNode> mChildren;

    public AndNode() {
        mChildren = new ArrayList<IEvaluationNode>(2);
        setChildren();
    }

    // Copy constructor
    private AndNode(AndNode pToCopy) {
        mChildren = new ArrayList<IEvaluationNode>(2);
        mChildren.add((IEvaluationNode) pToCopy.getChildren().get(0).getCopy());
        mChildren.add((IEvaluationNode) pToCopy.getChildren().get(1).getCopy());
    }

    @Override
    public boolean evaluate(Maze pMaze, EOrientation pOrientation) {
        return mChildren.get(0).evaluate(pMaze, pOrientation) && mChildren.get(1).evaluate(pMaze, pOrientation);
    }

    @Override
    public String evaluationToString() {
        return "( " + mChildren.get(0).evaluationToString() + " && " + mChildren.get(1).evaluationToString() + " )";
    }

    private void setChildren() {
        for (int i = 0; i < 2; i++) {
            mChildren.add(NodeBuilder.getEvaluationNode());
        }
    }

    @Override
    public List<INode> getFlattenedTree() {
        List<INode> nodes = new ArrayList<INode>();
        nodes.add(this);

        for (IEvaluationNode child : mChildren) {
            nodes.addAll(child.getFlattenedTree());
        }

        return nodes;
    }

    @Override
    public List<IEvaluationNode> getChildren() {
        return mChildren;
    }

    @Override
    public void setChild(int pPosition, IEvaluationNode pNewChild) {
        mChildren.set(pPosition, pNewChild);
    }

    @Override
    public INode getCopy() {
        return new AndNode(this);
    }
}
