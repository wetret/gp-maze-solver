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

    public static IMoveNode getMoveNode() {
        int selection = mRandom.nextInt(6);

        if (inBetween(selection, 0, 1)) {
            return new ConditionalNode();
        } else if (selection == 2) {
            return new MoveNorth();
        } else if (selection == 3) {
            return new MoveEast();
        } else if (selection == 4) {
            return new MoveSouth();
        } else {
            // selection should be 5
            return new MoveWest();
        }
    }

    public static IEvaluationNode getEvaluationNode() {
        int selection = mRandom.nextInt(11);

        if (selection == 0) {
            return new AndNode();
        } else if (selection == 1) {
            return new OrNode();
        } else if (selection == 2) {
            return new NotNode();
        } else if (selection == 3) {
            return new EastNode();
        } else if (selection == 4) {
            return new NorthEastNode();
        } else if (selection == 5) {
            return new NorthNode();
        } else if (selection == 6) {
            return new NorthWestNode();
        } else if (selection == 7) {
            return new SouthEastNode();
        } else if (selection == 8) {
            return new SouthNode();
        } else if (selection == 9) {
            return new SouthWestNode();
        } else {
            // selection should be 10
            return new WestNode();
        }
    }

    private static boolean inBetween(int pCheckNumber, int pLowerBound, int pUpperBound) {
        if (pCheckNumber >= pLowerBound && pCheckNumber <= pUpperBound) {
            return true;
        } else {
            return false;
        }
    }
}
