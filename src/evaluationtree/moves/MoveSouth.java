package evaluationtree.moves;

import maze.Maze;
import evaluationtree.IMoveNode;


public class MoveSouth implements IMoveNode{

    @Override
    public Move evaluate(Maze pMaze) {
       return Move.SOUTH;
    }

    @Override
    public String evaluationToString() {
        // TODO Auto-generated method stub
        return null;
    }

}
