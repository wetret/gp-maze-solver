package tree.movenodes.terminals;

import tree.IMoveNode;
import tree.Move;
import maze.Maze;


public class MoveEast implements IMoveNode{

    @Override
    public Move evaluate(Maze pMaze) {
        return Move.EAST;
    }

    @Override
    public String evaluationToString() {
        return "Move.EAST;";
    }

}
