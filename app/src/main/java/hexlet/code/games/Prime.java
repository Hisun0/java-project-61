package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    private static boolean isPrime(String numStr) {
        int num = Integer.parseInt(numStr);

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    private static String getCorrectAnswer(String question) {
        return isPrime(question) ? "yes" : "no";
    }

    public static void startGame() {
        final int totalAttempts = 3;
        final int questionAndAnswer = 2;
        String gameRule = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

        String[][] gameInfo;
        gameInfo = new String[totalAttempts][questionAndAnswer];

        for (int i = 0; i < totalAttempts; i++) {
            String question = Integer.toString(Utils.getRandomNumber());
            gameInfo[i][0] = question;
            gameInfo[i][1] = getCorrectAnswer(question);
        }

        Engine.start(gameRule, gameInfo);
    }
}
