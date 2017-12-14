public class Managers extends Employee {
	private int salary = 50000 + 2500*getYear() + 6800;
	public Managers () {
    	this(null, null, null, null, 0);
    }
    public Managers (String name, String sex, String phone, String address, int year) {
    	super(name, sex, phone, address, year);
    }
	public int getSalary () {
		return salary;
	}
	public void showProfile() {
		super.showProfile();
	}
}