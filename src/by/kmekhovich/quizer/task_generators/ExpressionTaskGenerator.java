package by.kmekhovich.quizer.task_generators;

import by.kmekhovich.quizer.quizer;
import by.kmekhovich.quizer.tasks.ExpressionTask;
import java.util.Random;

public class ExpressionTaskGenerator implements quizer.TaskGenerator {
    int minNumber, maxNumber;
    boolean generateSum, generateDifference, generateMultiplication, generateDivision;

    public ExpressionTaskGenerator(
            int minNumber,
            int maxNumber,
            boolean generateSum,
            boolean generateDifference,
            boolean generateMultiplication,
            boolean generateDivision
    ) {
        this.minNumber = minNumber;
        this.maxNumber = maxNumber;
        this.generateSum = generateSum;
        this.generateDifference = generateDifference;
        this.generateMultiplication = generateMultiplication;
        this.generateDivision = generateDivision;
    }

    private int getRandomIntBetweenMinAndMax() {
        Random random = new Random();
        return random.nextInt(this.maxNumber - this.minNumber + 1) + this.minNumber;
    }

    private int getRandomOperation() {
        Random random = new Random();
        int result = -1;
        if (!this.generateSum && !this.generateDifference && !this.generateMultiplication && !this.generateDivision) {
            // exception
        }
        while (result == -1) {
            result = random.nextInt(4);
            if (result == 0 && this.generateSum) {
                return result;
            } else if (result == 1 && this.generateDifference) {
                return result;
            } else if (result == 2 && this.generateMultiplication) {
                return result;
            } else if (result == 3 && this.generateDivision) {
                return result;
            }
        }
        return result;
    }

    @Override
    public quizer.Task generate() {
        return new ExpressionTask(getRandomIntBetweenMinAndMax(), getRandomIntBetweenMinAndMax(), getRandomOperation());
    }
}
