package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    private static String getCorrectAnswer(String question) {
        String[] questionPieces = question.split(" ");

        String operand = questionPieces[1];
        int num1 = Integer.parseInt(questionPieces[0]);
        int num2 = Integer.parseInt(questionPieces[2]);

        return switch (operand) {
            case "+" -> Integer.toString(num1 + num2);
            case "-" -> Integer.toString(num1 - num2);
            case "*" -> Integer.toString(num1 * num2);
            default -> operand;
        };
    }

    public static void startGame() {
        final int totalAttempts = 3;
        final int questionAndAnswer = 2;
        String gameRule = "What is the result of the expression?";

        String[][] gameInfo;
        gameInfo = new String[totalAttempts][questionAndAnswer];

        for (int i = 0; i < totalAttempts; i++) {
            String question = Utils.getRandomNumber() + " " + Utils.getRandomOperand() + " " + Utils.getRandomNumber();
            gameInfo[i][0] = question;
            gameInfo[i][1] = getCorrectAnswer(question);
        }

        Engine.start(gameRule, gameInfo);
    }
}
