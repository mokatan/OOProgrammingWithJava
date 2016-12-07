
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a year: ");
        int theYear = Integer.parseInt(reader.nextLine());
        
        if (theYear % 100 == 0) {
            if (theYear % 400 == 0) {
                System.out.println("This year is a leap year.");
            }
            else{
                System.out.println("This year is not a leap year.");
            }
        }
        else if (theYear % 4 == 0) {
            System.out.println("This year is a leap year");
        }
        else{
            System.out.println("This year is not a leap year.");
        }

    }
}
