
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();

        // program your solution here. Do not touch the above lines!
        int numberOfGuesses = 0;
        int isGuessed = 0;
        while(isGuessed == 0){  
            System.out.println("Guess a number: ");
            int guessedNumber = Integer.parseInt(reader.nextLine());
            numberOfGuesses +=1;
            if (guessedNumber < numberDrawn) {
                System.out.println("Number is greater, guesses made: " + numberOfGuesses);
            }
            else if (guessedNumber > numberDrawn) {
                System.out.println("Number is lesser, guesses made: " + numberOfGuesses);
            }
            else{
                System.out.println("Congratulations, your guess is correct!");
                isGuessed = 1;
            }
        }
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}

