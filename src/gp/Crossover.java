package gp;

import java.util.List;
import java.util.Random;

import population.Agent;
import tree.IEvaluationNode;
import tree.IEvaluationNonTerminal;
import tree.IMoveNode;
import tree.INode;
import tree.movenodes.ternarynodes.ConditionalNode;
import utils.ERandom;


public class Crossover {

    public static void apply(List<Agent> pPopulation){
       
        for(int i = 0; i < pPopulation.size(); i = i + 2){
            Random rand = ERandom.INSTANCE.getRandom();
            
            Agent one = pPopulation.get(i);
            Agent two = pPopulation.get(i+1);
            
            List<INode> flattenedTreeOne = one.getEvaluationTree().getFlattenedTree();
            List<INode> flattenedTreeTwo = two.getEvaluationTree().getFlattenedTree();
            
            boolean notSame = true;
            
            INode crossoverNodeOne = null;
            INode crossoverNodeTwo = null;
            
            while(notSame){  
                int randOne = rand.nextInt(flattenedTreeOne.size());
                crossoverNodeOne = flattenedTreeOne.get(randOne);
                
                int randTwo = rand.nextInt(flattenedTreeTwo.size());
                crossoverNodeTwo = flattenedTreeTwo.get(randTwo);
                
                if(crossoverNodeOne instanceof IMoveNode && crossoverNodeTwo instanceof IMoveNode){
                    notSame = false;
                }
                
                if(crossoverNodeOne instanceof IEvaluationNode && crossoverNodeTwo instanceof IEvaluationNode){
                    notSame = false;
                }
            }
            
            INode parentOne = crossoverNodeOne.getParent();
            INode parentTwo = crossoverNodeTwo.getParent();
            INode parentTwoCopy = null;
            
            if(parentTwo != null){    
                parentTwoCopy = parentTwo.getCopy();
            }
            
            if(parentOne == null){
                one.setRoot((IMoveNode) crossoverNodeTwo);
                crossoverNodeTwo.setParent(null);
            } else {
                if(parentOne instanceof ConditionalNode){
                    
                    List<INode> children = ((ConditionalNode) parentOne).getChildren();
                    int index = 0;
                    while(crossoverNodeOne != children.get(index)){
                        index++;
                    }
                    
                    ((ConditionalNode) parentOne).setChild(index, crossoverNodeTwo);
                    crossoverNodeTwo.setParent(parentOne);
                } else {
                    List<IEvaluationNode> children = ((IEvaluationNonTerminal) parentOne).getChildren();
                    int index = 0;
                    while(crossoverNodeOne != children.get(index)){
                        index++;
                    }
                    
                    ((IEvaluationNonTerminal) parentOne).setChild(index, (IEvaluationNode) crossoverNodeTwo);
                    crossoverNodeTwo.setParent(parentOne);
                }    
            }
            
            if(parentTwoCopy == null){
                two.setRoot((IMoveNode) crossoverNodeOne);
                crossoverNodeOne.setParent(null);
            } else {
                if(parentTwo instanceof ConditionalNode){
                    
                    List<INode> children = ((ConditionalNode) parentTwo).getChildren();
                    int index = 0;
                    while(crossoverNodeTwo != children.get(index)){
                        index++;
                    }
                    
                    ((ConditionalNode) parentTwo).setChild(index, crossoverNodeOne);
                    crossoverNodeOne.setParent(parentTwo);
                } else {
                    List<IEvaluationNode> children = ((IEvaluationNonTerminal) parentTwo).getChildren();
                    int index = 0;
                    while(crossoverNodeTwo != children.get(index)){
                        index++;
                    }
                    
                    ((IEvaluationNonTerminal) parentTwo).setChild(index, (IEvaluationNode) crossoverNodeOne);
                    crossoverNodeOne.setParent(parentTwo);
                }    
            }
        }
    }
}
