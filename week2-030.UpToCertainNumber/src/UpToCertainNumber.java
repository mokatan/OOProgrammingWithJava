
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        // Write your code here
        System.out.println("Up to what number? ");
        int myNumber = Integer.parseInt(reader.nextLine());
        for (int i = 1; i < myNumber + 1; i++) {
            System.out.println(i);
        }
        
    }
}
