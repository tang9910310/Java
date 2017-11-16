class Employee{
	private String name = null;
	private String position = "一般員工";
	private int year = 0;
	private int money = 0;

	public Employee(String name, String position, int year){
		setEmployee(name, position, year);
	}
	public Employee(){
		setEmployee(null, "一般員工", 0);
	}
	public Employee(String name){
		setEmployee(name, "一般員工", 0);
	}
	public Employee(String name, String position){
		setEmployee(name, position, 0);
	}
	public Employee(String name, int year){
		setEmployee(name, "一般員工", year);
	}
	public void setEmployee(String name, String position, int year){
		setName(name);
		setPosition(position);
		setYear(year);
	}
	public void setName(String name){
		this.name = name;
	}
	public void setPosition(String position){
		int i;
		String Name[] = {"一般員工" ,"主管" ,"部長"};
		for (i = 0;i<Name.length ;i++ ) {
			if (position.equals(Name[i])) {
				this.position = position;
				break;
			}
		}
		if (i == Name.length) {
			this.position = "一般員工";
		}
	}
	public void setYear(int year){
		this.year = ((year >= 0&&year <= 15) ? year : 1);
	}
	public String getName(){
		return name;
	}
	public String getPosition(){
		return position;
	}
	public int getYear(){
		return year;
	}
    public void show(){
    	if (position.equals("一般員工")) {
    		money = 22000;
    	}
    	else if (position.equals("主管")) {
    		money = 40000;
    	}
    	else {
    		money = 55000;
    	}
    	if (year <= 5) {
    		money = money + 2000;
    	}
    	else if (year <= 10) {
    		money = money + 6000;
    	}
    	else {
    		money = money + 12000;
    	}
    	System.out.println("姓名：" + name + "，職位：" + position + "，年資：" + year + "，月薪：" + money);
    }
}