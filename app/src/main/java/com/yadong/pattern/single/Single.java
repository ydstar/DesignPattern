package com.yadong.pattern.single;

/**
 * 双重校验的单例模式
 */
public class Single {

    private Single() {
    }

    private static Single mInstance = null;

    public static Single getInstance() {

        if (mInstance == null) {

            synchronized (Single.class) {

                if (mInstance == null) {
                    mInstance = new Single();
                }
            }
        }

        return mInstance;

    }

}
