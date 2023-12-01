package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Gcd {

    private static String getCorrectAnswer(String question) {
        String[] numbers = question.split(" ");
        int num1 = Integer.parseInt(numbers[0]);
        int num2 = Integer.parseInt(numbers[1]);

        return Utils.getGcd(num1, num2);
    }
    public static void startGame() {
        final int totalAttempts = 3;
        final int questionAndAnswer = 2;
        String gameRule = "Find the greatest common divisor of given numbers.";

        String[][] gameInfo;
        gameInfo = new String[totalAttempts][questionAndAnswer];

        for (int i = 0; i < totalAttempts; i++) {
            String question = Utils.getRandomNumber() + " " + Utils.getRandomNumber();
            gameInfo[i][0] = question;
            gameInfo[i][1] = getCorrectAnswer(question);
        }

        Engine.start(gameRule, gameInfo);
    }
}
