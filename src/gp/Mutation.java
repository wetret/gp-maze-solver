package gp;

import java.util.List;
import java.util.Random;

import population.Agent;
import tree.IEvaluationNode;
import tree.INode;
import tree.movenodes.ternarynodes.ConditionalNode;
import utils.Config;
import utils.ERandom;

public class Mutation {
    
    public static void apply(List<Agent> pPopulation){
        Random rand = ERandom.INSTANCE.getRandom();
        double splitValue = 0.1;
        
        for(Agent agent : pPopulation){
            double randomDouble = rand.nextDouble();
            
            if(randomDouble < splitValue){
               List<INode> flattenedTree =  agent.getEvaluationTree().getFlattenedTree();
               int size = flattenedTree.size();
               int mutationPoint = rand.nextInt(size);
               
               INode mutationNode = flattenedTree.get(mutationPoint);
               INode parent = mutationNode.getParent();
               
               if(parent != null){
                   if(parent instanceof IEvaluationNode){
                      
                   }
                   if(parent instanceof ConditionalNode){
                       
                   }
               }
            }
        }
    }
}
