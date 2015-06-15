package com.example.singletontest;

/**
 * 在安卓中位于android.util包下，是Hide类型的API
 * 
 *
 * @param <T>
 */

public abstract class Singleton<T> {
    private T mInstance;

    protected abstract T create();

    public final T get() {
        synchronized (this) {
            if (mInstance == null) {
                mInstance = create();
            }
            return mInstance;
        }
    }
}
