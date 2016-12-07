
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.

        // Write your code here
        boolean conditionOfPass = false;
        while(conditionOfPass == false){
            System.out.println("Type the password: ");
            String userInput = reader.nextLine();
            if (userInput.equals(password)) {
                System.out.println("Right!");
                System.out.println("The secret is: jryy qbar!");
                conditionOfPass = true;
            }
            else{
                System.out.println("Wrong!");
            }
        }
    }
}
