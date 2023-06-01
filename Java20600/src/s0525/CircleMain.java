package s0525;

import s0601.Car;
import s0601.Truck;

public class CircleMain {

	public static void main(String[] args) {
		Circle c1 = new Circle();
		c1.setRadius(5.0);
		c1.print();

		Circle c2 = new Circle(8.0);
		c2.print();

		// 다른 패키지
		//동일 패키지 
		/*Car c = new Car();
		c.setName("프론티어");
		c.color = "RED";
		c.velocity = 0;
		c.company = "현대";*/

}
