package com.example.holyquran;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ProgressBar;

public class SplashScreen extends AppCompatActivity {
    private ProgressBar progressBar;
    private int progress;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash_screen);




        progressBar = findViewById(R.id.progressBarID);

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                doWork();
                startApp();
            }
        });

        thread.start();
    }

    private void startApp() {

        startActivity(new Intent(SplashScreen.this,MainActivity.class));
        finish();

    }

    private void doWork() {

        for(progress = 20;progress<=100;progress=progress+20){

            try{
                Thread.sleep(100);
                progressBar.setProgress(progress);
            } catch (InterruptedException e){

                e.printStackTrace();
            }
        }
    }
}
