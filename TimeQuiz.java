package com.QuizApplication;

import java.util.Scanner;

public class TimeQuiz extends Quiz {
	private long timeLimit;

    public TimeQuiz(long timeLimitSeconds) {
        super();
        this.timeLimit = timeLimitSeconds * 1000;
    }

    @Override
    public void start(Scanner scanner) {
        shuffleQuestions();
        long startTime = System.currentTimeMillis();
        for (Question q : questions) {
            if (System.currentTimeMillis() - startTime >= timeLimit) {
                System.out.println("\n Time's up....!");
                break;
            }
            askQuestion(q, scanner);
        }
        showResult();
       
    }

}
