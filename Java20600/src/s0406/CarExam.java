package s0406;

public class CarExam {

	public static void main(String[] args) {
		Car redCar = new Car();
		Car blueCar = new Car();
		
		redCar.car_name ="제네시스";
		redCar.price=5000;
		redCar.brand="현대";
		redCar.velocity = 30;
		
		blueCar.car_name ="510D";
		blueCar.price=8000;
		blueCar.brand="BMW";
		blueCar.velocity = 40;
		
		redCar.run();
		redCar.vel_up(10);//40
		redCar.vel_up(20);//60
		redCar.vel_down(40); //20
		redCar.vel_up(150);//170-->100
		redCar.stop();
		redCar.vel_down(40);//60
		redCar.stop();
				

	}

}




