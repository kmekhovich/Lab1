package by.kmekhovich.quizer;

import java.util.Map;

public class quizer {

    public enum Result {OK, WRONG, INCORRECT_INPUT};

    public interface Task {
        public String getText();
        public Result validate(String answer);

    }

    public interface TaskGenerator {
        public Task generate();
    }

    class Quiz {

        Quiz(TaskGenerator generator, int taskCount) {

        }

        Task nextTask() {

        }

        Result provideAnswer(String answer) {

        }

        boolean isFinished() {

        }

        int getCorrectAnswerNumber() {

        }

        int getWrongAnswerNumber() {

        }

        int getIncorrectInputNumber() {

        }

        double getMark() {

        }

        static Map<String, Quiz> getQuizMap() {

        }
    }

    public static void main(String[] args) {
//
//        Quiz quiz = new Quiz(, 5);
//        Map<String, Quiz> quizMap =
    }

}
