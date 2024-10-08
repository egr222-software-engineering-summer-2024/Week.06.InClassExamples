public class EmployeeClient {

    public static void main(String[] args) {
	    Employee e = new Employee(0);
		Lawyer l = new Lawyer(5);
	    Secretary s = new Secretary(5);
		Marketer m = new Marketer(5);
		LegalSecretary ls = new LegalSecretary(8);

		printInfo(e);
		printInfo(l);
		l.sue();

		printInfo(s);
		s.takeDictation("Meeting notes");

		printInfo(m);
		m.advertise();

		printInfo(ls);
		ls.takeDictation("Legal meeting notes");
		ls.fileLegalBriefs();
    }

	public static void printInfo(Employee e) {
		System.out.println("salary: " + e.getSalary());
		System.out.println("v.days: " + e.getVacationDays());
		System.out.println("v.form: " + e.getVacationForm());
//		System.out.println();
	}
}