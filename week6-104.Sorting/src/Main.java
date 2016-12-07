
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        // write testcode here
        int[] values = {8, 3, 7, 9, 1, 2, 4};
        sort(values);
    }
    
    public static int smallest(int[] array){
        int smallestValue = array[0];
        for (int value : array) {
            if (value < smallestValue) {
                smallestValue = value;
            }
        }
        return smallestValue;
    }
    
    public static int indexOfTheSmallest(int[] array) {
        int smallestValue = array[0];
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallestValue) {
                smallestValue = array[i];
                index = i;
            }
        }
        return index;
    }
    
    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        int smallestValue = array[index];
        for (int i = index; i < array.length; i++) {
            if (array[i] < smallestValue) {
                smallestValue = array[i];
                index = i;
            }
        }
        return index;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int buffer = array[index1];
        array[index1] = array[index2];
        array[index2] = buffer;
    }
    
    public static void sort(int[] array) {
        int count = 0;
        while(count < array.length){
            for (int i = count; i < array.length; i++) {
                int smallIndex = indexOfTheSmallestStartingFrom(array, i);
                if (smallIndex != i) {
                    swap(array, i, smallIndex);                    
                }
            }
            count += 1;
            System.out.println( Arrays.toString(array) );
        }
    }
}
