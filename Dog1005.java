class Dog{
	private String name;
	private String variety;
	private int age;

	public Dog(String name, String variety, int age){
		setDog(name, variety, age);
	}
	public Dog(){
		setDog(null, null, 0);
	}
	public Dog(String name){
		setDog(name, null, 0);
	}
	public Dog(String name, String variety){
		setDog(name, variety, 0);
	}
	public void setDog(String name, String variety, int age){
		setName(name);
		setVariety(variety);
		setAge(age);
	}
	public void setName(String name){
		this.name = name;
	}
	public void setVariety(String variety){
		int i;
		String Name[] = {"���h�_" ,"�P��" ,"���" ,"þ�z��" ,"�N����" ,"�լ���" ,"�Q����" ,"���Ϥ�" ,"�ñ�" ,"�_��"};
		for (i = 0;i<Name.length ;i++ ) {
			if (variety.equals(Name[i])) {
				this.variety = variety;
                break;
			}
		}
		if (i == Name.length) {
			this.variety = "�V�ؤ�";
		}
	}
	public void setAge(int age){
		this.age = ((age >= 0) ? age : 0);
	}
	public String getName(){
		return name;
	}
	public String getVariety(){
		return variety;
	}
	public int getAge(){
		return age;
	}
    public void showInformation(){
    	System.out.println("�d�����G" + name + "�A�~�ءG" + variety + "�A�~���G" + age);
    }
}