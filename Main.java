package com.QuizApplication;

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TimeQuiz quiz = new TimeQuiz(60); 
        quiz.addQuestion(new Question("Which festival is known as the Festival of Lights?",
            new String[]{"Holi", "Eid", "Diwali", "Christmas"},
            'C'
        ));
        
        quiz.addQuestion(new Question("Which language is used for Android development?",
            new String[]{"Kotlin", "Swift", "Python", "Ruby"},
            'A'
        ));

        quiz.addQuestion(new Question("What is 8 + 11?",
            new String[]{"19", "21", "20", "18"},
            'A'
        ));

        quiz.addQuestion(new Question("Which company developed Java?",
            new String[]{"Microsoft", "Apple", "Sun Microsystems", "Google"},
            'C'
        ));

        quiz.addQuestion(new Question("What keyword is used to inherit a class in Java?",
            new String[]{"implement", "extends", "inherits", "interface"},
            'B'
        ));
        
        quiz.addQuestion(new Question("Which is the largest ocean in the world?",
        		new String[] {"Atlantic Ocean","Indian Ocean","Arctic Ocean","Pacific Ocean"},
        		'D'
        ));
        
        quiz.addQuestion(new Question("What is the capital of India?",
        		new String[] {"Mumbai","Kolkata","New Delhi","Chennai"},
        		'C'
        ));
        
        quiz.addQuestion(new Question("What is the traditional dance form of Kerala?",
        		new String[] {"Kathakali","Kuchipudi","Bharatanatyam","Kathak"},
        		'A'
        ));
        
        quiz.addQuestion(new Question("Which operator is used to add together two values?",
        		new String[] {"# sign","+ sign","& sign","* sign"},
        		'B'
        ));
        
        quiz.addQuestion(new Question("Which planet is known as the Red Planet??",
        		new String[] {"Earth","Jupiter","Neptune","Mars"},
        		'D'
        ));

        System.out.println("Welcome to the Java Quiz!");
        System.out.println("You have 1 Minute to Complete the Quiz.");
        System.out.println("Press Enter to Start....");
        scanner.nextLine();

        quiz.start(scanner);
        scanner.close();
    }

}
