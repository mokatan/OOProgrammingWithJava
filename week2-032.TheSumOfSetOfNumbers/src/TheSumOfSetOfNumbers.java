
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Until what? ");
        int untilNumber = Integer.parseInt(reader.nextLine());
        int sumOfNumbers = 0;
        
        for (int i = 1; i <= untilNumber; i++) {
            sumOfNumbers += i;
        }
        System.out.println("Sum is" + sumOfNumbers);
    }
}
