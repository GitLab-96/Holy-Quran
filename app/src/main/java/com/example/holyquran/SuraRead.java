package com.example.holyquran;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.scroll.DefaultScrollHandle;


/**
 * A simple {@link Fragment} subclass.
 */
public class SuraRead extends Fragment {

    PDFView quranPdf;

    public SuraRead() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_sura_read, container, false);

        quranPdf = view.findViewById(R.id.readQuranPDF);

        quranPdf.fromAsset("hifjquran.pdf")
                .defaultPage(0)
                .enableAnnotationRendering(true)
                .enableSwipe(true)
                .swipeHorizontal(true)
                .enableDoubletap(true)
                .pageFling(true)
                .pageSnap(true)
                .autoSpacing(true)
                .nightMode(true)
                .scrollHandle(new DefaultScrollHandle(getContext(),true))
                .spacing(2).load();

    return view;
    }

}
