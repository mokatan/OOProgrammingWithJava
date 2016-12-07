
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mehmet
 */
public class Phonebook {
    private ArrayList<Person> personList;
    
    public Phonebook(){
        this.personList = new ArrayList<Person>();
    }
    
    public void add(String name, String number){
        Person newPerson = new Person(name, number);
        this.personList.add(newPerson);
    }
    
    
    public String searchNumber(String name){
        for (Person person : personList) {
            if (person.getName().matches(name)) {
                return person.getNumber();
            }
        }
        return "number not known";
    }
    
    public void printAll(){
        for (Person person : this.personList) {
            System.out.println(person);
        }
    }
}
