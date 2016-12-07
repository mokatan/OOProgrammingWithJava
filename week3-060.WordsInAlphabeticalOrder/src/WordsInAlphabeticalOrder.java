
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here an ArrayList
        ArrayList<String> elements = new ArrayList<String>();
        int keepGoing = 1;
        while(keepGoing == 1){
            System.out.println("Type a word: ");
            String word = reader.nextLine();
            if (word.isEmpty()) {
                Collections.sort(elements);
                System.out.println("You typed the following words: ");
                for (String element : elements) {
                    System.out.println(element);
                }
                keepGoing = 0;
            }
            else{
                elements.add(word);
            }
        }
    }
}
