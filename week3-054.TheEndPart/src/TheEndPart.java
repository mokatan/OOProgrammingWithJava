import java.util.Scanner;

public class TheEndPart {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a word: ");
        String myWord = reader.nextLine();
        System.out.println("Length of the end part: ");
        int myLength = Integer.parseInt(reader.nextLine());
        String myResult = myWord.substring(myWord.length()-myLength, myWord.length());
        System.out.println("Result: " + myResult);
    }
}
