package utils;


public enum Config {
    
    // for maze 1 - 5
    DEFAULT(41, 41, 7, 100, 100, 1, 2, 0, 1, 2, 3, 4, 5, 0, 2, 40, 2, 750, 0.25);

    private int mGridWidth;
    private int mGridHeight;
    private int mPixelSize;
    private int mXCord;
    private int mYCord;
    private int mAgentXCordStart;
    private int mAgentYCordStart;
    private int mNotWallPosition;
    private int mWallPosition;
    private int mAgentPosition;
    private int mGoalPosition;
    private int mEntryPosition;
    private int mWayPointPosition;
    private int mEntryCordX;
    private int mEntryCordY;
    private int mGoalCordX;
    private int mGoalCordY;
    private int mMaxMoves;
    private double mMutationPercentage;

    Config(int pGridWidth, int pGridHeight, int pPixelSize, int pXCord, int pYCord, int pAgentXCordStart, int pAgentYCordStart, 
            int pNotWallPosition, int pWallPosition, int pAgentPosition, int pGoalPosition, int pEntryPosition, int pWayPointPosition, int pEntryCordX, int pEntryCordY, int pGoalCordX, 
            int pGoalCordY, int pMaxMoves, double pMutationPercentage) {
        mGridWidth = pGridWidth;
        mGridHeight = pGridHeight;
        mPixelSize = pPixelSize;
        mXCord = pXCord;
        mYCord = pYCord;
        mAgentXCordStart = pAgentXCordStart;
        mAgentYCordStart = pAgentYCordStart;
        mNotWallPosition = pNotWallPosition;
        mWallPosition = pWallPosition;
        mAgentPosition = pAgentPosition;
        mGoalPosition = pGoalPosition;
        mEntryPosition = pEntryPosition;
        mWayPointPosition = pWayPointPosition;
        mEntryCordX = pEntryCordX;
        mEntryCordY = pEntryCordY;
        mGoalCordX = pGoalCordX;
        mGoalCordY = pGoalCordY;
        mMaxMoves = pMaxMoves;
        mMutationPercentage = pMutationPercentage;
    }
    
    public int getGridWidth() {
        return mGridWidth;
    }
    
    public int getGridHeight() {
        return mGridHeight;
    }

    public int getPixelSize() {
        return mPixelSize;
    }

    public int getXCord() {
        return mXCord;
    }

    public int getYCord() {
        return mYCord;
    }
    
    public int getAgentXCordStart() {
        return mAgentXCordStart;
    }
    
    public int getAgentYCordStart() {
        return mAgentYCordStart;
    }
    
    public int getNotWallPosition(){
        return mNotWallPosition;
    }
    
    public int getWallPosition(){
        return mWallPosition;
    }
    
    public int getAgentPosition(){
        return mAgentPosition;
    }
    
    public int getGoalPosition(){
        return mGoalPosition;
    }
    
    public int getGoalCordX(){
        return mGoalCordX;
    }
    
    public int getGoalCordY(){
        return mGoalCordY;
    }
    
    public int getMaxMoves(){
        return mMaxMoves;
    }
    
    public double getMutationPercentage(){
        return mMutationPercentage;
    }
    
    public int getEntryPosition(){
        return mEntryPosition;
    }
    
    public int getEntryCordX(){
        return mEntryCordX;
    }
    
    public int getEntryCordY(){
        return mEntryCordY;
    }

    public int getWayPointPosition() {
        return mWayPointPosition;
    }

    public void setWayPointPosition(int pWayPointPosition) {
        mWayPointPosition = pWayPointPosition;
    }

}
