package s0525;

public class Circle {
	double radius;
	final static double PI = 3.14;
	
	Circle(){
		
	}
	Circle(double radius){
		this.radius = radius ; 
	}
	
	double getRadius() {
		return radius;
	}
	
	void setRadius(double radius) {
		this.radius = radius;
	}
	
	double computeArea() { //넓이;
		return PI*radius*radius ;
	}
	
	double computePerimeter( ) { //둘레
		return 2*PI*radius;
	}

	void print() {
		 System.out.println("반지름:"+ getRadius() 
		 + " 원의 면적:" + computeArea() 
		 + " 원의 둘레:" + computePerimeter());

	}
}





