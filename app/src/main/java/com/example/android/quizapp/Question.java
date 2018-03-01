package com.example.android.quizapp;

import java.util.ArrayList;

/**
 * Created by Lola on 25/01/2018.
 */

public class Question {
    public Question(String text, ArrayList<String> answers, ArrayList<Integer> i)
    {
        this.questionText = text;
        this.answers = answers;
        this.correctAnswersIndices = i;
    }
    String questionText;
    ArrayList<String> answers;
    ArrayList<Integer> correctAnswersIndices;
}
