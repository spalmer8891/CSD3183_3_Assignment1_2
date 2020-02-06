package com.converter.assignment_1_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    String candidate1Count;
    String candidate2Count;
    String candidate3Count;
    TextView candidate1CountString;
    TextView candidate2CountString;
    TextView candidate3CountString;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent1 = getIntent();
        Intent intent2 = getIntent();
        Intent intent3 = getIntent();
        candidate1Count = intent1.getStringExtra("candidate1Count");
        candidate2Count = intent2.getStringExtra("candidate2Count");
        candidate3Count = intent3.getStringExtra("candidate3Count");

        candidate1CountString = findViewById(R.id.candidate1_id);
        candidate2CountString = findViewById(R.id.candidate2_id);
        candidate3CountString = findViewById(R.id.candidate3_id);

        candidate1CountString.setText(candidate1Count);
        candidate2CountString.setText(candidate1Count);
        candidate3CountString.setText(candidate1Count);
    }

    public void vote(View view){
        /*we are going to the other activity */
        Intent intent = new Intent(this,Main2Activity.class);
        //intent.putExtra("EXTRA_SESSION_ID",textView.getText().toString());
        startActivity(intent);
    }

}
