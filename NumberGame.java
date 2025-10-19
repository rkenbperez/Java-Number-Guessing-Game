import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {


        Random rand = new Random();
        Scanner input = new Scanner(System.in);

        while (true) {

            int randomNumber = rand.nextInt(11);
            int chances = 0;
            int chanceNum = 0;

            System.out.println("Welcome to Number Guessing Game!");


            System.out.print("Please enter your difficulty\n(1)easy (2)medium (3)hard: ");
            int difficulty = input.nextInt();


            switch (difficulty) {
                case 1:
                    chances = 10;
                    chanceNum = 9;
                    break;
                case 2:
                    chances = 5;
                    chanceNum = 4;
                    break;
                case 3:
                    chances = 3;
                    chanceNum = 2;
                    break;
                default:
                    System.out.println("Invalid difficulty");
                    continue;
            }

            for (int i = 0; i < chances; i++) {
                System.out.print("Please enter your guess: ");
                int guess = input.nextInt();
                if (guess == randomNumber) {
                    System.out.println("Congratulations! You guessed correctly!");
                    System.out.println("The number is " + randomNumber);
                    break;
                } else if (i == chances - 1) {
                    System.out.println("You ran out of guesses!");
                }
                System.out.println("Chances left: " + chanceNum--);
            }

            System.out.println("would you like to play again? (y/n)");
            String answer = input.next();
            if (!answer.equalsIgnoreCase("y")) break;
        }
        input.close();
    }
}
