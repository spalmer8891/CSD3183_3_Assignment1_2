package com.converter.assignment_1_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.ToggleButton;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity {

    Spinner spinner;
    TextView textView;
    TextView voterName;
    TextView voterID;
    TextView displayMsg;

    // create a new ArrayList
    List aList = new ArrayList();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        spinner = findViewById(R.id.candidates);
        textView = findViewById(R.id.name_id);

    }

    public void vote(View view){
//        textView.setText(spinner.getSelectedItem().toString());
          String spinnerValue = spinner.getSelectedItem().toString();
        Integer count1=0;
        Integer count2=0;
        Integer count3=0;

        Intent intent = new Intent(this,MainActivity.class);
        count1+=1;
        count2+=1;
        count3+=1;

        intent.putExtra("candidate1Count",count1.toString());
        intent.putExtra("candidate2Count",count1.toString());
        intent.putExtra("candidate2Count",count1.toString());
        startActivity(intent);


        aList.add(spinnerValue);

//        if(spinnerValue.toString().equals("Candidate 1"))
//        {
//            intent.putExtra("candidate1Count",count1.toString());
//        }
//        if(!voterName.getText().toString().isEmpty() || !voterID.getText().toString().isEmpty())
//        {
//            displayMsg.setText("Please enter voter name or voter ID");
//        }
//        else{
//
//        }
    }

}
