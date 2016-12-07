
import java.util.ArrayList;

public class AverageOfNumbers {

    // Copy here the method sum from previous assignment
    public static int sum(ArrayList<Integer> list) {
        int total = 0;
        for(int number : list){
            total += number;
        }
        return total;
    }
    

    public static double average(ArrayList<Integer> list) {
        // write code here
        int total = sum(list);
        double average = (double)total/list.size();
        return average;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The average is: " + average(list));
    }
}