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

    public static String getGcd(int num1, int num2) {
        int max = Math.max(num1, num2);

        for (int i = max; i >= 1; i--) {
            if (num1 % i == 0 && num2 % i == 0) {
                return Integer.toString(i);
            }
        }

        return "1";
    }
}
