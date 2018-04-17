package com.sda.fasade;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class QuizFileRepository implements QuizRepository {

    private String patch;
    public QuizFileRepository(String patch) {
        this.patch = patch;
    }

    public List<QuizQuestion> readAll (String patch) throws FileNotFoundException {
        File file = new File(patch);
        Scanner scanner = new Scanner(file);
        List<QuizQuestion> questions = new ArrayList<>();
        while (scanner.hasNextLine()){
            String question = scanner.nextLine();

            List<String> possibleAnswers = Arrays.asList(scanner.nextLine(),
                    scanner.nextLine(), scanner.nextLine(), scanner.nextLine());
            char answer = scanner.nextLine().charAt(0);

            QuizQuestion quizQuestion = new QuizQuestion(question, possibleAnswers, answer);
            questions.add(quizQuestion);
        }
        return questions;
    }

    @Override
    public List<QuizQuestion> readAll() {
        return null;
    }
}
