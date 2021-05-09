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
import com.example.imovi.ui.enc.EncryptionViewModel;

public class MyPublicKeyFragment extends Fragment {

    private MyPublicKeyViewModel myPublicKeyViewModelkeyViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        myPublicKeyViewModelkeyViewModel = new ViewModelProvider(this).get(MyPublicKeyViewModel.class);
        View root = inflater.inflate(R.layout.fragment_encrypt, container, false);
//        final TextView textView = root.findViewById(R.id.text_home);
//        homeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
//            }
//        });
        return root;
    }
}