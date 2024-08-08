public class Marketer extends Employee {
    public Marketer(int yearsWithFirm) {
        super(yearsWithFirm);
    }

    @Override
    public double getSalary() {
        double baseSalary = super.getSalary();
        return baseSalary + 10000.0; // $10,000.00 / year above the base salary
    }

    public void advertise() {
        System.out.println("Act now while supplies last");
    }
}