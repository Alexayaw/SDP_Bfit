package com.example.sdp_bfit.calories;
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

public class CaloriesFragment extends Fragment {

    private CaloriesViewModel CaloriesViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        CaloriesViewModel =
                new ViewModelProvider(this).get(CaloriesViewModel.class);
        View root = inflater.inflate(R.layout.fragment_calories, container, false);
        final TextView textView = root.findViewById(R.id.txt_calories);
        CaloriesViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;

    }}
