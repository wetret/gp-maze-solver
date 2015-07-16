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
import tree.movenodes.terminals.MoveEast;
import tree.movenodes.terminals.MoveNorth;
import tree.movenodes.terminals.MoveSouth;
import tree.movenodes.terminals.MoveWest;
import tree.movenodes.ternarynodes.ConditionalNode;
import utils.ERandom;


public class NodeBuilder {
    
    private static final Random mRandom = ERandom.INSTANCE.getRandom(); 
    
    public static IMoveNode getMoveNode(INode pParent){
        int selection = mRandom.nextInt(7);
        
        if(inBetween(selection, 0, 2)){
            return new ConditionalNode(pParent);
        } else if(selection == 3){
            return new MoveNorth(pParent);
        } else if(selection == 4){
            return new MoveEast(pParent);
        } else if(selection == 5){
            return new MoveSouth(pParent);
        } else {
            // selection should be 6
            return new MoveWest(pParent);
        }
    }
    
    public static IEvaluationNode getEvaluationNode(INode pParent){
        int selection = mRandom.nextInt(16);
        
        if(inBetween(selection, 0, 2)){
           return new AndNode(pParent);
        } else if(inBetween(selection, 3, 5)){
           return new OrNode(pParent);
        } else if(inBetween(selection, 6, 8)){
            return new NotNode(pParent);
        } else if(selection == 9){
            return new EastNode(pParent);
        } else if(selection == 10){
            return new NorthEastNode(pParent);
        } else if(selection == 11){
            return new NorthNode(pParent);
        } else if(selection == 12){
            return new NorthWestNode(pParent);
        } else if(selection == 13){
            return new SouthEastNode(pParent);
        } else if(selection == 14){
            return new SouthNode(pParent);
        } else if(selection == 15){
            return new SouthWestNode(pParent);
        } else {
            // selection should be 16
            return new WestNode(pParent);
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
