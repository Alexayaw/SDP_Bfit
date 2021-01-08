package com.example.sdp_bfit.signupandlogin;
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

import com.example.sdp_bfit.R;

public class SignUpandLoginFragment extends Fragment {

    private com.example.sdp_bfit.signupandlogin.SignUpandLoginViewModel SignUpandLoginViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        SignUpandLoginViewModel =
                new ViewModelProvider(this).get(com.example.sdp_bfit.signupandlogin.SignUpandLoginViewModel.class);
        View root = inflater.inflate(R.layout.fragment_landingpage, container, false);
        final TextView textView = root.findViewById(R.id.bfitlogo);
        SignUpandLoginViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }}
