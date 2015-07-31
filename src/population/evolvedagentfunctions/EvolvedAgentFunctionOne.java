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
        
       if ( ( pMaze.isWallSouthWest() && pMaze.isWallSouth() ) ) { return Move.WEST; } else { if ( pMaze.isWallEast() ) { return Move.SOUTH; } else { if ( ( !( !( ( !( ( ( pMaze.isWallNorthWest() || ( !( ( ( ( ( ( !( pMaze.isWallNorthWest() ) || pMaze.isWallNorthWest() ) || ( pMaze.isWallSouthWest() || pMaze.isWallNorthWest() ) ) || !( ( pMaze.isWallSouthEast() && !( ( ( pMaze.isWallSouthWest() && pMaze.isWallSouthEast() ) || pMaze.isWallSouthWest() ) ) ) ) ) && pMaze.isWallNorthWest() ) || !( pMaze.isWallNorth() ) ) ) && ( pMaze.isWallSouthWest() && ( pMaze.isWallSouthEast() && !( pMaze.isWallSouthEast() ) ) ) ) ) && !( pMaze.isWallNorth() ) ) ) || !( ( !( ( !( pMaze.isWallSouth() ) && pMaze.isWallNorth() ) ) || pMaze.isWallSouthEast() ) ) ) ) ) && ( !( pMaze.isWallSouth() ) || !( pMaze.isWallNorth() ) ) ) ) { return Move.EAST; } else { return Move.NORTH; } } }
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
