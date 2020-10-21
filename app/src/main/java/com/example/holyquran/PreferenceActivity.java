package com.example.holyquran;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class PreferenceActivity extends AppCompatActivity {
    private RadioGroup radioGroup;
    private RadioButton horizontalRB,verticalRB;
    private Button saveButton;
    private TextView modeTV;
    private Switch modeSwitch;
    String text=null;

    TextView textView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preference);

        radioGroup = findViewById(R.id.radioGroup);
        horizontalRB = findViewById(R.id.horizontalRB);
        verticalRB = findViewById(R.id.verticalRB);
        saveButton = findViewById(R.id.saveButtn);
        modeTV = findViewById(R.id.modeTV);
        modeSwitch = findViewById(R.id.modeSwitch);
        textView1 = findViewById(R.id.selectOptionTV);


        modeSwitch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (modeSwitch.isChecked()){
                    modeTV.setText("Enabled");
                }
                else {
                    modeTV.setText("Disabled");
                }
            }
        });




        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String horizontalButtn = textView1.getText().toString();
                String modeTextView =  modeTV.getText().toString();

                Toast.makeText(PreferenceActivity.this, horizontalButtn, Toast.LENGTH_SHORT).show();
               // Toast.makeText(PreferenceActivity.this, modeTextView, Toast.LENGTH_SHORT).show();

            }
        });

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {


                switch (checkedId){
                    case R.id.horizontalRB:
                        text = horizontalRB.getText().toString();

                        break;
                    case R.id.verticalRB:
                        text = verticalRB.getText().toString();

                        break;


                    default:
                        break;
                }


                textView1.setText(text);

            }
        });

    }

}
