package evaluationtree.moves;

import maze.Maze;
import evaluationtree.IMoveNode;


public class MoveWest implements IMoveNode{

    @Override
    public Move evaluate(Maze pMaze) {
        return Move.WEST;
    }

    @Override
    public String evaluationToString() {
        // TODO Auto-generated method stub
        return null;
    }

}
