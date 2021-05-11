package com.example.imovi.ui.encrypt;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.imovi.R;

public class EncryptFragment extends Fragment {

    private EncryptViewModel encryptViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        encryptViewModel = new ViewModelProvider(this).get(EncryptViewModel.class);
        View root = inflater.inflate(R.layout.fragment_enc, container, false);
        encryptViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                ;
            }
        });
        return root;
    }
}