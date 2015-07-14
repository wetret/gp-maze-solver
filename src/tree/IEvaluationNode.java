package evaluationtree;

import maze.Maze;


public interface IEvaluationNode {
    
    public boolean evaluate(Maze pMaze);
    public String evaluationToString();
}
