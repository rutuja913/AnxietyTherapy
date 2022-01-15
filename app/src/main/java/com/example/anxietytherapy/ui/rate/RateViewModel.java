package com.example.anxietytherapy.ui.rate;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;

public class RateViewModel {
    private MutableLiveData<String> mText;

    public RateViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
