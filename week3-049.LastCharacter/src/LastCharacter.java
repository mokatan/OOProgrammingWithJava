import java.util.Scanner;


public class LastCharacter {


    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String myName = reader.nextLine();
        char lastCharacter = lastCharacter(myName);
        System.out.println("Last character: " + lastCharacter);
    }
    
    public static char lastCharacter(String text){
        char lastCharacter = text.charAt(text.length()-1);
        return lastCharacter;
    }
}
