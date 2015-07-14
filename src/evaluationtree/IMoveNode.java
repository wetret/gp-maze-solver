package evaluationtree;

import evaluationtree.moves.Move;
import maze.Maze;


public interface IMoveNode {

    public Move evaluate(Maze pMaze);
    public String evaluationToString();
}
