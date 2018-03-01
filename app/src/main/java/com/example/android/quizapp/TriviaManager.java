package com.example.android.quizapp;

import java.util.ArrayList;

/**
 * Created by Lola on 25/01/2018.
 */

public class TriviaManager {
    ArrayList<Question> questions = new ArrayList<>();
    int currentIndex;
    int correctAnswers;

    public TriviaManager()
    {
        ArrayList<String> answers1 = new ArrayList<String>();
        answers1.add("1");
        answers1.add("23");
        ArrayList<Integer> indices1 = new ArrayList<>();
        indices1.add(2);
        Question q1 = new Question("how old are you?", answers1, indices1);

        ArrayList<String> answers2 = new ArrayList<String>();
        answers2.add("yes");
        answers2.add("no");
        ArrayList<Integer> indices2 = new ArrayList<>();
        indices2.add(1);
        Question q2 = new Question("how tall are you?", answers2, indices2);

        ArrayList<String> answers = new ArrayList<String>();
        answers.add("1");
        answers.add("23");
        ArrayList<Integer> indices = new ArrayList<>();
        indices.add(2);
        Question q3 = new Question("how are you?", answers, indices);

        questions.add(q1);
        questions.add(q2);
        questions.add(q3);
    }

    public Question loadQuestion()
    {
        Question q = questions.get(currentIndex);
        currentIndex++;
        return q;
    }

    public void submitAnswer(Question q, ArrayList<Integer> chosenAnswersIndices)
    {
        if (true)
        {
            correctAnswers++;
        }
    }

    public int getResults()
    {
        return correctAnswers;
    }
}
