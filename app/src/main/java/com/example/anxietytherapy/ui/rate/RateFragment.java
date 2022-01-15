package com.example.anxietytherapy.ui.rate;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProvider;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;


import android.view.View;

import com.example.anxietytherapy.R;
import com.example.anxietytherapy.databinding.FragmentHomeBinding;
import com.example.anxietytherapy.databinding.FragmentRateBinding;
import com.example.anxietytherapy.ui.rate.RateViewModel;

public class RateFragment extends Fragment {
    private RateViewModel rateViewModel;
    private FragmentRateBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        //rateViewModel =
               // new ViewModelProvider(this, new ViewModelProvider.NewInstanceFactory()).get(RateViewModel.class);

        binding = FragmentRateBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

       // final TextView textView = binding.textHome;
        //homeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
           // @Override
            //public void onChanged(@Nullable String s) {
                //textView.setText(s);
            //}
       // });
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }


}