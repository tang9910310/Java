public class Supervisors extends Employee {
	private int salary = 50000 + 2500*getYear() + 3000;
	public Supervisors () {
    	this(null, null, null, null, 0);
    }
    public Supervisors (String name, String sex, String phone, String address, int year) {
    	super(name, sex, phone, address, year);
    }
	public int getSalary () {
		return salary;
	}
	public void showProfile() {
		super.showProfile();
	}
}