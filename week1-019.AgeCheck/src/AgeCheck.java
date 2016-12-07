
import java.util.Scanner;

public class AgeCheck {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int userAge = Integer.parseInt(reader.nextLine());
        
        if (userAge >= 0 && userAge <= 120) {
            System.out.println("OK");
        }
        else if (userAge < 0) {
            System.out.println("Impossible!");
        }
        else if (userAge > 120) {
            System.out.println("Impossible!");
        }

    }
}
