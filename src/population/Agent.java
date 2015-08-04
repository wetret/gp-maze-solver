package population;

import maze.Maze;
import tree.ETurn;
import tree.IMoveNode;
import tree.EOrientation;
import utils.Config;


public class Agent {

    private IMoveNode mRoot;

    private Maze      mMaze;

    private EOrientation mOrientation;
    private int       mAgentXCord;
    private int       mAgentYCord;

    private int       mFitness;
    private boolean   mGoalReached;
    private int       mCollectedWayPoints;

    public Agent(IMoveNode pRoot, Maze pMaze) {
        mRoot = pRoot;
        mMaze = pMaze;

        mOrientation = EOrientation.EAST;
        mAgentXCord = Config.DEFAULT.getAgentXCordStart();
        mAgentYCord = Config.DEFAULT.getAgentYCordStart();

        mFitness = 100000;
        mGoalReached = false;
        mCollectedWayPoints = 0;
    }


    public Agent(Agent pAgent) {
        mRoot = (IMoveNode) pAgent.getEvaluationTree().getCopy();
        int mazeNumber = pAgent.getMaze().getMazeNumber();
        mMaze = new Maze(mazeNumber);

        mAgentXCord = Config.DEFAULT.getAgentXCordStart();
        mAgentYCord = Config.DEFAULT.getAgentYCordStart();

        mFitness = 100000;
    }


    public boolean move() {
        ETurn move = mRoot.evaluate(mMaze, mOrientation);

        switch (move) {
            case LEFT:
                if(mOrientation == EOrientation.EAST){
                    mOrientation = EOrientation.NORTH;
                } else if(mOrientation == EOrientation.SOUTH){
                    mOrientation = EOrientation.EAST;
                } else if(mOrientation == EOrientation.WEST){
                    mOrientation = EOrientation.SOUTH;
                } else {
                    // Orientation is NORTH
                    mOrientation = EOrientation.WEST;
                }
                break;
            case RIGHT:
                if(mOrientation == EOrientation.EAST){
                    mOrientation = EOrientation.SOUTH;
                } else if(mOrientation == EOrientation.SOUTH){
                    mOrientation = EOrientation.WEST;
                } else if(mOrientation == EOrientation.WEST){
                    mOrientation = EOrientation.NORTH;
                } else {
                    // Orientation is NORTH
                    mOrientation = EOrientation.EAST;
                }
                break;
            case NOT:
                // No change in orientation
                break;
        }
        if(!mMaze.isWallAhead(mOrientation)){   
            if(mOrientation == EOrientation.EAST){
                mAgentXCord = mAgentXCord + 1;
            } else if(mOrientation == EOrientation.SOUTH){
                mAgentYCord = mAgentYCord + 1;
            } else if(mOrientation == EOrientation.WEST){
                mAgentXCord = mAgentXCord - 1;
            } else {
                // Orientation is NORTH
                mAgentYCord = mAgentYCord - 1;
            }
        }

        if (goalReached()) {
            System.out.println("FOUND ESCAPE!!");
            mGoalReached = true;
            return false;
        }

        mMaze.setNewAgentCord(mAgentXCord, mAgentYCord);
        return true;
    }

    private boolean goalReached() {
        /*TODO: check all surrounding positions*/
        if (mMaze.getGrid()[mAgentXCord][mAgentYCord] == Config.DEFAULT.getGoalPosition()) {
            return true;
        } else {
            return false;
        }
    }

    public int getXCord() {
        return mAgentXCord;
    }

    public int getYCord() {
        return mAgentYCord;
    }

    public IMoveNode getEvaluationTree() {
        return mRoot;
    }

    public int getFitness() {
        return mFitness;
    }

    public void setFitness(int pFitness) {
        mFitness = pFitness;
    }

    public void setRoot(IMoveNode pRoot) {
        mRoot = pRoot;
    }

    public Maze getMaze() {
        return mMaze;
    }

    public void setAgentXCord(int pAgentXCord) {
        mAgentXCord = pAgentXCord;
    }

    public void setAgentYCord(int pAgentYCord) {
        mAgentYCord = pAgentYCord;
    }

    public Agent getCopy() {
        return new Agent(this);
    }

    public void resetValues() {
        mAgentXCord = Config.DEFAULT.getAgentXCordStart();
        mAgentYCord = Config.DEFAULT.getAgentYCordStart();
        int mazeNumber = mMaze.getMazeNumber();
        mMaze = new Maze(mazeNumber);
        mGoalReached = false;
        mCollectedWayPoints = 0;
    }

    public boolean isGoalReached() {
        return mGoalReached;
    }

    public void setGoalReached(boolean pGoalReached) {
        mGoalReached = pGoalReached;
    }

    public int getCollectedWayPoints() {
        return mCollectedWayPoints;
    }

    public void setCollectedWayPoints(int pCollectedWayPoints) {
        mCollectedWayPoints = pCollectedWayPoints;
    }

}
