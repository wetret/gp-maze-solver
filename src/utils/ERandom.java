package utils;

import java.util.Random;


public enum ERandom {

    INSTANCE(new Random());

    private Random mRandom;

    private ERandom(Random pRandom) {
        mRandom = pRandom;
    }

    public Random getRandom() {
        return mRandom;
    }
}
