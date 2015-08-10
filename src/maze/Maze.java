package maze;

import tree.EOrientation;
import utils.Config;


public class Maze {

    private int[][] mGrid;
    private int     mAgentCordX;
    private int     mAgentCordY;
    private int     mMazeNumber;

    public Maze(int pMazeNumber) {
        mAgentCordX = Config.DEFAULT.getAgentXCordStart();
        mAgentCordY = Config.DEFAULT.getAgentYCordStart();
        mMazeNumber = pMazeNumber;

        init();
    }

    private void init() {
        mGrid = MazeBuilder.build(mMazeNumber);
    }

    public int getMazeNumber() {
        return mMazeNumber;
    }

    public boolean isWallAhead(EOrientation pOrientation) {
        boolean answer = false;

        if (pOrientation == EOrientation.EAST) {
            if (mGrid[mAgentCordX + 1][mAgentCordY] == Config.DEFAULT.getWallPosition()) {
                answer = true;
            }
        } else if (pOrientation == EOrientation.SOUTH) {
            if (mGrid[mAgentCordX][mAgentCordY + 1] == Config.DEFAULT.getWallPosition()) {
                answer = true;
            }
        } else if (pOrientation == EOrientation.WEST) {
            if (mGrid[mAgentCordX - 1][mAgentCordY] == Config.DEFAULT.getWallPosition()) {
                answer = true;
            }
        } else {
            // Orientation is NORTH
            if (mGrid[mAgentCordX][mAgentCordY - 1] == Config.DEFAULT.getWallPosition()) {
                answer = true;
            }
        }

        return answer;
    }

    public boolean isWallLeft(EOrientation pOrientation) {
        boolean answer = false;

        if (pOrientation == EOrientation.EAST) {
            if (mGrid[mAgentCordX][mAgentCordY - 1] == Config.DEFAULT.getWallPosition()) {
                answer = true;
            }
        } else if (pOrientation == EOrientation.SOUTH) {
            if (mGrid[mAgentCordX + 1][mAgentCordY] == Config.DEFAULT.getWallPosition()) {
                answer = true;
            }
        } else if (pOrientation == EOrientation.WEST) {
            if (mGrid[mAgentCordX][mAgentCordY + 1] == Config.DEFAULT.getWallPosition()) {
                answer = true;
            }
        } else {
            // Orientation is NORTH
            if (mGrid[mAgentCordX - 1][mAgentCordY] == Config.DEFAULT.getWallPosition()) {
                answer = true;
            }
        }

        return answer;
    }

    public boolean isWallLeftAhead(EOrientation pOrientation) {
        boolean answer = false;

        if (pOrientation == EOrientation.EAST) {
            if (mGrid[mAgentCordX + 1][mAgentCordY - 1] == Config.DEFAULT.getWallPosition()) {
                answer = true;
            }
        } else if (pOrientation == EOrientation.SOUTH) {
            if (mGrid[mAgentCordX + 1][mAgentCordY + 1] == Config.DEFAULT.getWallPosition()) {
                answer = true;
            }
        } else if (pOrientation == EOrientation.WEST) {
            if (mGrid[mAgentCordX - 1][mAgentCordY + 1] == Config.DEFAULT.getWallPosition()) {
                answer = true;
            }
        } else {
            // Orientation is NORTH
            if (mGrid[mAgentCordX - 1][mAgentCordY - 1] == Config.DEFAULT.getWallPosition()) {
                answer = true;
            }
        }

        return answer;
    }

    public boolean isWallRight(EOrientation pOrientation) {
        boolean answer = false;

        if (pOrientation == EOrientation.EAST) {
            if (mGrid[mAgentCordX][mAgentCordY + 1] == Config.DEFAULT.getWallPosition()) {
                answer = true;
            }
        } else if (pOrientation == EOrientation.SOUTH) {
            if (mGrid[mAgentCordX - 1][mAgentCordY] == Config.DEFAULT.getWallPosition()) {
                answer = true;
            }
        } else if (pOrientation == EOrientation.WEST) {
            if (mGrid[mAgentCordX][mAgentCordY - 1] == Config.DEFAULT.getWallPosition()) {
                answer = true;
            }
        } else {
            // Orientation is NORTH
            if (mGrid[mAgentCordX + 1][mAgentCordY] == Config.DEFAULT.getWallPosition()) {
                answer = true;
            }
        }

        return answer;
    }

    public boolean isWallRightAhead(EOrientation pOrientation) {
        boolean answer = false;

        if (pOrientation == EOrientation.EAST) {
            if (mGrid[mAgentCordX + 1][mAgentCordY + 1] == Config.DEFAULT.getWallPosition()) {
                answer = true;
            }
        } else if (pOrientation == EOrientation.SOUTH) {
            if (mGrid[mAgentCordX - 1][mAgentCordY + 1] == Config.DEFAULT.getWallPosition()) {
                answer = true;
            }
        } else if (pOrientation == EOrientation.WEST) {
            if (mGrid[mAgentCordX - 1][mAgentCordY - 1] == Config.DEFAULT.getWallPosition()) {
                answer = true;
            }
        } else {
            // Orientation is NORTH
            if (mGrid[mAgentCordX + 1][mAgentCordY - 1] == Config.DEFAULT.getWallPosition()) {
                answer = true;
            }
        }

        return answer;
    }

    public void setNewAgentCord(int pNewXCord, int pNewYCord) {
        mGrid[mAgentCordX][mAgentCordY] = Config.DEFAULT.getNotWallPosition();
        mAgentCordX = pNewXCord;
        mAgentCordY = pNewYCord;
        mGrid[mAgentCordX][mAgentCordY] = Config.DEFAULT.getAgentPosition();
    }

    public int[][] getGrid() {
        return mGrid;
    }

    public int getFiledValue(int pXCord, int pYCord) {
        return mGrid[pXCord][pYCord];
    }
}
