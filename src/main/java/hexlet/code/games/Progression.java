package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    public static void startGame() {
        final int totalAttempts = 3;
        final int questionAndAnswer = 2;
        String gameRule = "What number is missing in the progression?";

        String[][] gameInfo;
        gameInfo = new String[totalAttempts][questionAndAnswer];

        for (int i = 0; i < totalAttempts; i++) {
            String[][] progressionAndCorrectAnswer = Utils.makeProgression();

            String question = String.join(" ", progressionAndCorrectAnswer[0]);
            String correctAnswer = progressionAndCorrectAnswer[1][0];

            gameInfo[i][0] = question;
            gameInfo[i][1] = correctAnswer;
        }

        Engine.start(gameRule, gameInfo);
    }
}
