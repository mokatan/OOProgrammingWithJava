
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int myNumber = Integer.parseInt(reader.nextLine());
        int totalNumber = 0;
        
        for (int i = 0; i <= myNumber; i++) {
            totalNumber += Math.pow(2, i);
        }
        System.out.println("The result is " + totalNumber);

    }
}
