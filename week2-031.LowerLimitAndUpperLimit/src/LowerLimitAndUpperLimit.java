
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // write your code here
        System.out.println("First: ");
        int firstNumber = Integer.parseInt(reader.nextLine());
        System.out.println("Last: ");
        int lastNumber = Integer.parseInt(reader.nextLine());
        
        for (int i = firstNumber; i <= lastNumber; i++) {
            System.out.println(i);
        }

    }
}
