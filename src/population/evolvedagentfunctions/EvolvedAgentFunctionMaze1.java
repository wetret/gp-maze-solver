package population.evolvedagentfunctions;

import java.util.List;

import maze.Maze;
import tree.IMoveNode;
import tree.INode;
import tree.Move;


public class EvolvedAgentFunctionMaze1 implements IMoveNode{

    @Override
    public Move evaluate(Maze pMaze) {
        // add the generated agent function from GeneticProgramming.evolve() here.
        // remove "return null"
        
        // Agent function evolved using population size 1000, mutation percentage 0.1 and fitness function breadcrumbs.
        if ( pMaze.isWallEast() ) { return Move.SOUTH; } else { if ( pMaze.isWallNorthEast() ) { return Move.EAST; } else { if ( pMaze.isWallSouthWest() ) { if ( !( pMaze.isWallWest() ) ) { if ( pMaze.isWallSouthWest() ) { if ( !( ( ( pMaze.isWallEast() && pMaze.isWallSouth() ) || pMaze.isWallSouthEast() ) ) ) { if ( pMaze.isWallSouthEast() ) { if ( !( ( pMaze.isWallWest() && pMaze.isWallNorthEast() ) ) ) { return Move.NORTH; } else { return Move.SOUTH; } } else { return Move.WEST; } } else { if ( ( pMaze.isWallNorthWest() && pMaze.isWallSouthWest() ) ) { if ( pMaze.isWallSouth() ) { if ( pMaze.isWallSouthWest() ) { if ( ( pMaze.isWallSouthWest() && ( pMaze.isWallNorth() || ( ( pMaze.isWallNorthWest() || pMaze.isWallNorthWest() ) && pMaze.isWallSouthWest() ) ) ) ) { return Move.NORTH; } else { if ( pMaze.isWallSouthEast() ) { if ( pMaze.isWallNorthEast() ) { return Move.NORTH; } else { return Move.NORTH; } } else { return Move.EAST; } } } else { return Move.EAST; } } else { return Move.EAST; } } else { if ( pMaze.isWallNorthEast() ) { if ( pMaze.isWallSouthWest() ) { return Move.EAST; } else { if ( pMaze.isWallNorthWest() ) { if ( pMaze.isWallSouthEast() ) { return Move.SOUTH; } else { return Move.WEST; } } else { return Move.NORTH; } } } else { if ( pMaze.isWallNorth() ) { return Move.SOUTH; } else { return Move.WEST; } } } } } else { if ( pMaze.isWallNorthEast() ) { return Move.WEST; } else { if ( !( ( pMaze.isWallWest() || pMaze.isWallWest() ) ) ) { if ( pMaze.isWallNorthEast() ) { return Move.EAST; } else { if ( pMaze.isWallSouthWest() ) { if ( pMaze.isWallWest() ) { if ( pMaze.isWallSouthWest() ) { return Move.WEST; } else { if ( pMaze.isWallWest() ) { return Move.WEST; } else { if ( !( pMaze.isWallNorthEast() ) ) { if ( pMaze.isWallSouthWest() ) { return Move.WEST; } else { return Move.SOUTH; } } else { if ( ( !( pMaze.isWallNorthEast() ) && ( pMaze.isWallNorthWest() && pMaze.isWallSouthWest() ) ) ) { return Move.SOUTH; } else { return Move.SOUTH; } } } } } else { if ( pMaze.isWallSouth() ) { return Move.EAST; } else { return Move.SOUTH; } } } else { if ( pMaze.isWallEast() ) { return Move.EAST; } else { return Move.NORTH; } } } } else { if ( ( !( pMaze.isWallNorthEast() ) && ( !( pMaze.isWallSouthEast() ) && pMaze.isWallSouthWest() ) ) ) { return Move.SOUTH; } else { return Move.SOUTH; } } } } } else { if ( pMaze.isWallNorthWest() ) { return Move.NORTH; } else { return Move.EAST; } } } else { if ( pMaze.isWallNorth() ) { return Move.EAST; } else { return Move.NORTH; } } } }
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
