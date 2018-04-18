package tues.sis;

/**
 *
 * @author john
 */
public class Teacher extends Person {
    private int numberOfCreditsTeaching;

    public int getNumberOfCreditsTeaching() {
        return numberOfCreditsTeaching;
    }

    public Teacher(int numberOfCreditsTeaching, String name, int age) {
        super(name, age);
        this.numberOfCreditsTeaching = numberOfCreditsTeaching;
    }
}
