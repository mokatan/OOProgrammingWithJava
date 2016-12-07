import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;
    private Random randomizer = new Random();

    public LotteryNumbers() {
        // Draw numbers as LotteryNumbers is created
        this.numbers = new ArrayList<Integer>();
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        // We'll format a list for the numbers
        this.numbers = new ArrayList<Integer>();
        // Write the number drawing here using the method containsNumber()
        boolean done = false;
        int counter = 0;
        while (!done) {
            int myNumber = randomizer.nextInt(39) + 1;
            if (!this.numbers.contains(myNumber)) {
                this.numbers.add(myNumber);
                counter +=1;
            }
            if (counter == 7) {
                done = true;
            }
        }
        
    }

    public boolean containsNumber(int number) {
        // Test here if the number is already in the drawn numbers
        if (this.numbers.contains(number)) {
            return true;
        }
        else return false;
    }
}
