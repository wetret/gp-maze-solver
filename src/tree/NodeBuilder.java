package tree;

import java.util.Random;

import tree.evaluationnodes.binarynodes.AndNode;
import tree.evaluationnodes.terminals.WallAhead;
import tree.evaluationnodes.terminals.WallLeft;
import tree.evaluationnodes.terminals.WallLeftAhead;
import tree.evaluationnodes.terminals.WallRight;
import tree.evaluationnodes.terminals.WallRightAhead;
import tree.evaluationnodes.unarynodes.NotNode;
import tree.movenodes.terminals.TurnLeft;
import tree.movenodes.terminals.TurnNot;
import tree.movenodes.terminals.TurnRight;
import tree.movenodes.ternarynodes.ConditionalNode;
import utils.ERandom;


public class NodeBuilder {
    
    private static final Random mRandom = ERandom.INSTANCE.getRandom(); 
    
    public static IMoveNode getMoveNode(){
        int selection = mRandom.nextInt(10);
        
        if(selection == 0){
            return new ConditionalNode();
        } else if(inBetween(selection, 1, 3)){
            return new TurnLeft();
        } else if(inBetween(selection, 4, 6)){
            return new TurnRight();
        } else {
            // selection should be between 7 and 9
            return new TurnNot();
        }
    }
    
    public static IEvaluationNode getEvaluationNode(){
        int selection = mRandom.nextInt(16);
        
        if(inBetween(selection, 0,3)){
           return new AndNode();
        } else if(inBetween(selection, 4,7)){
            return new NotNode();
        } else if(inBetween(selection, 8,9)){
            return new WallAhead();
        } else if(inBetween(selection, 10, 11)){
            return new WallLeft();
        } else if(inBetween(selection, 12, 13)){
            return new WallRight();
        } else if(selection == 14){
            return new WallRightAhead();
        } else {
            return new WallLeftAhead();
        }
    }
    
    private static boolean inBetween(int pCheckNumber, int pLowerBound, int pUpperBound){
        if(pCheckNumber >= pLowerBound && pCheckNumber <= pUpperBound){
            return true;
        } else {
            return false;
        }
    }

}
