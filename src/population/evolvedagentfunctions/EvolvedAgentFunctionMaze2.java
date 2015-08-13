package population.evolvedagentfunctions;

import java.util.List;

import maze.Maze;
import tree.IMoveNode;
import tree.INode;
import tree.Move;


public class EvolvedAgentFunctionMaze2 implements IMoveNode{

    @Override
    public Move evaluate(Maze pMaze) {
        // add the generated agent function from GeneticProgramming.evolve() here.
        // remove "return null"
       
        // Agent function evolved using population size 1000, mutation percentage 0.1 and fitness function Count of Moves.
        if ( !( pMaze.isWallEast() ) ) { if ( ( ( !( pMaze.isWallNorthWest() ) || pMaze.isWallNorthEast() ) || !( pMaze.isWallNorthWest() ) ) ) { return Move.EAST; } else { if ( pMaze.isWallEast() ) { if ( pMaze.isWallEast() ) { if ( ( ( !( ( pMaze.isWallNorthWest() || ( pMaze.isWallSouthEast() || pMaze.isWallNorth() ) ) ) || pMaze.isWallNorthEast() ) || ( ( pMaze.isWallSouth() || pMaze.isWallEast() ) || !( pMaze.isWallNorthWest() ) ) ) ) { if ( !( ( ( pMaze.isWallWest() || pMaze.isWallWest() ) || pMaze.isWallNorthEast() ) ) ) { return Move.WEST; } else { if ( ( !( !( !( ( pMaze.isWallNorthWest() && pMaze.isWallSouthEast() ) ) ) ) || pMaze.isWallNorthEast() ) ) { return Move.WEST; } else { if ( pMaze.isWallSouthEast() ) { if ( pMaze.isWallNorthWest() ) { if ( pMaze.isWallWest() ) { if ( pMaze.isWallNorthWest() ) { if ( ( pMaze.isWallEast() || pMaze.isWallEast() ) ) { return Move.NORTH; } else { return Move.EAST; } } else { return Move.SOUTH; } } else { return Move.NORTH; } } else { return Move.WEST; } } else { return Move.SOUTH; } } } } else { return Move.NORTH; } } else { return Move.WEST; } } else { if ( pMaze.isWallNorth() ) { return Move.SOUTH; } else { return Move.NORTH; } } } } else { return Move.SOUTH; }
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
