package gp;

import java.util.List;
import java.util.Random;

import population.Agent;
import tree.IEvaluationNode;
import tree.IMoveNode;
import tree.INode;
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
            
            if(parentOne == null){
                one.setRoot((IMoveNode) crossoverNodeTwo);
                crossoverNodeTwo.setParent(null);
            } else {
                
            }
            
            if(parentTwo == null){
                two.setRoot((IMoveNode) crossoverNodeOne);
                crossoverNodeOne.setParent(null);
            } else {
                
            }
        }
    }
}
