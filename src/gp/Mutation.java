package gp;

import java.util.List;
import java.util.Random;

import population.Agent;
import tree.IEvaluationNode;
import tree.IEvaluationNonTerminal;
import tree.IMoveNode;
import tree.INode;
import tree.NodeBuilder;
import tree.evaluationnodes.unarynodes.NotNode;
import tree.movenodes.ternarynodes.ConditionalNode;
import utils.Config;
import utils.ERandom;


public class Mutation {

    public static void apply(List<Agent> pPopulation) {
        Random rand = ERandom.INSTANCE.getRandom();
        double mutationPercentage = Config.DEFAULT.getMutationPercentage();

        for (Agent agent : pPopulation) {
            double randomDouble = rand.nextDouble();

            if (randomDouble < mutationPercentage) {
                List<INode> flattenedTree = agent.getEvaluationTree().getFlattenedTree();
                int size = flattenedTree.size();

                int mutationPoint = rand.nextInt(size);
                boolean noNodeWithChildren = true;

                while (noNodeWithChildren) {
                    if ((flattenedTree.get(mutationPoint) instanceof ConditionalNode) ||
                            (flattenedTree.get(mutationPoint) instanceof IEvaluationNonTerminal) || size == 1) {
                        noNodeWithChildren = false;
                    } else {
                        mutationPoint = rand.nextInt(size);
                    }
                }

                INode mutationNode = flattenedTree.get(mutationPoint);

                if (size == 1) {
                    agent.setRoot(NodeBuilder.getMoveNode());
                } else if (mutationNode instanceof ConditionalNode) {
                    int childMutationPoint = rand.nextInt(3);
                    List<INode> children = ((ConditionalNode) mutationNode).getChildren();

                    if (children.get(childMutationPoint) instanceof IMoveNode) {
                        int position = rand.nextInt(2);
                        IMoveNode newChild = NodeBuilder.getMoveNode();
                        ((ConditionalNode) mutationNode).setChild(position, newChild);
                    } else {
                        IEvaluationNode newChild = NodeBuilder.getEvaluationNode();
                        ((ConditionalNode) mutationNode).setChild(childMutationPoint, newChild);
                    }
                } else if (mutationNode instanceof IEvaluationNonTerminal) {
                    if (mutationNode instanceof NotNode) {
                        ((NotNode) mutationNode).setChild(0, NodeBuilder.getEvaluationNode());
                    } else {
                        int childMutationPoint = rand.nextInt(2);
                        ((IEvaluationNonTerminal) mutationNode).setChild(childMutationPoint, NodeBuilder.getEvaluationNode());
                    }
                } else {
                    // selected node is terminal and has no children -> should not happen
                }
            }
        }
    }
}
