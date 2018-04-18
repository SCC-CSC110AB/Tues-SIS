package tues.sis;

/**
 *
 * @author john
 */
public class Student extends Person {
    private int numberOfCredits;

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    @Override
    public String toString() {
        return super.toString() 
                + " and is taking " 
                + this.numberOfCredits 
                + " credits this semester";
    }

    public Student(int numberOfCredits, String name, int age) {
        super(name, age);
        this.numberOfCredits = numberOfCredits;
    }
}
