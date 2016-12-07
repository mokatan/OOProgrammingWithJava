
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user.
        System.out.println("Type a number");
        double a = Integer.parseInt(reader.nextLine());
        System.out.println("Type another number");
        double b = Integer.parseInt(reader.nextLine());
        double total = a / b;
        String myString = "Division: " + a + "/" + b + "=";
        System.out.println(myString);
        System.out.println(total);
    }
}
