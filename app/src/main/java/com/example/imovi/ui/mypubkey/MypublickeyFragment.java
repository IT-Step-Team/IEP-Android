package com.example.imovi.ui.mypubkey;

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

public class MypublickeyFragment extends Fragment {

    private MypublickeyViewModel mypublickeyViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mypublickeyViewModel = new ViewModelProvider(this).get(MypublickeyViewModel.class);
        View root = inflater.inflate(R.layout.fragment_enc, container, false);
        mypublickeyViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                ;
            }
        });
        return root;
    }
}