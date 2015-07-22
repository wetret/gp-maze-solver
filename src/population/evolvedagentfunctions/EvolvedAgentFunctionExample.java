package population.evolvedagentfunctions;

import java.util.List;

import maze.Maze;
import tree.IMoveNode;
import tree.INode;
import tree.Move;


public class EvolvedAgentFunctionExample implements IMoveNode{

    @Override
    public Move evaluate(Maze pMaze) {
        // add the generated agent function from GeneticProgramming.evolve() here.
        // remove "return null"
        
        if ( pMaze.isWallSouth() ) { if ( !( ( pMaze.isWallSouth() || ( pMaze.isWallEast() || ( pMaze.isWallNorthEast() || ( ( pMaze.isWallNorthWest() && ( ( !( pMaze.isWallSouthEast() ) && pMaze.isWallSouthEast() ) && !( ( pMaze.isWallNorth() || pMaze.isWallSouthEast() ) ) ) ) || !( ( pMaze.isWallEast() && pMaze.isWallSouthEast() ) ) ) ) ) ) ) ) { return Move.WEST; } else { if ( !( !( pMaze.isWallNorthWest() ) ) ) { return Move.EAST; } else { return Move.EAST; } } } else { if ( pMaze.isWallSouthWest() ) { if ( pMaze.isWallEast() ) { if ( ( ( pMaze.isWallNorthEast() || ( ( !( ( pMaze.isWallNorthEast() && pMaze.isWallNorthEast() ) ) && pMaze.isWallEast() ) && !( pMaze.isWallEast() ) ) ) || ( ( pMaze.isWallEast() || pMaze.isWallSouthEast() ) && !( !( !( ( ( pMaze.isWallSouth() || !( pMaze.isWallEast() ) ) || pMaze.isWallSouthEast() ) ) ) ) ) ) ) { return Move.SOUTH; } else { return Move.EAST; } } else { if ( ( ( pMaze.isWallNorthWest() && ( pMaze.isWallSouthEast() || !( !( pMaze.isWallEast() ) ) ) ) && pMaze.isWallSouthWest() ) ) { if ( ( !( pMaze.isWallSouthWest() ) && ( pMaze.isWallNorth() && pMaze.isWallSouthWest() ) ) ) { return Move.WEST; } else { return Move.SOUTH; } } else { if ( pMaze.isWallSouth() ) { return Move.WEST; } else { if ( pMaze.isWallNorthWest() ) { if ( !( pMaze.isWallSouthEast() ) ) { if ( pMaze.isWallSouthWest() ) { if ( ( ( pMaze.isWallNorthEast() || ( !( pMaze.isWallEast() ) || ( pMaze.isWallNorth() || pMaze.isWallSouth() ) ) ) && ( pMaze.isWallNorthWest() || pMaze.isWallSouthWest() ) ) ) { return Move.SOUTH; } else { if ( pMaze.isWallNorth() ) { return Move.WEST; } else { return Move.WEST; } } } else { return Move.EAST; } } else { return Move.NORTH; } } else { return Move.WEST; } } } } } else { if ( pMaze.isWallNorth() ) { return Move.NORTH; } else { return Move.WEST; } } }
       // return null;
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
    public INode getParent() {
        // leave as is
        return null;
    }

    @Override
    public void setParent(INode pParent) {
       // leave as is  
    }

    @Override
    public INode getCopy() {
        // leave as is
        return null;
    }

}
