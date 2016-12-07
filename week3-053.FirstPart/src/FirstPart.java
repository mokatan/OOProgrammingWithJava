
import java.util.Scanner;

public class FirstPart {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a word: ");
        String myWord = reader.nextLine();
        System.out.println("Length of the first part: ");
        int myLength = Integer.parseInt(reader.nextLine());
        String myResult = myWord.substring(0,myLength);
        System.out.println("Result: " + myResult);
    }
}
