package com.example2017.android.viewmodel;

import android.arch.lifecycle.ViewModel;

/**
 * Created by M7moud on 26-Mar-19.
 */
public class CounterViewModel extends ViewModel {
    int count;

    public CounterViewModel() {
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
