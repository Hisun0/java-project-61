package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;

import java.util.Scanner;

class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - Gcd");
        System.out.println("0 - Exit");
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
            default:
                break;
        }
    }
}
