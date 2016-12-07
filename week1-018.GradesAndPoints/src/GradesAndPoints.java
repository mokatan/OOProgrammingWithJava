
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type the points [0-60]: ");
        int studentGrade = Integer.parseInt(reader.nextLine());
        
        if (studentGrade <= 29) {
            System.out.println("Grade: failed");
        }
        else if (studentGrade > 29 && studentGrade < 35) {
            System.out.println("Grade: 1");
        }
        else if (studentGrade > 34 && studentGrade < 40) {
            System.out.println("Grade: 2");
        }
        else if (studentGrade > 39 && studentGrade < 45) {
            System.out.println("Grade: 3");
        }
        else if (studentGrade > 44 && studentGrade < 50) {
            System.out.println("Grade: 4");
        }
        else if (studentGrade > 49 && studentGrade < 61) {
            System.out.println("Grade: 5");
        }

    }
}
