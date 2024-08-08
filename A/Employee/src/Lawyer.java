public class Lawyer extends Employee {
    public Lawyer(int yearsWithFirm) {
        super(yearsWithFirm);
    }

    @Override
    public double getSalary() {
        return super.getSalary() + 5000 * super.getYearsWithFirm();
    }

    @Override
    public int getVacationDays() {
        int baseVacationDays = super.getVacationDays();
        return baseVacationDays + 5;           // Base vacation plus 5 days (1 week)
    }

    @Override
    public String getVacationForm() {
        return "pink";     // use the pink form
    }

    public void sue() {
        System.out.println("I'll see you in court!");
    }
}
