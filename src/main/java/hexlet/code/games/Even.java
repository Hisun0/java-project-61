package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {

    private static boolean isEven(String num) {
        return Integer.parseInt(num) % 2 == 0;
    }

    private static String getCorrectAnswer(String question) {
        return isEven(question) ? "yes" : "no";
    }

    public static void startGame() {
        final int totalAttempts = 3;
        final int questionAndAnswer = 2;
        String gameRule = "Answer 'yes' if the number is even, otherwise answer 'no'.";

        String[][] gameInfo;
        gameInfo = new String[totalAttempts][questionAndAnswer];

        for (int i = 0; i < totalAttempts; i++) {
            String question = Utils.getRandomNumber();
            gameInfo[i][0] = question;
            gameInfo[i][1] = getCorrectAnswer(question);
        }

        Engine.start(gameRule, gameInfo);
    }
}
