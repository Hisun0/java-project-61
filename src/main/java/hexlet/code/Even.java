package hexlet.code;

import java.util.Scanner;

public class Even {

    private static boolean isEven(int num) {
        return num % 2 == 0;
    }

    private static String getCorrectAnswer(int question) {
        return isEven(question) ? "yes" : "no";
    }
    public static void game() {
        Scanner scanner = new Scanner(System.in);

        String name = Cli.sayHello();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        for (int i = 0; i < 3; i++) {
            int question = Utils.getRandomNumber();
            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            String answer = scanner.next();

            if (getCorrectAnswer(question).equals(answer)) {
                System.out.println("Correct!");
                continue;
            } else {
                System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was " + "'" + getCorrectAnswer(question) + "'.");
                System.out.println("Let's try again, " + name + "!");
                return;
            }
        }

        System.out.println("Congratulations, " + name + "!");
    }
}
