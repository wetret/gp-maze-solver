package population;

import maze.Maze;
import tree.IMoveNode;
import tree.Move;
import utils.Config;


public class Agent {

    private IMoveNode mRoot;

    private Maze      mMaze;

    private int       mAgentXCord;
    private int       mAgentYCord;

    private int       mFitness;
    private boolean   mGoalReached;
    private int       mCollectedWayPoints;

    public Agent(IMoveNode pRoot, Maze pMaze) {
        mRoot = pRoot;
        mMaze = pMaze;

        mAgentXCord = Config.DEFAULT.getAgentXCordStart();
        mAgentYCord = Config.DEFAULT.getAgentYCordStart();

        mFitness = 100000;
        mGoalReached = false;
        mCollectedWayPoints = 0;
    }


    public Agent(Agent pAgent) {
        mRoot = (IMoveNode) pAgent.getEvaluationTree().getCopy();
        mMaze = new Maze();

        mAgentXCord = Config.DEFAULT.getAgentXCordStart();
        mAgentYCord = Config.DEFAULT.getAgentYCordStart();

        mFitness = 100000;
    }


    public boolean move() {
        Move move = mRoot.evaluate(mMaze);

        switch (move) {
            case NORTH:
                if (!mMaze.isWallNorth()) {
                    if(mMaze.getGrid()[mAgentXCord][mAgentYCord-1] == Config.DEFAULT.getWayPointPosition()){
                        mCollectedWayPoints++;
                    }
                    mAgentYCord = mAgentYCord - 1;
                }
                break;
            case EAST:
                if (!mMaze.isWallEast()) {
                    if(mMaze.getGrid()[mAgentXCord+1][mAgentYCord] == Config.DEFAULT.getWayPointPosition()){
                        mCollectedWayPoints++;
                    }
                    mAgentXCord = mAgentXCord + 1;
                }
                break;
            case SOUTH:
                if (!mMaze.isWallSouth()) {
                    if(mMaze.getGrid()[mAgentXCord][mAgentYCord+1] == Config.DEFAULT.getWayPointPosition()){
                        mCollectedWayPoints++;
                    }
                    mAgentYCord = mAgentYCord + 1;
                }
                break;
            case WEST:
                if (!mMaze.isWallWest()) {
                    if(mMaze.getGrid()[mAgentXCord-1][mAgentYCord] == Config.DEFAULT.getWayPointPosition()){
                        mCollectedWayPoints++;
                    }
                    mAgentXCord = mAgentXCord - 1;
                }
                break;
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
        mMaze = new Maze();
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
