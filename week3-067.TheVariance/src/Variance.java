import java.util.ArrayList;

public class Variance {
    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
         int total = 0;
        for(int number : list){
            total += number;
        }
        return total;
    }
    
    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        int total = sum(list);
        double average = (double)total/list.size();
        return average;
    }

    public static double variance(ArrayList<Integer> list) {
        // write code here
        double total = 0;
        double average = average(list);
        for(double number : list){
            total += (number - average)*(number - average);
        }
        double variance = total/(list.size()-1);
        return variance;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}
