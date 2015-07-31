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

    public static Agent apply(Agent one, Agent two) {

        Random rand = ERandom.INSTANCE.getRandom();

        List<INode> flattenedTreeOne = one.getEvaluationTree().getFlattenedTree();
        List<INode> flattenedTreeTwo = two.getEvaluationTree().getFlattenedTree();

        int size = flattenedTreeOne.size();

        INode crossoverNodeOne = null;
        INode crossoverNodeTwo = null;
        int randOne;
        int randTwo;

        if (size != 1) {
            boolean notSame = true;
            while(notSame){  
                randOne = rand.nextInt(flattenedTreeOne.size());
                crossoverNodeOne = flattenedTreeOne.get(randOne);
                
                randTwo = rand.nextInt(flattenedTreeTwo.size());
                crossoverNodeTwo = flattenedTreeTwo.get(randTwo);
                
                if(crossoverNodeOne instanceof ConditionalNode){
                    notSame = false;
                }
                
                if(crossoverNodeOne instanceof IEvaluationNonTerminal && crossoverNodeTwo instanceof IEvaluationNode){
                    notSame = false;
                }
            }
            
            if(crossoverNodeOne instanceof ConditionalNode){
                if(crossoverNodeTwo instanceof IMoveNode){
                    int position = rand.nextInt(2);
                    ((ConditionalNode) crossoverNodeOne).setChild(position, crossoverNodeTwo);
                } else {
                    ((ConditionalNode) crossoverNodeOne).setChild(3, crossoverNodeTwo);
                }
            } else {
                int position = rand.nextInt(((IEvaluationNonTerminal) crossoverNodeOne).getChildren().size());
                ((IEvaluationNonTerminal) crossoverNodeOne).setChild(position, (IEvaluationNode) crossoverNodeTwo);
            }
           
        } else {
            while (!(crossoverNodeTwo instanceof IMoveNode)) {
                randTwo = rand.nextInt(flattenedTreeTwo.size());
                crossoverNodeTwo = flattenedTreeTwo.get(randTwo);

            }

            one.setRoot((IMoveNode) crossoverNodeTwo);
        }

        return one;
    }
}
