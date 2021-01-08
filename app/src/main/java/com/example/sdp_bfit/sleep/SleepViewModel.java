package com.example.sdp_bfit.sleep;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SleepViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public SleepViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is sleep fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}