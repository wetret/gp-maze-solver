package tree.movenodes.terminals;

import tree.IMoveNode;
import tree.Move;
import maze.Maze;


public class MoveWest implements IMoveNode{

    @Override
    public Move evaluate(Maze pMaze) {
        return Move.WEST;
    }

    @Override
    public String evaluationToString() {
        return "Move.WEST;";
    }

}
