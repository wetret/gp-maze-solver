package population.evolvedagentfunctions;

import java.util.List;

import maze.Maze;
import tree.EOrientation;
import tree.ETurn;
import tree.IMoveNode;
import tree.INode;


public class EvolvedAgentFunctionOne
        implements IMoveNode {

    @Override
    public ETurn evaluate(Maze pMaze, EOrientation pOrientation) {
        // add the generated agent function from GeneticProgramming.evolve() here.
        // remove "return null"

        if ( pMaze.isWallLeft(pOrientation) ) { if (  pMaze.isWallAhead(pOrientation) ) { return ETurn.RIGHT; } else { if ( ( pMaze.isWallLeft(pOrientation) && !( pMaze.isWallLeft(pOrientation) ) ) ) { if ( !(  pMaze.isWallAhead(pOrientation) ) ) { if (  pMaze.isWallAhead(pOrientation) ) { return ETurn.LEFT; } else { if ( !( pMaze.isWallLeft(pOrientation) ) ) { if (  pMaze.isWallAhead(pOrientation) ) { if ( pMaze.isWallRight(pOrientation) ) { return ETurn.NOT; } else { return ETurn.NOT; } } else { if ( !( !(  pMaze.isWallAhead(pOrientation) ) ) ) { return ETurn.NOT; } else { return ETurn.LEFT; } } } else { if ( !( pMaze.isWallLeft(pOrientation) ) ) { return ETurn.NOT; } else { if ( pMaze.isWallLeftAhead(pOrientation) ) { return ETurn.LEFT; } else { return ETurn.RIGHT; } } } } } else { if (  pMaze.isWallAhead(pOrientation) ) { return ETurn.NOT; } else { if ( pMaze.isWallRightAhead(pOrientation) ) { return ETurn.RIGHT; } else { return ETurn.LEFT; } } } } else { if ( !( pMaze.isWallLeftAhead(pOrientation) ) ) { if ( pMaze.isWallRight(pOrientation) ) { if ( ( ( !( ( pMaze.isWallLeft(pOrientation) && ( !( ( !( !( pMaze.isWallRight(pOrientation) ) ) && ( ( !( pMaze.isWallLeft(pOrientation) ) && pMaze.isWallRight(pOrientation) ) && ( pMaze.isWallRight(pOrientation) && ( ( pMaze.isWallLeft(pOrientation) && !( !( pMaze.isWallLeft(pOrientation) ) ) ) && pMaze.isWallRight(pOrientation) ) ) ) ) ) && !( !( ( pMaze.isWallLeft(pOrientation) && pMaze.isWallRight(pOrientation) ) ) ) ) ) ) && pMaze.isWallRightAhead(pOrientation) ) && pMaze.isWallLeftAhead(pOrientation) ) ) { return ETurn.LEFT; } else { return ETurn.NOT; } } else { return ETurn.RIGHT; } } else { return ETurn.NOT; } } } } else { return ETurn.LEFT; }

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
