package com.example.imovi.ui.frlist;

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

public class FriendsListFragment extends Fragment {

    private FriendsListViewModel friendsListViewModelViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        friendsListViewModelViewModel = new ViewModelProvider(this).get(FriendsListViewModel.class);
        View root = inflater.inflate(R.layout.fragment_friendslist, container, false);
//        final TextView textView = root.findViewById(R.id.text_slideshow);
//        friendsListViewModelViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
//            }
//        });
        return root;
    }
}