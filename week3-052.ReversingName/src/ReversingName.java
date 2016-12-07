import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String myNAme = reader.nextLine();
        int lengthOfName = myNAme.length();
        System.out.println("In reverse order:");
        for (int i = lengthOfName-1; i >= 0; i--) {
            System.out.print(myNAme.charAt(i));
        }
    }
}
