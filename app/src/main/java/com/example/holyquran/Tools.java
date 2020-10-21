package com.example.holyquran;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class Tools extends Fragment {

    private TextView shareTV,contactUsTV,preferenceTV,moreAppTV;

    Intent intent = null, chooser=null;

    public Tools() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tools, container, false);

        shareTV = view.findViewById(R.id.shareAppId);
        contactUsTV = view.findViewById(R.id.contactUs);
        preferenceTV = view.findViewById(R.id.preferenceID);
        moreAppTV = view.findViewById(R.id.moreApp);

        preferenceTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getContext(),PreferenceActivity.class);
                startActivity(intent);
            }
        });
        contactUsTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                intent = new Intent(Intent.ACTION_SEND);
                intent.setData(Uri.parse("mailto:"));
                String[] to = {"shukhernahor1996@gmail.com"};
                intent.putExtra(Intent.EXTRA_EMAIL,to);
                intent.putExtra(Intent.EXTRA_SUBJECT,"Thanksfully");
                intent.putExtra(Intent.EXTRA_TEXT,"Holly Quran isThe best app of the World");
                intent.setType("message/rfc822");
                chooser = Intent.createChooser(intent,"Send Email");
                startActivity(chooser);
            }
        });
shareTV.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        String subject = "App Sharing Practice";
        String body = "I am Sumon";
        intent.putExtra(Intent.EXTRA_SUBJECT,subject);
        intent.putExtra(Intent.EXTRA_TEXT,body);
        startActivity(Intent.createChooser(intent,"share with"));
    }
});



        return view;
    }

}
