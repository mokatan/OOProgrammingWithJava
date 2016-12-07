import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
    private int length;
    private Random randomizer;
    private String alphabet;
    

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.length = length;
        this.randomizer = new Random();
        this.alphabet = "abcdefghijklmnopqrstuvwxyz";
    }

    public String createPassword() {
        // write code that returns a randomized password
        String password = "";
        for (int i = 0; i < this.length; i++) {
            char myCharacter = this.alphabet.charAt(this.randomizer.nextInt(26));
            password += myCharacter;
        }
        
        return password;
    }
}
