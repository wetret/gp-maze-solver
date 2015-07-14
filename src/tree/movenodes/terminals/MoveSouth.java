package tree.movenodes.terminals;

import tree.IMoveNode;
import tree.Move;
import maze.Maze;


public class MoveSouth implements IMoveNode{

    @Override
    public Move evaluate(Maze pMaze) {
       return Move.SOUTH;
    }

    @Override
    public String evaluationToString() {
        return "Move.SOUTH;";
    }

}
