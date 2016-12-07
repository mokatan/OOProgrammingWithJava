import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);
        int myTotal = 0;
        int myCount = 0;
        int myEven = 0;
        int myOdd = 0;
        System.out.println("Type numbers: ");
        while(true){
            int myNumber = Integer.parseInt(reader.nextLine());
            
            if (myNumber == -1) {
                System.out.println("Thank you and see you later!");
                break;
            }
            myTotal += myNumber;
            myCount += 1;
            
            if (myNumber%2 == 0) {
                myEven += 1;
            }
            else{
                myOdd +=1;
            }
            
        }
        double myAverage = (double)myTotal/myCount;
        System.out.println("The sum is " + myTotal);
        System.out.println("How many numbers: " + myCount);
        System.out.println("Average: " + myAverage);
        System.out.println("Even numbers: " + myEven);
        System.out.println("Odd numbers: " + myOdd);

    }
}
