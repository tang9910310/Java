class Engineer extends Employee{
	private int salary;
	private String skill;
	private double yearsalary;

	public Engineer() {
		super();
		setEngineer(0, null);
	}
	public Engineer(String name, String telephone, int year, int salary, String skill) {
		super(name, telephone, year);
		setEngineer(salary, skill);
	}
	public Engineer(Engineer engineer) {
		setEngineer(engineer.get_Salary(), engineer.get_Skill());
	}
	public void setEngineer(int salary, String skill) {
		set_Salary(salary);
		set_Skill(skill);
	}
	private void set_Salary(int num) {
        salary = ((num > 0) ? num : 0);
	}
	private void set_Skill(String name) {
		skill = name;
	}
	private int get_Salary() {
		return salary;
	}
	private String get_Skill() {
		return skill;
	}
	private double get_YearSalary() {
		if (super.get_Year() <= 5) {
			yearsalary = super.get_Year() * 12 * 1.1;
		}
		else if (super.get_Year() > 5&&super.get_Year() <= 15) {
			yearsalary = get_Salary() * 12 * 1.2;
		}
		else if (super.get_Year() > 15&&super.get_Year() <= 25) {
			yearsalary = get_Salary() * 12 * 1.3;
		}
		else if (super.get_Year() > 25&&super.get_Year() <= 30) {
			yearsalary = get_Salary() * 12 * 1.4;
		}
		return yearsalary;
	}
	@Override
	public void showProfile() {
		super.showProfile();
		System.out.println("工程師薪水：" + salary);
    	System.out.println("工程師專長：" + skill);
    	int i = (int)get_YearSalary();
    	System.out.println("工程師年薪：" + i);
	}
}