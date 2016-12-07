public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        for (int i = 1; i <= amount; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printWhitespaces(int amount) {
        // 40.1
        for (int i = 0; i < amount; i++) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        // 40.2
        for (int i = 1; i <= size; i++) {
            
            int nrOfSpace = size - i;
            //int nrOfStars = i;
            //for (int j = 0; j < nrOfSpace; j++) {
                //printWhitespaces(1);
            //}
            printWhitespaces(nrOfSpace);
            printStars(i);
        }
    }

    public static void xmasTree(int height) {
        // 40.3
        int totalWidth = height*2-1;
        for (int i = 1; i <= height; i++) {
            int numberOfStars = i*2-1;
            int numberOfSpaces = totalWidth - numberOfStars;
            printWhitespaces(numberOfSpaces/2);
            printStars(numberOfStars);
        }
        int numberOfSpaces = (totalWidth - 3)/2;
        printWhitespaces(numberOfSpaces);
        printStars(3);
        printWhitespaces(numberOfSpaces);
        printStars(3);
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
