package tree;

import maze.Maze;


public interface IEvaluationNode
        extends INode {

    public boolean evaluate(Maze pMaze);

}
