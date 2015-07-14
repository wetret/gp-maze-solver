package utils;


public enum Config {
    DEFAULT(75,50, 7, 100, 100);
   

    private int mGridWidth;
    private int mGridHeight;
    private int mPixelSize;
    private int mXCord;
    private int mYCord;

    Config(int pGridWidth, int pGridHeight, int pPixelSize, int pXCord, int pYCord) {
        mGridWidth = pGridWidth;
        mGridHeight = pGridHeight;
        mPixelSize = pPixelSize;
        mXCord = pXCord;
        mYCord = pYCord;
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

}
