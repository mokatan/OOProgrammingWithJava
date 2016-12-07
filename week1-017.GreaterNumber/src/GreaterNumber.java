import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the first number: ");
        int firstNumber = Integer.parseInt(reader.nextLine());
        
        System.out.println("Type the second number: ");
        int secondNumber = Integer.parseInt(reader.nextLine());
        
        if (firstNumber > secondNumber) {
            System.out.println("The greater number: ");
            System.out.println(firstNumber);
        }
        else if (secondNumber > firstNumber) {
            System.out.println("The greater number: ");
            System.out.println(secondNumber);
        }
        else if (firstNumber == secondNumber) {
            System.out.println("The numbers are equal!");
        }

    }
}
