package com.example2017.android.viewmodel.LiveDate;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.content.Intent;

/**
 * Created by M7moud on 27-Mar-19.
 */
public class ViewModelLiveData extends ViewModel {

    MutableLiveData<Integer> mutableLiveData ;



    public MutableLiveData<Integer> getMutableLiveData() {
        if (mutableLiveData == null){
            mutableLiveData = new MutableLiveData<>();
            //initalize
            mutableLiveData.setValue(1);
        }
        return mutableLiveData;
    }


}
