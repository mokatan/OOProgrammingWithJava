import java.util.Scanner;

public class FirstCharacters {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String myName = reader.nextLine();
        if (myName.length() < 3) {
            return;
        }
        char myChar1 = myName.charAt(0);
        char myChar2 = myName.charAt(1);
        char myChar3 = myName.charAt(2);
        System.out.println("1. character: " + myChar1);
        System.out.println("2. character: " + myChar2);
        System.out.println("3. character: " + myChar3);
    }
}
