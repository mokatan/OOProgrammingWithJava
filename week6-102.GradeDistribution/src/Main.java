import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        List<Integer> scoreList = new ArrayList<Integer>();
        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program
        
        // Your program should use only one Scanner object, i.e., it is allowed to call 
        // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
        System.out.println("Type exam scores, -1 completes: ");
        boolean keep = true;
        while(keep){
            int score = Integer.parseInt(lukija.nextLine());
            if (score == -1) {
                keep = false;
            }
            scoreList.add(score);
        }
        
        int[] studentStar = new int[6];
        for (int i = 0; i < 6; i++) {
            studentStar[i] = 0;
        }
        
        for (int studentGrade : scoreList) {
            if (studentGrade <= 29 && studentGrade >= 0) {
                studentStar[0] += 1;
            }
            else if (studentGrade > 29 && studentGrade < 35) {
                studentStar[1] += 1;
            }
            else if (studentGrade > 34 && studentGrade < 40) {
                studentStar[2] += 1;
            }
            else if (studentGrade > 39 && studentGrade < 45) {
                studentStar[3] += 1;
            }
            else if (studentGrade > 44 && studentGrade < 50) {
                studentStar[4] += 1;
            }
            else if (studentGrade > 49 && studentGrade < 61) {
                studentStar[5] += 1;
            }
//            else if (studentGrade > 60 || studentGrade < 0) {
//                return;
//            }
        }
        System.out.println("Grade distribution: ");
        for (int i = 5; i >= 0; i--) {
            System.out.print(i + ": ");
            for (int j = 0; j < studentStar[i]; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        
        double total = 0;
        double total2 = 0;
        for (int i = 1; i < studentStar.length; i++) {
            total += studentStar[i];
        }
        for (int i = 0; i < studentStar.length; i++) {
            total2 += studentStar[i];
        }
        System.out.println("Acceptance percentage: " + 100*total/total2);
    }
}
