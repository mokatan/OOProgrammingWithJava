
import java.util.Scanner;

public class LengthOfName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String myName = reader.nextLine();
        int myLength = calculateCharacters(myName);
        System.out.println("Number of characters: " + myLength);
        // call your method from here
    }
    
    // do here the method
    // public static int calculateCharacters(String text)
    public static int calculateCharacters(String text){
        int lengthOfWord = text.length();
        return lengthOfWord;
    }
    
}
