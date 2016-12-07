
import java.util.Scanner;

public class ReversingText {

    public static String reverse(String text) {
        // write your code here
        // note that method does now print anything, it RETURNS the reversed string
        String myString = "";
        int myLength = text.length();
        for (int i = myLength-1; i >= 0; i--) {
            char myChar = text.charAt(i);
            myString = myString + myChar;
        }
        return myString;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}
