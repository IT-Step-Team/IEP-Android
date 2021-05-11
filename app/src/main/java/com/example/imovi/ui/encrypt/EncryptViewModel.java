package com.example.imovi.ui.encrypt;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class EncryptViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public EncryptViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is encrypt fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}