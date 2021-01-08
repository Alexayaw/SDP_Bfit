package com.example.sdp_bfit.signupandlogin;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SignUpandLoginViewModel extends ViewModel{
    private MutableLiveData<String> mText;

    public SignUpandLoginViewModel() {
        mText = new MutableLiveData<>();
    }

    public LiveData<String> getText() {
        return mText;
    }
}
