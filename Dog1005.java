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
		String Name[] = {"«¢¤h©_" ,"ÃP·à" ,"®ã¤ü" ,"Ã¾¸z¤ü" ,"¦N«½«½" ,"³Õ¬ü¤ü" ,"¶Q»«¤ü" ,"ªª¦Ï¤ü" ,"ÂÃ±Î" ,"¬_°ò"};
		for (i = 0;i<Name.length ;i++ ) {
			if (variety.equals(Name[i])) {
				this.variety = variety;
                break;
			}
		}
		if (i == Name.length) {
			this.variety = "²VºØ¤ü";
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
    	System.out.println("Ãdª«¬°¡G" + name + "¡A«~ºØ¡G" + variety + "¡A¦~¬ö¡G" + age);
    }
}