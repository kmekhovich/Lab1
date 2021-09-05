package by.kmekhovich.quizer;

public class quizer {

    enum Result {OK, WRONG, INCORRECT_INPUT};

    interface Task {
        public String getText();
        public Result validate(String answer);

    }
    public static void main(String[] args) {

    }
}
