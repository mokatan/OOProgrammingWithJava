
import java.util.Scanner;

public class Usernames {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        String userName1 = "alex";
        String userName2 = "emily";
        String passWord1 = "mightyducks";
        String passWord2 = "cat";
        
        System.out.println("Type your username: ");
        String userName = reader.nextLine();
        System.out.println("Type your password: ");
        String passWord = reader.nextLine();
        
        if (userName.equals(userName1)) {
            if (passWord.equals(passWord1)) {
                System.out.println("You are now logged into the system!");
            }
            else{
                System.out.println("Your username or password is invalid!");
            }
        }
        else if (userName.equals(userName2)) {
            if (passWord.equals(passWord2)) {
                System.out.println("You are now logged into the system!");
            }
            else{
                System.out.println("Your username or password is invalid!");
            }
        }
        else{
            System.out.println("Your username or password is invalid!");
        }

    }
}
