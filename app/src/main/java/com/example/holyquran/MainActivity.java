package com.example.holyquran;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    FrameLayout frameLayout;
    BottomNavigationView navigationView;

    boolean exit = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        FragmentTransaction ft1 = getSupportFragmentManager().beginTransaction();
        ft1.replace(R.id.framLayout,new SuraRead());
        ft1.commit();

        navigationView.setOnNavigationItemSelectedListener(naviCustomListView);
    }

   private BottomNavigationView.OnNavigationItemSelectedListener naviCustomListView = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

           switch (menuItem.getItemId()){

               case R.id.open_quran_Item:
                   FragmentTransaction ft1 = getSupportFragmentManager().beginTransaction();
                   ft1.replace(R.id.framLayout,new SuraRead());
                   ft1.commit();
                 break;

               case R.id.sura_Item:
                   FragmentTransaction ft2 = getSupportFragmentManager().beginTransaction();
                   ft2.replace(R.id.framLayout,new SuraList());
                   ft2.commit();
                   break;

               case R.id.para_Item:
                   FragmentTransaction ft3 = getSupportFragmentManager().beginTransaction();
                   ft3.replace(R.id.framLayout,new ParaList());
                   ft3.commit();
                   break;
               case R.id.bookmarks_Item:
                   FragmentTransaction ft4 = getSupportFragmentManager().beginTransaction();
                   ft4.replace(R.id.framLayout,new BookMarks());
                   ft4.commit();
                   break;
               case R.id.tools_Item:
                   FragmentTransaction ft5 = getSupportFragmentManager().beginTransaction();
                   ft5.replace(R.id.framLayout,new Tools());
                   ft5.commit();
                   break;
           }

            return true;
        }
    };

    private void init() {

        navigationView = findViewById(R.id.bottom_navigation);
        frameLayout=findViewById(R.id.framLayout);
    }

    @Override
    public void onBackPressed() {



        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Do You Exit ?");
        builder.setMessage("Are you Sure do you want to quit ?");
        builder.setPositiveButton("Exit", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {



                exit = true;
                getOutApp(exit);


            }
        });

        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {

                exit = false;
                getOutApp(exit);
            }
        });

        builder.create();
        builder.show();
    }

    public void  getOutApp(boolean exit){
        if (exit==true){
            super.onBackPressed();
        }
        else {
            Toast.makeText(this, "Thanks for Reciting the Holly Quran", Toast.LENGTH_SHORT).show();
        }
    }
}
