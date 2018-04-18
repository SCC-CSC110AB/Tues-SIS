package tues.sis;

/**
 *
 * @author john
 */
public class TuesSIS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person sally = new Person("Sally", 19);
        
        System.out.println(sally.getName());
        
        System.out.println(Person.numberOfPeople);
        
        Student joe = new Student(12, "Joe", 20);
        
        System.out.println(Person.numberOfPeople);
        
        System.out.println(sally);
        System.out.println(joe);
    }
    
}
