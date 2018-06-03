package com.example.anirudh.gameofthrones;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // The entire quiz is of 7 points
    int quizScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void q1checkAnswer(View view) {
        boolean clicked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.q1radioButton1:
                if (clicked)
                    Toast.makeText(getBaseContext(), "Wrong Answer!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.q1radioButton2:
                if (clicked)
                    quizScore++;
                break;
            case R.id.q1radioButton3:
                if (clicked)
                    Toast.makeText(getBaseContext(), "Wrong Answer!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.q1radioButton4:
                if (clicked)
                    Toast.makeText(getBaseContext(), "Wrong Answer!", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    public void q2checkAnswer(View view) {
        EditText text = (EditText) findViewById(R.id.q2_answer);
        String answerValue = text.getText().toString();
        if (answerValue.equals("The Mountain") || answerValue.equals("Mountain") || answerValue.equals("mountain")) {
            quizScore++;
        } else {
            Toast.makeText(getBaseContext(), "Please try Q2 again", Toast.LENGTH_SHORT).show();
        }
    }


    public void q3checkAnswer(View view) {
        boolean clicked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.q3radioButton1:
                if (clicked)
                    Toast.makeText(getBaseContext(), "Wrong Answer!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.q3radioButton2:
                if (clicked)
                    quizScore++;
                break;
            case R.id.q3radioButton3:
                if (clicked)
                    Toast.makeText(getBaseContext(), "Wrong Answer!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.q3radioButton4:
                if (clicked)
                    Toast.makeText(getBaseContext(), "Wrong Answer!", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    public void q4CheckAnswer(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        switch (view.getId()) {
            case R.id.q4checkBox1:
                if (checked)
                    quizScore++;
                break;
            case R.id.q4checkBox2:
                if (checked)
                    quizScore++;
                break;
            case R.id.q4checkBox3:
                if (checked)
                    break;
            case R.id.q4checkBox4:
                if (checked)
                    quizScore++;
                break;
            case R.id.q4checkBox5:
                if (checked)
                    break;
        }
    }

    public void q5CheckAnswer(View view) {
        boolean clicked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.q5radioButton1:
                if (clicked)
                    quizScore++;
                break;
            case R.id.q5radioButton2:
                if (clicked)
                    Toast.makeText(getBaseContext(), "Wrong Answer!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.q5radioButton3:
                if (clicked)
                    Toast.makeText(getBaseContext(), "Wrong Answer!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.q5radioButton4:
                if (clicked)
                    Toast.makeText(getBaseContext(), "Wrong Answer!", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    public void submitButton(View view) {
        EditText text = (EditText) findViewById(R.id.name_field);
        String name = text.getText().toString();
        Toast.makeText(getBaseContext(), name + " your score is: " + quizScore, Toast.LENGTH_LONG).show();
    }
}
