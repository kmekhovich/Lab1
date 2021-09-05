package by.kmekhovich.quizer.tasks;

import by.kmekhovich.quizer.quizer;

public class ExpressionTask implements quizer.Task {
    int a, b;
    int op; // +, -, *, /

    public ExpressionTask(int a, int b, int op) {
        this.a = a;
        this.b = b;
        this.op = op;
    }

    private char getOpSymbol() {
        switch (this.op) {
            case 0:
                return '+';
            case 1:
                return '-';
            case 2:
                return '*';
            case 3:
                return '/';
            default:
                // exception
        }
        return 0;
    }

    private int getCorrectAnswer() {
        switch (this.op) {
            case 0:
                return this.a + this.b;
            case 1:
                return this.a - this.b;
            case 2:
                return this.a * this.b;
            case 3:
                return this.a / this.b;
            default:
                // exception
        }
        return 0;
    }

    @Override
    public String getText() {
        return this.a + " " + getOpSymbol() + " " + this.b + "= ?";
    }

    @Override
    public quizer.Result validate(String answer) {
        int res;
        try {
            res = Integer.parseInt(answer);
        } catch(NumberFormatException e){
            return quizer.Result.INCORRECT_INPUT;
        }
        if (res == getCorrectAnswer()) {
            return quizer.Result.OK;
        } else {
            return quizer.Result.WRONG;
        }
    }
}
