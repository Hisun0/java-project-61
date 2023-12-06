package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static void start(String gameRule, String[][] gameInfo) {
        Scanner scanner = new Scanner(System.in);

        final int totalAttempts = 3;
        String name = Cli.sayHello();
        System.out.println(gameRule);

        for (int i = 0; i < totalAttempts; i++) {
            System.out.println("Question: " + gameInfo[i][0]);
            System.out.print("Answer: ");
            String answer = scanner.next();

            if (gameInfo[i][1].equals(answer)) {
                System.out.println("Correct!");
            } else {
                System.out.println(
                    "'" + answer + "'" + " is wrong answer ;(. Correct answer was " + "'" + gameInfo[i][1] + "'.");
                System.out.println("Let's try again, " + name + "!");
                return;
            }
        }

        System.out.println("Congratulations, " + name + "!");
    }
}
