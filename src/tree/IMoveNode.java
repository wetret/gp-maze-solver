package tree;

import maze.Maze;


public interface IMoveNode extends INode{

    public ETurn evaluate(Maze pMaze, EOrientation pOrientation);
}
