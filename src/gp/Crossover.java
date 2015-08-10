package gp;

import java.util.ArrayList;
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

    public static List<Agent> apply(Agent one, Agent two) {
        Random rand = ERandom.INSTANCE.getRandom();
        List<Agent> newAgents = new ArrayList<Agent>(2);

        List<INode> flattenedTreeOne = one.getEvaluationTree().getFlattenedTree();
        int sizeOne = flattenedTreeOne.size();
        List<INode> flattenedTreeTwo = two.getEvaluationTree().getFlattenedTree();
        int sizeTwo = flattenedTreeTwo.size();

        INode crossOverNodeOne = flattenedTreeOne.get(rand.nextInt(sizeOne));
        INode crossOverNodeTwo = flattenedTreeTwo.get(rand.nextInt(sizeTwo));
        
        if(sizeOne == 1 && sizeTwo == 1 ){
           one.setRoot((IMoveNode) crossOverNodeTwo.getCopy()); 
           two.setRoot((IMoveNode) crossOverNodeOne.getCopy());
        } else {
            if(sizeOne == 1 && sizeTwo > 1){
                while(!(crossOverNodeTwo instanceof ConditionalNode)){
                    crossOverNodeTwo = flattenedTreeTwo.get(rand.nextInt(sizeTwo));
                }
                
                int position = rand.nextInt(2);
                one.setRoot((IMoveNode) ((ConditionalNode) crossOverNodeTwo).getChildren().get(position).getCopy());
                ((ConditionalNode) crossOverNodeTwo).setChild(position, crossOverNodeOne.getCopy());
            } else if(sizeOne > 1 && sizeTwo == 1){
                while(!(crossOverNodeOne instanceof ConditionalNode)){
                    crossOverNodeOne = flattenedTreeOne.get(rand.nextInt(sizeOne));
                }
                
                int position = rand.nextInt(2);
                two.setRoot((IMoveNode) ((ConditionalNode) crossOverNodeOne).getChildren().get(position).getCopy());
                ((ConditionalNode) crossOverNodeOne).setChild(position, crossOverNodeTwo.getCopy());
            } else {
                boolean notSame = true;
                while(notSame){
                    if(crossOverNodeOne instanceof ConditionalNode && crossOverNodeTwo instanceof ConditionalNode){
                        notSame = false;
                    } 
                    if(crossOverNodeOne instanceof ConditionalNode && crossOverNodeTwo instanceof IEvaluationNonTerminal){
                        notSame = false;
                    } 
                    if(crossOverNodeOne instanceof IEvaluationNonTerminal && crossOverNodeTwo instanceof ConditionalNode){
                        notSame = false;
                    } 
                    if(crossOverNodeOne instanceof IEvaluationNonTerminal && crossOverNodeTwo instanceof IEvaluationNonTerminal){
                        notSame = false;
                    }
                    
                    if(notSame){
                        crossOverNodeOne = flattenedTreeOne.get(rand.nextInt(sizeOne));
                        crossOverNodeTwo = flattenedTreeTwo.get(rand.nextInt(sizeTwo));
                    }   
                }
                
                if(crossOverNodeOne instanceof ConditionalNode && crossOverNodeTwo instanceof ConditionalNode){
                    int evaluationOrMove = rand.nextInt(2);
                    if(evaluationOrMove == 0){
                        List<INode> childrenOne = ((ConditionalNode) crossOverNodeOne).getChildren();   
                        INode evaluationChildOne = childrenOne.get(2);
                        
                        List<INode> childrenTwo = ((ConditionalNode) crossOverNodeTwo).getChildren();   
                        INode evaluationChildTwo = childrenTwo.get(2);
                        
                        ((ConditionalNode) crossOverNodeOne).setChild(2, evaluationChildTwo.getCopy());
                        ((ConditionalNode) crossOverNodeTwo).setChild(2, evaluationChildOne.getCopy());
                    } else {
                        int positionOne = rand.nextInt(2);
                        List<INode> childrenOne = ((ConditionalNode) crossOverNodeOne).getChildren();   
                        INode moveChildOne = childrenOne.get(positionOne);
                        
                        int positionTwo = rand.nextInt(2);
                        List<INode> childrenTwo = ((ConditionalNode) crossOverNodeTwo).getChildren();   
                        INode moveChildTwo = childrenTwo.get(positionTwo);
                        
                        ((ConditionalNode) crossOverNodeOne).setChild(positionOne, moveChildTwo.getCopy());
                        ((ConditionalNode) crossOverNodeTwo).setChild(positionTwo, moveChildOne.getCopy());    
                    }
                } else if(crossOverNodeOne instanceof ConditionalNode && crossOverNodeTwo instanceof IEvaluationNonTerminal){
                    List<INode> childrenOne = ((ConditionalNode) crossOverNodeOne).getChildren();   
                    INode evaluationChildOne = childrenOne.get(2);
                    
                    List<IEvaluationNode> childrenTwo = ((IEvaluationNonTerminal) crossOverNodeTwo).getChildren();  
                    int positionTwo = rand.nextInt(childrenTwo.size());
                    INode evaluationChildTwo = childrenTwo.get(positionTwo);
                    
                    ((ConditionalNode) crossOverNodeOne).setChild(2, evaluationChildTwo.getCopy());
                    ((IEvaluationNonTerminal) crossOverNodeTwo).setChild(positionTwo, (IEvaluationNode) evaluationChildOne.getCopy());
                    
                } else if(crossOverNodeOne instanceof IEvaluationNonTerminal && crossOverNodeTwo instanceof ConditionalNode){
                    List<IEvaluationNode> childrenOne = ((IEvaluationNonTerminal) crossOverNodeOne).getChildren(); 
                    int positionOne = rand.nextInt(childrenOne.size());
                    INode evaluationChildOne = childrenOne.get(positionOne);
                    
                    List<INode> childrenTwo = ((ConditionalNode) crossOverNodeTwo).getChildren();   
                    INode evaluationChildTwo = childrenTwo.get(2);
                    
                    ((IEvaluationNonTerminal) crossOverNodeOne).setChild(positionOne, (IEvaluationNode) evaluationChildTwo.getCopy());
                    ((ConditionalNode) crossOverNodeTwo).setChild(2, evaluationChildOne.getCopy());
                    
                } else if(crossOverNodeOne instanceof IEvaluationNonTerminal && crossOverNodeTwo instanceof IEvaluationNonTerminal) {
                    List<IEvaluationNode> childrenOne = ((IEvaluationNonTerminal) crossOverNodeOne).getChildren(); 
                    int positionOne = rand.nextInt(childrenOne.size());
                    INode evaluationChildOne = childrenOne.get(positionOne);
                    
                    List<IEvaluationNode> childrenTwo = ((IEvaluationNonTerminal) crossOverNodeTwo).getChildren();  
                    int positionTwo = rand.nextInt(childrenTwo.size());
                    INode evaluationChildTwo = childrenTwo.get(positionTwo);
                    
                    ((IEvaluationNonTerminal) crossOverNodeOne).setChild(positionOne, (IEvaluationNode) evaluationChildTwo.getCopy());
                    ((IEvaluationNonTerminal) crossOverNodeTwo).setChild(positionTwo, (IEvaluationNode) evaluationChildOne.getCopy());
                }
            }
        }
        
        newAgents.add(one);
        newAgents.add(two);
        return newAgents;
    }
}
