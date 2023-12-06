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
}
