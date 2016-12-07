import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInReverseOrder {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here an ArrayList
        ArrayList<String> teachers =  new ArrayList<String>();
        int keepGoing = 1;
        while(keepGoing == 1){
            System.out.println("Type a word: ");
            String word = reader.nextLine();
            if (word.isEmpty()) {
                Collections.reverse(teachers);
                System.out.println("You typed the following words: ");
                for (String teacher : teachers) {
                    System.out.println(teacher);
                }
                keepGoing = 0;
            }
            else{
                teachers.add(word);
            }
        }
    }
}
