import java.util.Scanner;

abstract class Solid{
	int h;
	int r;
	double tsa;//total surface area
	double vol;//volume

	abstract void surface_area();
	abstract void volume();
}

class cylinder extends Solid{
	Scanner inp = new Scanner(System.in);
	cylinder() {
		System.out.print("Enter height and radius : ");
		h = inp.nextInt();
		r = inp.nextInt();
	}

	void surface_area() {
		tsa = (double)2*3.14*r*(h+r);
		System.out.println("Total surface area of cylinder : "+tsa);
	}

	void volume() {
		vol = (double)3.14*r*r*h;
		System.out.println("Volume of cylinder : "+vol);
	}
}

class cone extends Solid{
	Scanner inp = new Scanner(System.in);
	cone() {
		System.out.print("Enter height and radius : ");
		h = inp.nextInt();
		r = inp.nextInt();
	}

	void surface_area() {
		tsa = (double)3.14*r*h+3.14*r*r;
		System.out.println("Total surface area of cylinder : "+tsa);
	}

	void volume() {
		vol = (double)3.14*r*r*h/3;
		System.out.println("Volume of cylinder : "+vol);
	}
}


class sphere extends Solid{
	Scanner inp = new Scanner(System.in);
	sphere() {
		System.out.print("Enter radius : ");
		r = inp.nextInt();
	}

	void surface_area() {
		tsa = (double)4*3.14*r*r;
		System.out.println("Total surface area of cylinder : "+tsa);
	}

	void volume() {
		vol = (double)4*3.14*r*r*r/3;
		System.out.println("Volume of cylinder : "+vol);
	}
}

class SolidWeek8{
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.println("1.Surface Area and Volume of Cylinder\n2.Surface Area and Volume of Cone\n3.Surface Area and Volume of Sphere\n4.Exit");
		System.out.print("Enter your choice : ");
		int opt = inp.nextInt();
		while(opt!=4) {
			switch(opt) {
				case 1: cylinder c = new cylinder();
						c.surface_area();
						c.volume();
						break;

				case 2: cone co = new cone();
						co.surface_area();
						co.volume();
						break;

				case 3: sphere s = new sphere();
						s.surface_area();
						s.volume();
						break;
			}
			System.out.print("Enter your choice : ");
			opt = inp.nextInt();
		}
	}
}
