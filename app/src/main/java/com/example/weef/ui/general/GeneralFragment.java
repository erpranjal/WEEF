package com.example.weef.ui.general;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.example.weef.R;
import com.github.barteksc.pdfviewer.PDFView;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class GeneralFragment extends Fragment {

    private GeneralViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel = ViewModelProviders.of(this).get(GeneralViewModel.class);



        View root = inflater.inflate(R.layout.general, container, false);
        root.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.lefttoright));
        PDFView pdfView=root.findViewById(R.id.pdfView);
        pdfView.fromAsset("schedule.pdf");

        return root;
    }
}