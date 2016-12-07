
import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here the ArrayList 
        ArrayList<String> words = new ArrayList<String>();
        int keepGoing = 1;
        while(keepGoing == 1){
            System.out.println("Type a word: ");
            String word = reader.nextLine();
            if (words.contains(word)) {
                System.out.println("You gave the word " + word + " twice");
                keepGoing = 0;
            }
            else{
                words.add(word);
            }
        }
        
    }
}
