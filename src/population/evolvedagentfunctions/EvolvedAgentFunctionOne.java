package population.evolvedagentfunctions;

import java.util.List;

import maze.Maze;
import tree.IMoveNode;
import tree.INode;
import tree.Move;


public class EvolvedAgentFunctionOne implements IMoveNode{

    @Override
    public Move evaluate(Maze pMaze) {
        // add the generated agent function from GeneticProgramming.evolve() here.
        // remove "return null"
        
        if ( pMaze.isWallNorth() ) { return Move.WEST; } else { if ( ( pMaze.isWallSouthEast() || pMaze.isWallSouth() ) ) { if ( pMaze.isWallEast() ) { return Move.NORTH; } else { return Move.EAST; } } else { if ( pMaze.isWallNorthEast() ) { if ( pMaze.isWallNorth() ) { return Move.WEST; } else { return Move.NORTH; } } else { if ( pMaze.isWallNorth() ) { if ( pMaze.isWallNorth() ) { return Move.EAST; } else { return Move.WEST; } } else { if ( ( pMaze.isWallSouth() || pMaze.isWallSouth() ) ) { if ( pMaze.isWallNorthEast() ) { return Move.NORTH; } else { return Move.SOUTH; } } else { return Move.SOUTH; } } } } }
    }

    @Override
    public String evaluationToString() {
        // leave as is
        return null;
    }

    @Override
    public List<INode> getFlattenedTree() {
        // leave as is
        return null;
    }

    @Override
    public INode getCopy() {
        // leave as is
        return null;
    }

}
