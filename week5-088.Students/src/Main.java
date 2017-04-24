
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<Student>();
        
        while (true) {
            System.out.println("name: ");        
            String name = reader.nextLine();
            
            if (name.equals("")) {
                break;
            }
            
            System.out.println("studentnumber: ");
            String studentNumber = reader.nextLine();
            
            list.add(new Student(name, studentNumber));
        }
        
        for (Student info : list) {
            System.out.println( info );
        }
        
        System.out.println();
        
        System.out.println("Give search term: ");
        String searchTerm = reader.nextLine();
        System.out.println("Result: ");
        
        for (Student search : list) {
            if (search.getName().contains(searchTerm)) {
                System.out.println(search);
            }
        }
        
        
        
        
    }
}