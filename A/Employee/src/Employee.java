// A class to represent employees in general (20-page manual).
public class Employee {
    private int yearsWithFirm;

    public Employee(int yearsWithFirm) {
        this.yearsWithFirm = yearsWithFirm;
    }

    public int getHours() {
        return 40;           // works 40 hours / week
    }

    public double getSalary() {
        return 50000.0;      // $51,000.00 / year plus $10K raise
    }

    public int getVacationDays() {
        return 10 + getSeniorityBonus();     // 2 weeks paid vacation + seniority bonus
    }

    public String getVacationForm() {
        return "yellow";     // use the yellow form
    }

    public int getYearsWithFirm() {
        return yearsWithFirm;
    }

    public int getSeniorityBonus() {
        return 2 * yearsWithFirm;
    }
}