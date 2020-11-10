import java.util.Scanner;

class circleDemo{
	double radius;
	double area;
	double perimeter;
	
	void getData(){
		Scanner inp=new Scanner(System.in);
		System.out.print("Enter the radius of the circle : ");
		radius=inp.nextDouble();
	}
	void calculate_peri() {
		perimeter=2*3.14*radius;
	}
	void calculate_area() {
		area=3.14*radius*radius;
	}
	
	void printData() {
		System.out.println("Radius : "+radius);
		System.out.println("Perimeter : "+perimeter);
		System.out.println("Area : "+area);	
	}
}

public class circle{
	public static void main(String args[]){
		circleDemo c = new circleDemo();
		c.getData();
		c.calculate_peri();
		c.calculate_area();
		c.printData();
	}
}
