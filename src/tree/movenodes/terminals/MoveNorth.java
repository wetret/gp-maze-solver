package tree.movenodes.terminals;

import tree.IMoveNode;
import tree.Move;
import maze.Maze;


public class MoveNorth implements IMoveNode{

    @Override
    public Move evaluate(Maze pMaze) {
        return Move.NORTH;
    }

    @Override
    public String evaluationToString() {
        return "Move.NORTH;";
    }

}
