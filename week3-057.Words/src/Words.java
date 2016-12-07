import java.util.ArrayList;
import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        int cont = 1;
        while(cont == 1){
            System.out.println("Type a word: ");
            String word = reader.nextLine();
            if (word.isEmpty()) {
                System.out.println("You typed the following words: ");
                for (String myword : words) {
                    System.out.println(myword);
                }
            cont = 0;
            }
            else{
                words.add(word);
            }
        }
    }
}
