
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        int greatNumber = 0;
        if (number1 > number2) {
            greatNumber = number1;
        }
        else{
            greatNumber = number2;
        }
        if (greatNumber < number3) {
            greatNumber = number3;
        }

        return greatNumber;
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}