import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // Write test code here
        // Remember to remove all the extra code when doing assignments  79.3 and 79.4

        // Define three NumberStatistics objects in your program:
        // The first is used to track the sum of all given numbers.
        // The second takes care of even numbers and the third the odd numbers.

        // The tests does not work if you do not create the objects in the correct order
        
//        NumberStatistics stats = new NumberStatistics();
//        stats.addNumber(3);
//        stats.addNumber(5);
//        stats.addNumber(1);
//        stats.addNumber(2);
//        
//        System.out.println("Amount: " + stats.amountOfNUmbers());
//        System.out.println("Sum: " + stats.sum());
//        System.out.println("Average: " + stats.average());
        
        NumberStatistics stat1 = new NumberStatistics();
        NumberStatistics stat2 = new NumberStatistics();
        NumberStatistics stat3 = new NumberStatistics();
        
        boolean keep = true;
        System.out.println("Type numbers: ");

        while(keep){
            int myNumber = Integer.parseInt(reader.nextLine());
            if (myNumber == -1) {
                keep = false;
            }
            else{
                stat1.addNumber(myNumber);
                if (myNumber %2 == 0) {
                    stat2.addNumber(myNumber);
                }
                else{
                    stat3.addNumber(myNumber);
                }
            }
        }
        
        System.out.println("sum: " + stat1.sum());
        System.out.println("sum of even: " + stat2.sum());
        System.out.println("sum of odd: " + stat3.sum());
        

    }
}
