public class Lawyer extends Employee {
    @Override
    public int getVacationDays() {
        return 15;           // 3 weeks paid vacation
    }

    @Override
    public String getVacationForm() {
        return "pink";     // use the pink form
    }

    public void sue() {
        System.out.println("I'll see you in court!");
    }
}
