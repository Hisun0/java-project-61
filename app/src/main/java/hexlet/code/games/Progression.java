package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    public static String[][] makeProgression() {
        final int minProgressionLength = 5;
        final int maxProgressionLength = 10;
        final int maxProgressionNum = 30;

        int progressionLength = Utils.getRandomNumber(minProgressionLength, maxProgressionLength);
        int progressionNum = Utils.getRandomNumber(1, maxProgressionNum);

        String[] progression = new String[progressionLength];
        int index = 0;

        for (int i = progressionNum; i <= progressionNum * progressionLength; i += progressionNum) {
            progression[index] = Integer.toString(i);
            index++;
        }

        int hiddenNumber = Utils.getRandomNumber(0, progression.length - 1);
        String correctAnswer = progression[hiddenNumber];
        progression[hiddenNumber] = "..";

        return new String[][] {progression, new String[] {correctAnswer}};
    }

    public static void startGame() {
        final int totalAttempts = 3;
        final int questionAndAnswer = 2;
        String gameRule = "What number is missing in the progression?";

        String[][] gameInfo;
        gameInfo = new String[totalAttempts][questionAndAnswer];

        for (int i = 0; i < totalAttempts; i++) {
            String[][] progressionAndCorrectAnswer = makeProgression();

            String question = String.join(" ", progressionAndCorrectAnswer[0]);
            String correctAnswer = progressionAndCorrectAnswer[1][0];

            gameInfo[i][0] = question;
            gameInfo[i][1] = correctAnswer;
        }

        Engine.start(gameRule, gameInfo);
    }
}
