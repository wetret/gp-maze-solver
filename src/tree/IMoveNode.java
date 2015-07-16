package tree;

import maze.Maze;


public interface IMoveNode extends INode{

    public Move evaluate(Maze pMaze);
}
