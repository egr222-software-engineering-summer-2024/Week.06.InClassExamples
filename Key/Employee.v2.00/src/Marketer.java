// A class to represent marketers
public class Marketer extends Employee {
    public void advertise() {
        System.out.println("Act now while supplies last");
    }

    @Override
    public double getSalary() {
        return 50000.0; // $50,000.00 / year
    }
}
