
import java.util.ArrayList;
import java.util.Scanner;

public class Main {  

    public static void main(String[] args) {
    // implement your program here
    // do not put all to one method/class but rather design a proper structure to your program
        
    // Your program should use only one Scanner object, i.e., it is allowed to call 
    // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
        ArrayList<Bird> myBirdList = new ArrayList<Bird>();
        
        Scanner myScanner = new Scanner(System.in);
        //String command = myScanner.nextLine();
        boolean goon = true;
    while(goon){    
        System.out.println("?");
        String command = myScanner.nextLine();
        if (command.equals("Add")) {
            System.out.println("Name: ");
            String name = myScanner.nextLine();
            System.out.println("Latin Name: ");
            String latinName = myScanner.nextLine();
            Bird myBird = new Bird(name, latinName);
            myBirdList.add(myBird);
        }
        else if(command.equals("Observation")){
            System.out.println("What was observed:? ");
            String name = myScanner.nextLine();
            for (Bird bird : myBirdList) {
                if (bird.getName().equals(name)) {
                    bird.addObservation();
                }
                else{
                    System.out.println("Is not a bird!");
                }
            }
        }
        else if(command.equals("Statistics")){
            for (Bird bird : myBirdList) {
                System.out.println(bird.getName() + "(" + bird.getLatinName() + "): " + bird.getObservation() + " observations");
            }
        }
        else if(command.equals("Show")){
            System.out.println("what?");
            String myString = myScanner.nextLine();
            for (Bird bird : myBirdList) {
                if (myString.equals(bird.getName())) {
                    System.out.println(bird.getName() + "(" + bird.getLatinName() + "): " + bird.getObservation() + " observations");
                }
            }
        }
        else if(command.equals("Quit")){
            goon = false;
        }
    }
            
    }

}
