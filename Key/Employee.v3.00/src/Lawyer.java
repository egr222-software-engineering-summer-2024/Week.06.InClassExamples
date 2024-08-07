// A class to represent lawyers
public class Lawyer extends Employee {
    // overrides getVacationForm method in Employee class
    public String getVacationForm() {
        return "pink";
    }

    @Override
    public int getVacationDays() {
        return 15;  // 3 weeks vacation
    }

    public void sue() {
        System.out.println("I'll see you in court!");
    }
}
