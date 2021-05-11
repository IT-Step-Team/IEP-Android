package com.example.imovi.ui.frlist;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FriendslistViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public FriendslistViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is frlist fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}