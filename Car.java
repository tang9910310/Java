class Car{
	private String modelName;
	private int carLength;
	private int engCC;
	private int maxSpeed;

	public Car(String modelName, int carLength, int engCC, int maxSpeed){
		setCar(modelName, carLength, engCC, maxSpeed);
	}
	public Car(){
		setCar(null, 0, 0, 0);
	}
	public Car(String modelName){
		setCar(modelName, 0, 0, 0);
	}
	public Car(String modelName, int carLength){
		setCar(modelName, carLength, 0, 0);
	}
	public void setCar(String modelName, int carLength, int engCC, int maxSpeed){
		setModel(modelName);
		setCarLength(carLength);
		setEngCC(engCC);
		setMaxSpeed(maxSpeed);
	}
	public void setModel(String modelName){
		this.modelName = modelName;
	}
	public void setCarLength(int carLength){
		this.carLength = ((carLength >= 0) ? carLength : 0);
	}
	public void setEngCC(int engCC){
		this.engCC = ((engCC >= 2500&&engCC <= 5000) ? engCC : 0);
	}
	public void setMaxSpeed(int maxSpeed){
		this.maxSpeed = ((maxSpeed >= 0&&maxSpeed <= 400) ? maxSpeed : 0);
	}
    public void showProfile(){
    	System.out.println("汽車品牌：" + modelName + "，車身：" + carLength + "m，CC數：" + engCC +"cc，最高速：" + maxSpeed + "km/hr");
    }
}