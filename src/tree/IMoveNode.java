package tree;

import maze.Maze;


public interface IMoveNode {

    public Move evaluate(Maze pMaze);
    public String evaluationToString();
}
