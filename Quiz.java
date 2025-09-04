package com.QuizApplication;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//Multiple-choice quiz, timer, scoring, random question selection, display result	
//Collections, Scanner/Input Handling	Encapsulation, Polymorphism

public class Quiz {
	protected List<Question> questions;
    protected int score;

    public Quiz() {
        questions = new ArrayList<>();
        score = 0;
    }

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public void shuffleQuestions() {
        Collections.shuffle(questions);
    }

    public void start(Scanner scanner) {
        shuffleQuestions();
        for (Question q : questions) {
            askQuestion(q, scanner);
        }
        showResult();
    }

    protected void askQuestion(Question q, Scanner scanner) {
        System.out.println("\n" + q.getQuestionText());
        String[] options = q.getOptions();
        char optionLabel = 'A';
        for (String opt : options) {
            System.out.println(optionLabel + ". " + opt);
            optionLabel++;
        }

        System.out.print("Your answer (A/B/C/D): ");
        char answer = scanner.next().charAt(0);

        if (q.isCorrect(answer)) {
            System.out.println(" Correct!");
            score++;
        } else {
            System.out.println(" Wrong! Correct answer was: " + q.getCorrectOption());
        }
    }

    protected void showResult() {
        System.out.println("\nYour Final Score :- " + score + " out of " + questions.size());
    }
	

}
