package hexlet.code;

public class Utils {
    public static String getRandomNumber() {
        final int maxRange = 100;
        return Integer.toString((int) (Math.random() * maxRange));
    }

    public static String getRandomOperand() {
        String[] operands = {"+", "-", "*"};

        return operands[(int) (Math.random() * operands.length)];
    }
}
