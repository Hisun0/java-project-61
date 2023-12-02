package hexlet.code;

public class Utils {
    public static int getRandomNumber() {
        final int maxRange = 100;
        return (int) (Math.random() * maxRange);
    }

    public static int getRandomNumber(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }

    public static String getRandomOperand() {
        String[] operands = {"+", "-", "*"};

        return operands[(int) (Math.random() * operands.length)];
    }

    public static String getGcd(int num1, int num2) {
        int max = Math.max(num1, num2);

        for (int i = max; i >= 1; i--) {
            if (num1 % i == 0 && num2 % i == 0) {
                return Integer.toString(i);
            }
        }

        return "1";
    }

    public static String[][] makeProgression() {
        final int minProgressionLength = 5;
        final int maxProgressionLength = 10;
        final int maxProgressionNum = 30;

        int progressionLength = getRandomNumber(minProgressionLength, maxProgressionLength);
        int progressionNum = getRandomNumber(1, maxProgressionNum);

        String[] progression = new String[progressionLength];
        int index = 0;

        for (int i = progressionNum; i <= progressionNum * progressionLength; i += progressionNum) {
            progression[index] = Integer.toString(i);
            index++;
        }

        int hiddenNumber = getRandomNumber(0, progression.length - 1);
        String correctAnswer = progression[hiddenNumber];
        progression[hiddenNumber] = "..";

        return new String[][] {progression, new String[] {correctAnswer}};
    }
}
