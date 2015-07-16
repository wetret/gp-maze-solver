package population.evolvedagentfunctions;

import maze.Maze;
import tree.IMoveNode;
import tree.Move;


public class EvolvedAgentFunctionExample implements IMoveNode{

    @Override
    public Move evaluate(Maze pMaze) {
        // add the generated agent function from GeneticProgramming.evolve() here.
        // remove "return null"
        
        if(pMaze.isWallWest() && pMaze.isWallNorth()){
            return Move.EAST;
        } else if(pMaze.isWallWest()) {
            return Move.NORTH;
        } else if(pMaze.isWallNorth() && pMaze.isWallEast()) {
            return Move.SOUTH;
        } else if(!pMaze.isWallWest() && !pMaze.isWallNorth() && pMaze.isWallNorthWest()) {
            return Move.NORTH;
        } else if(pMaze.isWallEast()) {
            return Move.SOUTH;
        } else {
            return Move.EAST;
        }
        
        // return null;
    }

    @Override
    public String evaluationToString() {
        // add the generated agent function from GeneticProgramming.evolve() here as: return "<agent function>"
        // remove "return null"
        
        return null;
    }

}
