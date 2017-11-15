public class week1001{
	public static void  main(String[] args){
		int carLength = 0, engCC = 0, maxSpeed = 0;
		String modelName;
		Car car1 = new Car();
		car1.showProfile();
		Car car2 = new Car("BMW", 3, 4000, 320);
		car2.showProfile();
		Car car3 = new Car("Audi", 5, 3500, 260);
		car3.showProfile();
		Car car4 = new Car("Benz", -50, 2700, 290);
		car4.showProfile();
		Car car5 = new Car("TOYOTA", 7, 5600, 200);
		car5.showProfile();
		Car car6 = new Car("VOLVO", 4, 3000, -90);
		car6.showProfile();
 	}
}