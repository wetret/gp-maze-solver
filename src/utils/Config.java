package utils;


public enum Config {
    DEFAULT(50, 7, 100, 100);
   

    private int mGridSize;
    private int mPixelSize;
    private int mXCord;
    private int mYCord;

    Config(int pGridSize, int pPixelSize, int pXCord, int pYCord) {
        mGridSize = pGridSize;
        mPixelSize = pPixelSize;
        mXCord = pXCord;
        mYCord = pYCord;
    }

    public int getGridSize() {
        return mGridSize;
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
