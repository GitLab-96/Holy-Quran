package com.example.holyquran;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.scroll.DefaultScrollHandle;


public class ParaList extends Fragment {
    ScrollView scrollViewList;
    PDFView pdfViewList;

    LinearLayout oneTV,twoTV,threeTV,fourTV,fiveTV,sixTV,sevenTV,eightTV,nineTV,tenTV,elevenTV,twoelveTV,thirtenTV,fourtenTV,fiftenTV,sixtenTV,seventenTV,
            eightenTV,nintenTV,twentyTV,twentyOneTV,twentyTwoTV,twentyThreeTV,twentyFourTV,twentyFiveTV,twentySixTV,twentySevenTV,twentyEightTV,twentyNineTV,thirty;


    public ParaList() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =inflater.inflate(R.layout.fragment_para_list, container, false);
        scrollViewList = view.findViewById(R.id.listParaScrolView);
        pdfViewList = view.findViewById(R.id.listParaPDF);



        oneTV = view.findViewById(R.id.paraOne);
        twoTV = view.findViewById(R.id.paraTwo);
        threeTV = view.findViewById(R.id.paraThree);
        fourTV = view.findViewById(R.id.paraFour);
        fiveTV = view.findViewById(R.id.paraFive);
        sixTV = view.findViewById(R.id.paraSix);
        sevenTV = view.findViewById(R.id.paraSeven);
        eightTV = view.findViewById(R.id.paraEight);
        nineTV = view.findViewById(R.id.paraNine);
        tenTV = view.findViewById(R.id.paraTen);
        elevenTV = view.findViewById(R.id.paraEleven);
        twoelveTV = view.findViewById(R.id.paraTwelve);
        thirtenTV = view.findViewById(R.id.paraThirten);
        fourtenTV = view.findViewById(R.id.paraFourten);
        fiftenTV = view.findViewById(R.id.paraFiften);
        sixtenTV = view.findViewById(R.id.paraSixten);
        seventenTV = view.findViewById(R.id.paraSeventen);
        eightenTV = view.findViewById(R.id.paraEighten);
        nintenTV = view.findViewById(R.id.paraNinten);
        twentyTV = view.findViewById(R.id.paraTwenty);
        twentyOneTV = view.findViewById(R.id.paraTwentyOne);
        twentyTwoTV = view.findViewById(R.id.paraTwentyTwo);
        twentyThreeTV = view.findViewById(R.id.paraTwentyThree);
        twentyFourTV = view.findViewById(R.id.paraTwentyFour);
        twentyFiveTV = view.findViewById(R.id.paraTwentyFive);
        twentySixTV = view.findViewById(R.id.paraTwentySix);
        twentySevenTV = view.findViewById(R.id.paraTwentySeven);
        twentyEightTV = view.findViewById(R.id.paraTwentyEight);
        twentyNineTV = view.findViewById(R.id.paraTwentyNine);
        thirty = view.findViewById(R.id.parathirty);


        oneTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                scrollViewList.setVisibility(View.GONE);
                pdfViewList.setVisibility(View.VISIBLE);
                pdfViewList.fromAsset("hifjquran.pdf").defaultPage(1)
                        .enableAnnotationRendering(true).scrollHandle(new DefaultScrollHandle(getContext()))
                        .spacing(2).load();
            }
        });

        twoTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                scrollViewList.setVisibility(View.GONE);
                pdfViewList.setVisibility(View.VISIBLE);
                pdfViewList.fromAsset("hifjquran.pdf").defaultPage(22)
                        .enableAnnotationRendering(true).scrollHandle(new DefaultScrollHandle(getContext()))
                        .spacing(2).load();
            }
        });

        threeTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                scrollViewList.setVisibility(View.GONE);
                pdfViewList.setVisibility(View.VISIBLE);
                pdfViewList.fromAsset("hifjquran.pdf").defaultPage(42)
                        .enableAnnotationRendering(true).scrollHandle(new DefaultScrollHandle(getContext()))
                        .spacing(2).load();
            }
        });

        fourTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                scrollViewList.setVisibility(View.GONE);
                pdfViewList.setVisibility(View.VISIBLE);
                pdfViewList.fromAsset("hifjquran.pdf").defaultPage(62)
                        .enableAnnotationRendering(true).scrollHandle(new DefaultScrollHandle(getContext()))
                        .spacing(2).load();
            }
        });
        fiveTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                scrollViewList.setVisibility(View.GONE);
                pdfViewList.setVisibility(View.VISIBLE);
                pdfViewList.fromAsset("hifjquran.pdf").defaultPage(82)
                        .enableAnnotationRendering(true).scrollHandle(new DefaultScrollHandle(getContext()))
                        .spacing(2).load();
            }
        });

        sixTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                scrollViewList.setVisibility(View.GONE);
                pdfViewList.setVisibility(View.VISIBLE);
                pdfViewList.fromAsset("hifjquran.pdf").defaultPage(102)
                        .enableAnnotationRendering(true).scrollHandle(new DefaultScrollHandle(getContext()))
                        .spacing(2).load();
            }
        });
        sevenTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                scrollViewList.setVisibility(View.GONE);
                pdfViewList.setVisibility(View.VISIBLE);
                pdfViewList.fromAsset("hifjquran.pdf").defaultPage(122)
                        .enableAnnotationRendering(true).scrollHandle(new DefaultScrollHandle(getContext()))
                        .spacing(2).load();
            }
        });

        eightTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                scrollViewList.setVisibility(View.GONE);
                pdfViewList.setVisibility(View.VISIBLE);
                pdfViewList.fromAsset("hifjquran.pdf").defaultPage(142)
                        .enableAnnotationRendering(true).scrollHandle(new DefaultScrollHandle(getContext()))
                        .spacing(2).load();
            }
        });
        nineTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                scrollViewList.setVisibility(View.GONE);
                pdfViewList.setVisibility(View.VISIBLE);
                pdfViewList.fromAsset("hifjquran.pdf").defaultPage(162)
                        .enableAnnotationRendering(true).scrollHandle(new DefaultScrollHandle(getContext()))
                        .spacing(2).load();
            }
        });

        tenTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                scrollViewList.setVisibility(View.GONE);
                pdfViewList.setVisibility(View.VISIBLE);
                pdfViewList.fromAsset("hifjquran.pdf").defaultPage(182)
                        .enableAnnotationRendering(true).scrollHandle(new DefaultScrollHandle(getContext()))
                        .spacing(2).load();
            }
        });
        elevenTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                scrollViewList.setVisibility(View.GONE);
                pdfViewList.setVisibility(View.VISIBLE);
                pdfViewList.fromAsset("hifjquran.pdf").defaultPage(202)
                        .enableAnnotationRendering(true).scrollHandle(new DefaultScrollHandle(getContext()))
                        .spacing(2).load();
            }
        });

        twoelveTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                scrollViewList.setVisibility(View.GONE);
                pdfViewList.setVisibility(View.VISIBLE);
                pdfViewList.fromAsset("hifjquran.pdf").defaultPage(222)
                        .enableAnnotationRendering(true).scrollHandle(new DefaultScrollHandle(getContext()))
                        .spacing(2).load();
            }
        });
        thirtenTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                scrollViewList.setVisibility(View.GONE);
                pdfViewList.setVisibility(View.VISIBLE);
                pdfViewList.fromAsset("hifjquran.pdf").defaultPage(242)
                        .enableAnnotationRendering(true).scrollHandle(new DefaultScrollHandle(getContext()))
                        .spacing(2).load();
            }
        });
        fourtenTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                scrollViewList.setVisibility(View.GONE);
                pdfViewList.setVisibility(View.VISIBLE);
                pdfViewList.fromAsset("hifjquran.pdf").defaultPage(262)
                        .enableAnnotationRendering(true).scrollHandle(new DefaultScrollHandle(getContext()))
                        .spacing(2).load();
            }
        });

        fiftenTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                scrollViewList.setVisibility(View.GONE);
                pdfViewList.setVisibility(View.VISIBLE);
                pdfViewList.fromAsset("hifjquran.pdf").defaultPage(282)
                        .enableAnnotationRendering(true).scrollHandle(new DefaultScrollHandle(getContext()))
                        .spacing(2).load();
            }
        });
        sixtenTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                scrollViewList.setVisibility(View.GONE);
                pdfViewList.setVisibility(View.VISIBLE);
                pdfViewList.fromAsset("hifjquran.pdf").defaultPage(302)
                        .enableAnnotationRendering(true).scrollHandle(new DefaultScrollHandle(getContext()))
                        .spacing(2).load();
            }
        });

        seventenTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                scrollViewList.setVisibility(View.GONE);
                pdfViewList.setVisibility(View.VISIBLE);
                pdfViewList.fromAsset("hifjquran.pdf").defaultPage(322)
                        .enableAnnotationRendering(true).scrollHandle(new DefaultScrollHandle(getContext()))
                        .spacing(2).load();
            }
        });



        eightenTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                scrollViewList.setVisibility(View.GONE);
                pdfViewList.setVisibility(View.VISIBLE);
                pdfViewList.fromAsset("hifjquran.pdf").defaultPage(342)
                        .enableAnnotationRendering(true).scrollHandle(new DefaultScrollHandle(getContext()))
                        .spacing(2).load();
            }
        });
        nintenTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                scrollViewList.setVisibility(View.GONE);
                pdfViewList.setVisibility(View.VISIBLE);
                pdfViewList.fromAsset("hifjquran.pdf").defaultPage(362)
                        .enableAnnotationRendering(true).scrollHandle(new DefaultScrollHandle(getContext()))
                        .spacing(2).load();
            }
        });
        twentyTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                scrollViewList.setVisibility(View.GONE);
                pdfViewList.setVisibility(View.VISIBLE);
                pdfViewList.fromAsset("hifjquran.pdf").defaultPage(382)
                        .enableAnnotationRendering(true).scrollHandle(new DefaultScrollHandle(getContext()))
                        .spacing(2).load();
            }
        });
        twentyOneTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                scrollViewList.setVisibility(View.GONE);
                pdfViewList.setVisibility(View.VISIBLE);
                pdfViewList.fromAsset("hifjquran.pdf").defaultPage(402)
                        .enableAnnotationRendering(true).scrollHandle(new DefaultScrollHandle(getContext()))
                        .spacing(2).load();
            }
        });
        twentyTwoTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                scrollViewList.setVisibility(View.GONE);
                pdfViewList.setVisibility(View.VISIBLE);
                pdfViewList.fromAsset("hifjquran.pdf").defaultPage(422)
                        .enableAnnotationRendering(true).scrollHandle(new DefaultScrollHandle(getContext()))
                        .spacing(2).load();
            }
        });
        twentyThreeTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                scrollViewList.setVisibility(View.GONE);
                pdfViewList.setVisibility(View.VISIBLE);
                pdfViewList.fromAsset("hifjquran.pdf").defaultPage(442)
                        .enableAnnotationRendering(true).scrollHandle(new DefaultScrollHandle(getContext()))
                        .spacing(2).load();
            }
        });
        twentyFourTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                scrollViewList.setVisibility(View.GONE);
                pdfViewList.setVisibility(View.VISIBLE);
                pdfViewList.fromAsset("hifjquran.pdf").defaultPage(462)
                        .enableAnnotationRendering(true).scrollHandle(new DefaultScrollHandle(getContext()))
                        .spacing(2).load();
            }
        });
        twentyFiveTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                scrollViewList.setVisibility(View.GONE);
                pdfViewList.setVisibility(View.VISIBLE);
                pdfViewList.fromAsset("hifjquran.pdf").defaultPage(482)
                        .enableAnnotationRendering(true).scrollHandle(new DefaultScrollHandle(getContext()))
                        .spacing(2).load();
            }
        });
        twentySixTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                scrollViewList.setVisibility(View.GONE);
                pdfViewList.setVisibility(View.VISIBLE);
                pdfViewList.fromAsset("hifjquran.pdf").defaultPage(502)
                        .enableAnnotationRendering(true).scrollHandle(new DefaultScrollHandle(getContext()))
                        .spacing(2).load();
            }
        });
        twentySevenTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                scrollViewList.setVisibility(View.GONE);
                pdfViewList.setVisibility(View.VISIBLE);
                pdfViewList.fromAsset("hifjquran.pdf").defaultPage(522)
                        .enableAnnotationRendering(true).scrollHandle(new DefaultScrollHandle(getContext()))
                        .spacing(2).load();
            }
        });
        twentyEightTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                scrollViewList.setVisibility(View.GONE);
                pdfViewList.setVisibility(View.VISIBLE);
                pdfViewList.fromAsset("hifjquran.pdf").defaultPage(542)
                        .enableAnnotationRendering(true).scrollHandle(new DefaultScrollHandle(getContext()))
                        .spacing(2).load();
            }
        });
        twentyNineTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                scrollViewList.setVisibility(View.GONE);
                pdfViewList.setVisibility(View.VISIBLE);
                pdfViewList.fromAsset("hifjquran.pdf").defaultPage(562)
                        .enableAnnotationRendering(true).scrollHandle(new DefaultScrollHandle(getContext()))
                        .spacing(2).load();
            }
        });

        thirty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                scrollViewList.setVisibility(View.GONE);
                pdfViewList.setVisibility(View.VISIBLE);
                pdfViewList.fromAsset("hifjquran.pdf").defaultPage(586)
                        .enableAnnotationRendering(true).scrollHandle(new DefaultScrollHandle(getContext()))
                        .spacing(10).load();
            }
        });


   return view;
    }

}
