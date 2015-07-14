package evaluationtree.moves;

import maze.Maze;
import evaluationtree.IMoveNode;


public class MoveNorth implements IMoveNode{

    @Override
    public Move evaluate(Maze pMaze) {
        return Move.NORTH;
    }

    @Override
    public String evaluationToString() {
        // TODO Auto-generated method stub
        return null;
    }

}
