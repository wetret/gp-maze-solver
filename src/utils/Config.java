package utils;


public enum Config {
    DEFAULT(20, 20, 7, 100, 100, 10, 10, 0, 1, 2);
   

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

    Config(int pGridWidth, int pGridHeight, int pPixelSize, int pXCord, int pYCord, int pAgentXCordStart, int pAgentYCordStart, int pNotWallPosition, int pWallPosition, int pAgentPosition) {
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

}
