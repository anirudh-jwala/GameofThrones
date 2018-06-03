package com.example.anirudh.gameofthrones;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
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

    public void q1checkAnswer(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.q1radioButton1:
                break;
            case R.id.q1radioButton2:
                if (checked)
                    quizScore++;
                break;
            case R.id.q1radioButton3:
                break;
            case R.id.q1radioButton4:
                break;
        }
    }

    public void q2checkAnswer(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.q2radioButton1:
                break;
            case R.id.q2radioButton2:
                if (checked)
                    quizScore++;
                break;
            case R.id.q2radioButton3:
                break;
            case R.id.q2radioButton4:
                break;
        }
    }

    public void q3CheckAnswer(View view) {
        answer1 = findViewById(R.id.q3checkBox1);
        answer2 = findViewById(R.id.q3checkBox2);
        answer3 = findViewById(R.id.q3checkBox3);
        answer4 = findViewById(R.id.q3checkBox4);
        answer5 = findViewById(R.id.q3checkBox5);

        if (answer1.isChecked() && answer2.isChecked() && answer4.isChecked()) {
            quizScore++;
        }
    }

    public void q4CheckAnswer(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.q4radioButton1:
                if (checked)
                    quizScore++;
                break;
            case R.id.q4radioButton2:
                break;
            case R.id.q4radioButton3:
                break;
            case R.id.q4radioButton4:
                break;
        }
    }

    public void submitButton(View view) {
        EditText text = findViewById(R.id.name_field);
        String name = text.getText().toString();
        Toast.makeText(getBaseContext(),
                name + " your score is: " + quizScore, Toast.LENGTH_LONG).show();
    }
}
