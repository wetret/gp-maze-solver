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
    private int       mStepsTaken;

    public Agent(IMoveNode pRoot, Maze pMaze) {
        mRoot = pRoot;
        mMaze = pMaze;

        mAgentXCord = Config.DEFAULT.getAgentXCordStart();
        mAgentYCord = Config.DEFAULT.getAgentYCordStart();

        mFitness = 100000;
        mGoalReached = false;
        mCollectedWayPoints = 0;
        mStepsTaken = 0;
    }

    public Agent(Agent pAgent) {
        mRoot = (IMoveNode) pAgent.getEvaluationTree().getCopy();
        int mazeNumber = pAgent.getMaze().getMazeNumber();
        mMaze = new Maze(mazeNumber);

        mAgentXCord = Config.DEFAULT.getAgentXCordStart();
        mAgentYCord = Config.DEFAULT.getAgentYCordStart();

        mFitness = pAgent.getFitness();
        mGoalReached = pAgent.isGoalReached();
        mCollectedWayPoints = pAgent.getCollectedWayPoints();
        mStepsTaken = pAgent.getStepsTaken();
    }

    public boolean move() {
        mStepsTaken++;
        Move move = mRoot.evaluate(mMaze);

        switch (move) {
            case NORTH:
                if (!mMaze.isWallNorth()) {
                    mAgentYCord = mAgentYCord - 1;
                }
                break;
            case EAST:
                if (!mMaze.isWallEast()) {
                    mAgentXCord = mAgentXCord + 1;
                }
                break;
            case SOUTH:
                if (!mMaze.isWallSouth()) {
                    mAgentYCord = mAgentYCord + 1;
                }
                break;
            case WEST:
                if (!mMaze.isWallWest()) {
                    mAgentXCord = mAgentXCord - 1;
                }
                break;
        }

        if (mMaze.getGrid()[mAgentXCord][mAgentYCord] == Config.DEFAULT.getWayPointPosition()) {
            mCollectedWayPoints++;
        }

        if (goalReached()) {
            mGoalReached = true;
            return false;
        }

        mMaze.setNewAgentCord(mAgentXCord, mAgentYCord);
        return true;
    }

    private boolean goalReached() {
        if (mMaze.getGrid()[mAgentXCord][mAgentYCord] == Config.DEFAULT.getGoalPosition()) {
            return true;
        } else {
            return false;
        }
    }

    public void resetValues() {
        mAgentXCord = Config.DEFAULT.getAgentXCordStart();
        mAgentYCord = Config.DEFAULT.getAgentYCordStart();
        int mazeNumber = mMaze.getMazeNumber();
        mMaze = new Maze(mazeNumber);
        mGoalReached = false;
        mCollectedWayPoints = 0;
        mStepsTaken = 0;
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

    public int getStepsTaken() {
        return mStepsTaken;
    }

    public void setStepsTaken(int pStepsTaken) {
        mStepsTaken = pStepsTaken;
    }
}
