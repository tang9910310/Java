public class Basic_Employee extends Employee {
	private int salary = 30000 + 1500*getYear();
	public Basic_Employee () {
    	this(null, null, null, null, 0);
    }
    public Basic_Employee (String name, String sex, String phone, String address, int year) {
    	super(name, sex, phone, address, year);
    }
	public int getSalary () {
		return salary;
	}
	public void showProfile() {
		super.showProfile();
	}
}