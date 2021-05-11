package com.example.imovi.ui.mypubkey;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MypublickeyViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public MypublickeyViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is mypubkey fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}