package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;
import hexlet.code.games.Progression;

import java.util.Scanner;

class App {
    private static void generateMenu() {
        String[] games = {"Greet", "Even", "Calc", "Gcd", "Progression"};

        System.out.println("Please enter the game number and press Enter.");

        for (int gameNumber = 0; gameNumber < games.length; gameNumber++) {
            System.out.println(gameNumber + 1 + " - " + games[gameNumber]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        generateMenu();

        System.out.print("Your choice: ");
        String gameNumber = scanner.next();

        switch (gameNumber) {
            case "1":
                Cli.sayHello();
                break;
            case "2":
                Even.startGame();
                break;
            case "3":
                Calc.startGame();
                break;
            case "4":
                Gcd.startGame();
            case "5":
                Progression.startGame();
            default:
                break;
        }
    }
}
