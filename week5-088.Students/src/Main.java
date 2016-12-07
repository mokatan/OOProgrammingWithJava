
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write here the main program
        Scanner reader = new Scanner(System.in);
        ArrayList<Student> studentList = new ArrayList<Student>();
        boolean askingState = true;
        while(askingState){
            
            System.out.println("name: ");
            String name = reader.nextLine();
            if (name.isEmpty()) {
                break;
            }
            
            System.out.println("studentnumber: ");
            String studentNumber = reader.nextLine();
            
            Student student = new Student(name, studentNumber);
            
            studentList.add(student);
        }
        
        for (Student students : studentList) {
            System.out.println(students.toString());
        }
        
        System.out.println("Give search term: ");
        String searchTerm = reader.nextLine();
        System.out.println("Result: ");
        
        for(Student students : studentList){
            if (students.getName().contains(searchTerm)) {
                System.out.println(students.toString());
            }
        }
        
    }
}