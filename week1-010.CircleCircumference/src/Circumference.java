
import java.util.Scanner;
import java.lang.Math;

public class Circumference {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Program your solution here 
        System.out.println("Type the radius: ");
        double radius = Integer.parseInt(reader.nextLine());
        double result = 2 * radius * Math.PI;
        System.out.println("Ciccumference of the circle: ");
        System.out.println(result);
    }
}
