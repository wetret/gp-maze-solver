package gp;

import java.util.List;
import java.util.Random;

import population.Agent;
import tree.IEvaluationNode;
import tree.INode;
import tree.NodeBuilder;
import tree.evaluationnodes.binarynodes.AndNode;
import tree.evaluationnodes.binarynodes.OrNode;
import tree.evaluationnodes.unarynodes.NotNode;
import tree.movenodes.ternarynodes.ConditionalNode;
import utils.Config;
import utils.ERandom;

public class Mutation {
    
    public static void apply(List<Agent> pPopulation){
        Random rand = ERandom.INSTANCE.getRandom();
        double mutationPercentage = Config.DEFAULT.getMutationPercentage();
        
        for(Agent agent : pPopulation){
            double randomDouble = rand.nextDouble();
            
            if(randomDouble < mutationPercentage){
               List<INode> flattenedTree =  agent.getEvaluationTree().getFlattenedTree();
               int size = flattenedTree.size();
               int mutationPoint = rand.nextInt(size);
               
               INode mutationNode = flattenedTree.get(mutationPoint);
               INode parent = mutationNode.getParent();
               
               if(parent != null){
                   if(parent instanceof IEvaluationNode){
                       if(parent instanceof NotNode){
                          ((NotNode) parent).setChild(NodeBuilder.getEvaluationNode(parent));
                          System.out.println("NotNode\n");
                       } else if(parent instanceof AndNode){
                           List<IEvaluationNode> parentChildren = ((AndNode) parent).getChildren();
                           int index = 0;
                           while(mutationNode != parentChildren.get(index)){
                               index++;
                           }
                           
                           ((AndNode) parent).setChild(index, NodeBuilder.getEvaluationNode(parent));
                           System.out.println(index+1  + ". AndNode\n");
                       } else {
                           List<IEvaluationNode> parentChildren = ((OrNode) parent).getChildren();
                           int index = 0;
                           while(mutationNode != parentChildren.get(index)){
                               index++;
                           }
                           
                           ((OrNode) parent).setChild(index, NodeBuilder.getEvaluationNode(parent));
                           System.out.println(index+1 + ". OrNode\n");
                       }
                   }
                   if(parent instanceof ConditionalNode){
                       List<INode> parentChildren = ((ConditionalNode) parent).getChildren();
                       int index = 0;
                       while(mutationNode != parentChildren.get(index)){
                           index++;
                       }
                       
                       INode replaceChild = parentChildren.get(index);
                       INode newChild;
                       if(replaceChild instanceof IEvaluationNode){
                           newChild = NodeBuilder.getEvaluationNode(parent);
                       } else {
                           newChild = NodeBuilder.getMoveNode(parent);
                       }
                       
                       ((ConditionalNode) parent).setChild(index, newChild);
                       System.out.println(index+1  + ". ConditionalNode\n");
                   }
               } else {
                   // selected node is root -> mutation on root
                   agent.setRoot(NodeBuilder.getMoveNode(null));
                   System.out.println("Root\n");
               }
            }
        }
    }
}
