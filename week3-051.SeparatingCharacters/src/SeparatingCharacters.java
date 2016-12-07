
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String myName = reader.nextLine();
        int myNameLength = myName.length();
        for (int i = 1; i <= myNameLength; i++) {
            char myChar = myName.charAt(i-1);
            System.out.println(i + ". character: " + myChar);
        }
    }
}
