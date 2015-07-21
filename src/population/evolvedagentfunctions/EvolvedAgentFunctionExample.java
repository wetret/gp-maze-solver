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
        
        if ( ( !( pMaze.isWallNorthWest() ) || !( !( pMaze.isWallNorthEast() ) ) ) ) { if ( !( pMaze.isWallEast() ) ) { return Move.EAST; } else { return Move.SOUTH; } } else { return Move.NORTH; }

       // return null;
    }

    @Override
    public String evaluationToString() {
        // add the generated agent function from GeneticProgramming.evolve() here as: return "<agent function>"
        // remove "return null"
        
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
