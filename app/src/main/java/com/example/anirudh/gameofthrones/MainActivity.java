package com.example.anirudh.gameofthrones;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int quizScore = 0;

    CheckBox answer1;
    CheckBox answer2;
    CheckBox answer3;
    CheckBox answer4;
    CheckBox answer5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void submitButton(View view) {
        EditText text = findViewById(R.id.name_field);
        String name = text.getText().toString().trim();

        RadioGroup rg1 = (RadioGroup) findViewById(R.id.q1radioGroup);
        if (rg1.getCheckedRadioButtonId() == R.id.q1radioButton2) {
            quizScore++;
        }

        RadioGroup rg2 = (RadioGroup) findViewById(R.id.q2radioGroup);
        if (rg2.getCheckedRadioButtonId() == R.id.q2radioButton2) {
            quizScore++;
        }

        answer1 = findViewById(R.id.q3checkBox1);
        answer2 = findViewById(R.id.q3checkBox2);
        answer3 = findViewById(R.id.q3checkBox3);
        answer4 = findViewById(R.id.q3checkBox4);
        answer5 = findViewById(R.id.q3checkBox5);

        if (answer1.isChecked() && answer2.isChecked() && !answer3.isChecked() && answer4.isChecked() && !answer5.isChecked()) {
            quizScore++;
        }

        RadioGroup rg3 = (RadioGroup) findViewById(R.id.q4radioGroup);
        if (rg3.getCheckedRadioButtonId() == R.id.q4radioButton1) {
            quizScore++;
        }

        Toast.makeText(getBaseContext(),
                name + " your score is: " + quizScore, Toast.LENGTH_LONG).show();

        quizScore = 0;
    }
}
