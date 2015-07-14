package tree;

import java.util.Random;

import tree.evaluationnodes.binarynodes.AndNode;
import tree.evaluationnodes.binarynodes.OrNode;
import tree.evaluationnodes.terminals.EastNode;
import tree.evaluationnodes.terminals.NorthEastNode;
import tree.evaluationnodes.terminals.NorthNode;
import tree.evaluationnodes.terminals.NorthWestNode;
import tree.evaluationnodes.terminals.SouthEastNode;
import tree.evaluationnodes.terminals.SouthNode;
import tree.evaluationnodes.terminals.SouthWestNode;
import tree.evaluationnodes.terminals.WestNode;
import tree.evaluationnodes.unarynodes.NotNode;
import tree.moves.terminals.MoveEast;
import tree.moves.terminals.MoveNorth;
import tree.moves.terminals.MoveSouth;
import tree.moves.terminals.MoveWest;
import tree.moves.ternarynodes.ConditionalNode;
import utils.ERandom;


public class NodeBuilder {
    
    private static final Random mRandom = ERandom.INSTANCE.getRandom(); 
    
    public static IMoveNode getMoveNode(){
        int selection = mRandom.nextInt(7);
        
        if(inBetween(selection, 0, 2)){
            return new ConditionalNode();
        } else if(selection == 3){
            return new MoveNorth();
        } else if(selection == 4){
            return new MoveEast();
        } else if(selection == 5){
            return new MoveSouth();
        } else {
            // selection should be 6
            return new MoveWest();
        }
    }
    
    public static IEvaluationNode getEvaluationNode(){
        int selection = mRandom.nextInt(16);
        
        if(inBetween(selection, 0, 2)){
           return new AndNode();
        } else if(inBetween(selection, 3, 5)){
           return new OrNode();
        } else if(inBetween(selection, 6, 8)){
            return new NotNode();
        } else if(selection == 9){
            return new EastNode();
        } else if(selection == 10){
            return new NorthEastNode();
        } else if(selection == 11){
            return new NorthNode();
        } else if(selection == 12){
            return new NorthWestNode();
        } else if(selection == 13){
            return new SouthEastNode();
        } else if(selection == 14){
            return new SouthNode();
        } else if(selection == 15){
            return new SouthWestNode();
        } else {
            // selection should be 16
            return new WestNode();
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
