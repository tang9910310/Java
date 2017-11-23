class Employee{
	private String name;
	private String telephone;
	private int year;
    
	public Employee(){
		this(null, null, 0);
	}
	public Employee(String name, String telephone, int year){
		setEmployee(name, telephone, year);
	}
	public Employee(Employee employee) {
		this(employee.get_Name(), employee.get_Telephone(), employee.get_Year());
	}
	public void setEmployee(String name, String telephone, int year) {
		set_Name(name);
		set_Telephone(telephone);
		set_Year(year);
	}
	private void set_Name(String name){
		this.name = name;
	}
	private void set_Telephone(String name) {
		int i;
        for (i = 0;i < name.length() ;i++ ) {
        	if (name.charAt(0) != '0') {
        		telephone = "0912345678";
        		break;
        	}
        	else if (name.charAt(1) != '9') {
        		telephone = "0912345678";
        		break;
        	}
        	else if (name.charAt(i) < '0'||name.charAt(i) > '9') {
        		telephone = "0912345678";
        		break;
        	}
        }
        if (name.length() == 10&&i == name.length()) {
        	telephone = name;
        }
        else {
        	telephone = "0912345678";
        }
	}
	private void set_Year(int num){
		year = ((num >= 1&&num <= 30) ? num : 1);
	}
	private String get_Name(){
		return name;
	}
	private String get_Telephone(){
		return telephone;
	}
	public int get_Year(){
		return year;
	}
    public void showProfile(){
    	System.out.println("員工姓名：" + name);
    	System.out.println("員工手機：" + telephone);
    	System.out.println("員工年資：" + year);
    }
}