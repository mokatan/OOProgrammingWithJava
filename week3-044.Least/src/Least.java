
public class Least {

    public static int least(int number1, int number2) {
        int smallNumber = 0;
        if (number1 > number2) {
            smallNumber = number2;
        }
        else{
            smallNumber = number1;
        }
        return smallNumber;
    }

    public static void main(String[] args) {
        int result = least(2, 7);
        System.out.println("Least: " + result);
    }
}
