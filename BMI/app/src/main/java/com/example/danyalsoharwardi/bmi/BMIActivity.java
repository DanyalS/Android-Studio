package com.example.danyalsoharwardi.bmi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class BMIActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);
    }

    public void buttonClicked(View v) {

        // Step by step
        View weightView = findViewById(R.id.weightInput);
        EditText weightEdit = (EditText) weightView;
        String weight = weightEdit.getText().toString();

        // All in one
        String height = ((EditText) findViewById(R.id.heightInput)).getText().toString();

        BMIModel model = new BMIModel(weight, height);
        String output = model.getBMI();
        String weightPounds = model.getWeightInPound();

        ((TextView) findViewById(R.id.output)).setText("Your weight in pounds is " + weightPounds + " and your BMI is " + output);

    }
}
