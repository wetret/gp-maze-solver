package evaluationtree.moves;

import maze.Maze;
import evaluationtree.IMoveNode;


public class MoveEast implements IMoveNode{

    @Override
    public Move evaluate(Maze pMaze) {
        return Move.EAST;
    }

    @Override
    public String evaluationToString() {
        // TODO Auto-generated method stub
        return null;
    }

}
