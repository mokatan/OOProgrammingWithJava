import java.util.Scanner;

public class Palindromi {
    
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

    public static boolean palindrome(String text) {
        // write code here
        String reversedText = reverse(text);
        if (reversedText.equals(text)) {
            return true;
        }
        else{
            return false;
        }
        
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
