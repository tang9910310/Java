public abstract class Employee {
	private String name;
	private String sex;
	private String phone;
	private String address;
	private int year;
    public Employee () {
    	this(null, null, null, null, 0);
    }
    public Employee (String name, String sex, String phone, String address, int year) {
    	setEmployee(name, sex, phone, address, year);
    }
    public Employee (Employee employee) {
    	setEmployee(employee.getName(), employee.getSex(), employee.getPhone(), employee.getAddress(), employee.getYear());
    }
    public void setEmployee(String name, String sex, String phone, String address, int year) {
    	setName(name);
    	setSex(sex);
    	setPhone(phone);
    	setAddress(address);
    	setYear(year);
    }
    private void setName (String name){
    	this.name = name;
    }
    private void setSex (String name){
    	sex = name;
    }
    private void setPhone (String name){
    	phone = name;
    }
    private void setAddress (String name){
    	address = name;
    }
    private void setYear (int num) {
    	year = num;
    }
    public String getName () {
    	return name;
    }
    public String getSex () {
    	return sex;
    }
    public String getPhone () {
    	return phone;
    }
    public String getAddress () {
    	return address;
    }
    public int getYear () {
    	return year;
    }
    public abstract int getSalary();
    public void showProfile() {
    	System.out.print("名字：" + name);
    	System.out.print("，性別：" + sex);
    	System.out.print("，年資：" + year);
    	System.out.print("，薪資：" + getSalary());
    	System.out.print("，電話：" + phone);
    	System.out.println("，地址：" + address);
    }
}