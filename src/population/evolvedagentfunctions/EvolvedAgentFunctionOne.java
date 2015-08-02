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
        
        if ( !( pMaze.isWallEast() ) ) { if ( ( pMaze.isWallSouth() && pMaze.isWallEast() ) ) { return Move.WEST; } else { if ( pMaze.isWallNorthWest() ) { if ( !( pMaze.isWallNorthEast() ) ) { if ( ( pMaze.isWallNorthWest() && pMaze.isWallNorthEast() ) ) { if ( pMaze.isWallNorthWest() ) { if ( pMaze.isWallWest() ) { return Move.WEST; } else { if ( pMaze.isWallSouth() ) { if ( !( ( pMaze.isWallNorth() || pMaze.isWallSouthEast() ) ) ) { return Move.SOUTH; } else { return Move.NORTH; } } else { return Move.SOUTH; } } } else { return Move.WEST; } } else { if ( !( !( pMaze.isWallSouth() ) ) ) { return Move.WEST; } else { if ( pMaze.isWallSouth() ) { return Move.WEST; } else { return Move.NORTH; } } } } else { if ( pMaze.isWallNorth() ) { if ( pMaze.isWallWest() ) { return Move.EAST; } else { return Move.SOUTH; } } else { if ( pMaze.isWallNorthWest() ) { if ( ( pMaze.isWallSouthEast() || pMaze.isWallWest() ) ) { return Move.EAST; } else { return Move.WEST; } } else { if ( ( pMaze.isWallEast() && ( ( pMaze.isWallWest() && pMaze.isWallSouth() ) || ( pMaze.isWallSouthEast() && ( pMaze.isWallNorth() || pMaze.isWallNorthWest() ) ) ) ) ) { return Move.SOUTH; } else { if ( pMaze.isWallNorthEast() ) { return Move.WEST; } else { return Move.EAST; } } } } } } else { return Move.EAST; } } } else { if ( ( pMaze.isWallNorth() || pMaze.isWallNorthWest() ) ) { if ( ( pMaze.isWallNorthWest() || ( pMaze.isWallSouthEast() && pMaze.isWallWest() ) ) ) { if ( ( pMaze.isWallSouthWest() && ( pMaze.isWallNorthEast() && pMaze.isWallSouth() ) ) ) { if ( pMaze.isWallNorth() ) { if ( pMaze.isWallSouthEast() ) { if ( !( pMaze.isWallNorthEast() ) ) { if ( pMaze.isWallSouthEast() ) { if ( pMaze.isWallSouth() ) { return Move.WEST; } else { if ( ( pMaze.isWallSouth() || !( pMaze.isWallNorth() ) ) ) { if ( pMaze.isWallSouth() ) { return Move.WEST; } else { return Move.SOUTH; } } else { return Move.SOUTH; } } } else { if ( pMaze.isWallEast() ) { if ( pMaze.isWallNorthEast() ) { return Move.WEST; } else { return Move.SOUTH; } } else { if ( ( pMaze.isWallNorthWest() && ( pMaze.isWallSouthEast() && pMaze.isWallNorthWest() ) ) ) { return Move.WEST; } else { if ( pMaze.isWallSouthWest() ) { if ( pMaze.isWallSouth() ) { if ( pMaze.isWallEast() ) { if ( pMaze.isWallSouthWest() ) { if ( pMaze.isWallNorthWest() ) { if ( !( !( ( !( pMaze.isWallSouth() ) || ( pMaze.isWallWest() || !( pMaze.isWallNorthEast() ) ) ) ) ) ) { if ( pMaze.isWallSouth() ) { if ( ( pMaze.isWallNorthEast() || ( pMaze.isWallSouthWest() && pMaze.isWallSouth() ) ) ) { return Move.WEST; } else { return Move.WEST; } } else { return Move.SOUTH; } } else { return Move.NORTH; } } else { if ( pMaze.isWallEast() ) { return Move.NORTH; } else { return Move.WEST; } } } else { return Move.EAST; } } else { if ( pMaze.isWallSouthEast() ) { return Move.WEST; } else { if ( !( pMaze.isWallNorthEast() ) ) { return Move.EAST; } else { if ( pMaze.isWallSouthWest() ) { if ( pMaze.isWallNorth() ) { if ( pMaze.isWallNorthWest() ) { return Move.NORTH; } else { return Move.SOUTH; } } else { return Move.NORTH; } } else { return Move.SOUTH; } } } } } else { return Move.SOUTH; } } else { return Move.WEST; } } } } } else { if ( pMaze.isWallSouthWest() ) { return Move.NORTH; } else { if ( pMaze.isWallNorthWest() ) { if ( ( ( pMaze.isWallSouthEast() || pMaze.isWallEast() ) || pMaze.isWallNorth() ) ) { return Move.EAST; } else { return Move.NORTH; } } else { if ( ( pMaze.isWallEast() && ( ( pMaze.isWallSouthEast() && pMaze.isWallWest() ) || pMaze.isWallSouthEast() ) ) ) { return Move.WEST; } else { if ( ( pMaze.isWallNorth() || pMaze.isWallEast() ) ) { return Move.NORTH; } else { if ( pMaze.isWallSouthWest() ) { if ( pMaze.isWallSouthWest() ) { return Move.WEST; } else { return Move.WEST; } } else { return Move.EAST; } } } } } } } else { if ( pMaze.isWallNorthEast() ) { return Move.NORTH; } else { if ( pMaze.isWallNorthWest() ) { return Move.EAST; } else { if ( pMaze.isWallWest() ) { return Move.NORTH; } else { return Move.EAST; } } } } } else { if ( pMaze.isWallSouthEast() ) { return Move.EAST; } else { return Move.WEST; } } } else { return Move.NORTH; } } else { if ( ( !( pMaze.isWallSouth() ) && pMaze.isWallSouthWest() ) ) { if ( pMaze.isWallNorthWest() ) { return Move.WEST; } else { return Move.SOUTH; } } else { return Move.NORTH; } } } else { return Move.SOUTH; } }

//        if ( pMaze.isWallNorth() ) { return Move.WEST; } else { if ( ( pMaze.isWallSouthEast() || pMaze.isWallSouth() ) ) { if ( pMaze.isWallEast() ) { return Move.NORTH; } else { return Move.EAST; } } else { if ( pMaze.isWallNorthEast() ) { if ( pMaze.isWallNorth() ) { return Move.WEST; } else { return Move.NORTH; } } else { if ( pMaze.isWallNorth() ) { if ( pMaze.isWallNorth() ) { return Move.EAST; } else { return Move.WEST; } } else { if ( ( pMaze.isWallSouth() || pMaze.isWallSouth() ) ) { if ( pMaze.isWallNorthEast() ) { return Move.NORTH; } else { return Move.SOUTH; } } else { return Move.SOUTH; } } } } }
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
