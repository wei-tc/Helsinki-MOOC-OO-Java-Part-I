/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author W
 */
import java.util.ArrayList;

public class Phonebook {

    private ArrayList<Person> phonebook;

    public Phonebook() {
        phonebook = new ArrayList();
    }

    public void add(String name, String number) {
        phonebook.add(new Person(name, number));

    }

    public void printAll() {
        for (Person person : phonebook) {
            System.out.println(person);
        }
    }

    public String searchNumber(String name) {
        
            for (Person person : phonebook) {
                if (person.getName().equals(name)) {
                    return person.getNumber();
                }
//            int index = phonebook.indexOf(name);
//            System.out.println(index);
//            
//            
//            
//            Person person = phonebook.get(index);
//            System.out.println(person);
//            
//            String number = person.getNumber();
//            System.out.println(number);
//            
//            return person.getNumber();
            }
        
        return "number not known";
    }

}
