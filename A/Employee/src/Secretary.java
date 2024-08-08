public class Secretary extends Employee {
    public Secretary(int yearsWithFirm) {
        super(yearsWithFirm);
    }

    // Secretaries don't get a bonus for their years of service
    @Override
    public int getSeniorityBonus() {
        return 0;
    }

    public void takeDictation(String text) {
        System.out.println("Taking dictation of text: " + text);
    }
}
