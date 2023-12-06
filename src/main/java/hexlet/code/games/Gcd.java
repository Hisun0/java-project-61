package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Gcd {
    private static String getGcd(String question) {
        String[] numbers = question.split(" ");
        int num1 = Integer.parseInt(numbers[0]);
        int num2 = Integer.parseInt(numbers[1]);

        int max = Math.max(num1, num2);

        for (int i = max; i >= 1; i--) {
            if (num1 % i == 0 && num2 % i == 0) {
                return Integer.toString(i);
            }
        }

        return "1";
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
            gameInfo[i][1] = getGcd(question);
        }

        Engine.start(gameRule, gameInfo);
    }
}
