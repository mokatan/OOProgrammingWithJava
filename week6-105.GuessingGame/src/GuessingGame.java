import java.util.Scanner;

public class GuessingGame {

    private Scanner reader;

    public GuessingGame() {
        // use only this scanner, othervise the tests do not work
        this.reader = new Scanner(System.in);
    }

    public void play(int lowerLimit, int upperLimit) {
        instructions(lowerLimit, upperLimit);

        // write the guessing logic here
        int guess = 0;
        int ask = average(lowerLimit, upperLimit);
        for (int i = 0; i < ask; i++) {
            boolean status = isGreaterThan(average(lowerLimit, upperLimit));
            if (status) {
                lowerLimit = average(lowerLimit, upperLimit) + 1;
                if (upperLimit-lowerLimit == 1) {
                    status = isGreaterThan(average(lowerLimit, upperLimit));
                    if (status) {
                        guess = upperLimit;
                        break;
                    }
                    else{
                        guess = lowerLimit;
                        break;
                    }
                }
            }
            else{
                upperLimit = average(lowerLimit, upperLimit);
            }
            if (upperLimit == lowerLimit) {
                guess = lowerLimit;
                break;
            }
            else if(upperLimit - lowerLimit == 1){
                status = isGreaterThan(average(lowerLimit, upperLimit));
                    if (status) {
                        guess = upperLimit;
                        break;
                    }
                    else{
                        guess = lowerLimit;
                        break;
                    }
            }
        }
        //int guess = upperLimit;
        System.out.println("The number you're thinking of is " + guess + ".");


    }

    // implement here the methods isGreaterThan and average

    public void instructions(int lowerLimit, int upperLimit) {
        int maxQuestions = howManyTimesHalvable(upperLimit - lowerLimit);

        System.out.println("Think of a number between " + lowerLimit + "..." + upperLimit + ".");

        System.out.println("I promise you that I can guess the number you are thinking with " + maxQuestions + " questions.");
        System.out.println("");
        System.out.println("Next I'll present you a series of questions. Answer them honestly.");
        System.out.println("");
    }

    // a helper method:
    public static int howManyTimesHalvable(int number) {
        // we create a base two logarithm  of the given value

        // Below we swap the base number to base two logarithms!
        return (int) (Math.log(number) / Math.log(2)) + 1;
    }
    
    public boolean isGreaterThan(int value){
        System.out.println("Is your number greater than " + value + "? (y/n)");
        String answer = reader.nextLine();
        if (answer.equals("y")) {
            return true;
        }
        else{
            return false;
        }
    }
    
    public int average(int firstNumber, int secondNumber){
        return (firstNumber+secondNumber)/2;
    }

}
