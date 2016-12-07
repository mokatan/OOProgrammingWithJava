
import java.util.Arrays;



public class Main {
    public static int[] copy(int[] array){
        int mySize = array.length;
        int[] myarray = new int[mySize];
        for (int i = 0; i < array.length; i++) {
            myarray[i] = array[i];
        }
                    return myarray;

    }
    
    public static int[] reverseCopy(int[] array){
        int mySize = array.length;
        int myarray[] = new int[mySize];
        
        for (int i = 0; i < array.length; i++) {
            myarray[i] = array[mySize-1];
            mySize -=1;
        }
        
        return myarray;
    }

    public static void main(String[] args) {
        // write testcode here
    int[] original = {1, 2, 3, 4};
    int[] reverse = reverseCopy(original);

    // print both
    System.out.println( "original: " +Arrays.toString(original));
    System.out.println( "reversed: " +Arrays.toString(reverse));
    }
}
