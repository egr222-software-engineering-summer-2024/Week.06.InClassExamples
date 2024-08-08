public class LegalSecretary extends Secretary {
    public LegalSecretary(int yearsWithFirm) {
        super(yearsWithFirm);
    }

    @Override
    public double getSalary() {
        double baseSalary = super.getSalary();
        return baseSalary + 5000.0; // $5,000.00 / year ABOVE the base salary
    }

    public void fileLegalBriefs() {
        System.out.println("I could file all day!");
    }
}
