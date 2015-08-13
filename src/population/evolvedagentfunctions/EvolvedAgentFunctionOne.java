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
        if ( pMaze.isWallSouthEast() ) { if ( pMaze.isWallSouth() ) { if ( pMaze.isWallSouthEast() ) { if ( pMaze.isWallWest() ) { return Move.NORTH; } else { return Move.WEST; } } else { return Move.EAST; } } else { if ( pMaze.isWallEast() ) { return Move.SOUTH; } else { if ( pMaze.isWallWest() ) { return Move.NORTH; } else { if ( !( pMaze.isWallNorthEast() ) ) { if ( pMaze.isWallNorthEast() ) { if ( pMaze.isWallSouthEast() ) { if ( pMaze.isWallWest() ) { if ( pMaze.isWallNorth() ) { if ( pMaze.isWallSouthEast() ) { return Move.SOUTH; } else { return Move.EAST; } } else { if ( pMaze.isWallNorthWest() ) { return Move.WEST; } else { if ( ( pMaze.isWallNorth() && pMaze.isWallNorthEast() ) ) { return Move.WEST; } else { return Move.WEST; } } } } else { if ( !( pMaze.isWallWest() ) ) { return Move.NORTH; } else { if ( pMaze.isWallSouth() ) { if ( pMaze.isWallNorth() ) { if ( !( !( pMaze.isWallSouth() ) ) ) { return Move.SOUTH; } else { return Move.SOUTH; } } else { return Move.NORTH; } } else { if ( pMaze.isWallNorthWest() ) { if ( pMaze.isWallSouth() ) { return Move.EAST; } else { return Move.SOUTH; } } else { if ( pMaze.isWallSouth() ) { return Move.WEST; } else { return Move.EAST; } } } } } } else { if ( pMaze.isWallWest() ) { if ( pMaze.isWallSouth() ) { return Move.NORTH; } else { return Move.SOUTH; } } else { return Move.NORTH; } } } else { return Move.SOUTH; } } else { if ( pMaze.isWallEast() ) { return Move.SOUTH; } else { if ( pMaze.isWallWest() ) { if ( pMaze.isWallNorthWest() ) { if ( pMaze.isWallSouthWest() ) { if ( pMaze.isWallSouthEast() ) { return Move.WEST; } else { return Move.WEST; } } else { if ( ( pMaze.isWallWest() && pMaze.isWallNorthWest() ) ) { return Move.EAST; } else { return Move.SOUTH; } } } else { if ( pMaze.isWallSouthWest() ) { return Move.SOUTH; } else { if ( pMaze.isWallSouth() ) { return Move.SOUTH; } else { if ( pMaze.isWallWest() ) { return Move.WEST; } else { if ( ( ( pMaze.isWallSouth() && pMaze.isWallNorthEast() ) && pMaze.isWallEast() ) ) { return Move.SOUTH; } else { return Move.WEST; } } } } } } else { if ( !( pMaze.isWallNorthEast() ) ) { if ( !( pMaze.isWallEast() ) ) { if ( pMaze.isWallSouthEast() ) { if ( pMaze.isWallNorthWest() ) { return Move.NORTH; } else { return Move.SOUTH; } } else { if ( pMaze.isWallNorth() ) { return Move.SOUTH; } else { return Move.WEST; } } } else { return Move.SOUTH; } } else { return Move.EAST; } } } } } } } } else { if ( pMaze.isWallNorth() ) { return Move.EAST; } else { if ( pMaze.isWallNorthWest() ) { return Move.NORTH; } else { if ( pMaze.isWallEast() ) { return Move.SOUTH; } else { if ( pMaze.isWallWest() ) { return Move.NORTH; } else { if ( !( pMaze.isWallNorthEast() ) ) { if ( !( pMaze.isWallEast() ) ) { if ( pMaze.isWallNorth() ) { if ( pMaze.isWallNorthWest() ) { return Move.NORTH; } else { return Move.SOUTH; } } else { if ( pMaze.isWallNorth() ) { if ( pMaze.isWallSouth() ) { return Move.EAST; } else { if ( ( pMaze.isWallSouthEast() && pMaze.isWallNorthWest() ) ) { return Move.WEST; } else { return Move.NORTH; } } } else { return Move.WEST; } } } else { if ( ( ( pMaze.isWallWest() || pMaze.isWallSouthWest() ) || ( pMaze.isWallNorthEast() && pMaze.isWallSouth() ) ) ) { return Move.WEST; } else { return Move.WEST; } } } else { return Move.EAST; } } } } } }

   
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
