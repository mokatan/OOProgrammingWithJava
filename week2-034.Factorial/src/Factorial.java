import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int myNumber = Integer.parseInt(reader.nextLine());
        int totalFactorial = 1;
        
        for (int i = 1; i <= myNumber; i++) {
            totalFactorial *= i;
        }
        System.out.println("Factorial is " + totalFactorial);

    }
}
