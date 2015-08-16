package population.evolvedagentfunctions;

import java.util.List;

import maze.Maze;
import tree.EOrientation;
import tree.ETurn;
import tree.IMoveNode;
import tree.INode;


public class EvolvedAgentFunction2
        implements IMoveNode {

    @Override
    public ETurn evaluate(Maze pMaze, EOrientation pOrientation) {
        // add the generated agent function from GeneticProgramming.evolve() here.
        // remove "return null"
        
        // Agent function evolved using population size 1000, mutation percentage 0.1 and fitness function Distance to Exit.
        if ( pMaze.isWallRight(pOrientation) ) { if ( pMaze.isWallRight(pOrientation) ) { if ( ( pMaze.isWallLeftAhead(pOrientation) && !( pMaze.isWallRight(pOrientation) ) ) ) { if ( ( !( !( pMaze.isWallRight(pOrientation) ) ) && ( pMaze.isWallRightAhead(pOrientation) &&  pMaze.isWallAhead(pOrientation) ) ) ) { return ETurn.RIGHT; } else { return ETurn.RIGHT; } } else { if ( pMaze.isWallRightAhead(pOrientation) ) { if (  pMaze.isWallAhead(pOrientation) ) { return ETurn.LEFT; } else { if ( pMaze.isWallRight(pOrientation) ) { return ETurn.NOT; } else { return ETurn.RIGHT; } } } else { if ( pMaze.isWallRight(pOrientation) ) { return ETurn.NOT; } else { return ETurn.LEFT; } } } } else { if ( ( !( pMaze.isWallLeft(pOrientation) ) && !( ( pMaze.isWallRightAhead(pOrientation) && pMaze.isWallLeft(pOrientation) ) ) ) ) { return ETurn.LEFT; } else { if ( !( pMaze.isWallRightAhead(pOrientation) ) ) { return ETurn.NOT; } else { return ETurn.RIGHT; } } } } else { return ETurn.RIGHT; }
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
