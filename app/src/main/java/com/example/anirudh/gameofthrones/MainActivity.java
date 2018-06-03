package com.example.anirudh.gameofthrones;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int quizScore = 0;

    CheckBox answer1;
    CheckBox answer2;
    CheckBox answer3;
    CheckBox answer4;
    CheckBox answer5;

    RadioButton q1radioButton;
    RadioButton q3radioButton;
    RadioButton q5radioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void q1checkAnswer(View view) {
        q1radioButton = (RadioButton) findViewById(R.id.q1radioButton2);
        q1radioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.q1radioButton2:
                        if (q1radioButton.isSelected())
                            quizScore++;
                        break;
                }
            }
        });
    }

    public void q2checkAnswer(View view) {
        EditText text = (EditText) findViewById(R.id.q2_answer);
        String answerValue = text.getText().toString();
        if (answerValue.equalsIgnoreCase("The Mountain") || answerValue.equalsIgnoreCase("Mountain")) {
            quizScore++;
        }
    }


    public void q3checkAnswer(View view) {
        q3radioButton = (RadioButton) findViewById(R.id.q3radioButton2);
        q3radioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.q3radioButton2:
                        if (q3radioButton.isSelected())
                            quizScore++;
                        break;
                }
            }
        });
    }

    public void q4CheckAnswer(View view) {
        answer1 = (CheckBox) findViewById(R.id.q4checkBox1);
        answer2 = (CheckBox) findViewById(R.id.q4checkBox2);
        answer3 = (CheckBox) findViewById(R.id.q4checkBox3);
        answer4 = (CheckBox) findViewById(R.id.q4checkBox4);
        answer5 = (CheckBox) findViewById(R.id.q4checkBox5);

        if (answer1.isChecked() && answer2.isChecked() && !answer3.isChecked() && answer4.isChecked() && !answer5.isChecked()) {
            quizScore++;
        }
    }

    public void q5CheckAnswer(View view) {
        q5radioButton = (RadioButton) findViewById(R.id.q5radioButton1);
        q5radioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.q5radioButton1:
                        if (q5radioButton.isSelected())
                            quizScore++;
                        break;
                }
            }
        });
    }

    public void submitButton(View view) {
        EditText text = (EditText) findViewById(R.id.name_field);
        String name = text.getText().toString();
        Toast.makeText(getBaseContext(), name + " your score is: " + quizScore, Toast.LENGTH_LONG).show();
    }
}
