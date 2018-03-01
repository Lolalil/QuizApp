package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TriviaManager triviaManager = new TriviaManager();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Question q = triviaManager.loadQuestion();
        ((TextView)findViewById(R.id.question)).setText(q.questionText);

    }

    public void submit_answer(View view) {
        Question q = triviaManager.loadQuestion();
        ((TextView)findViewById(R.id.question)).setText(q.questionText);
    }
}
