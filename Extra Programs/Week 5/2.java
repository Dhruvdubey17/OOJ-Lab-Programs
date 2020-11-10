import java.util.Scanner;

class Age{
	String name;
	int year;
	int month;

	void getData() {
		Scanner inp = new Scanner(System.in);
		System.out.print("Name : ");
		name = inp.nextLine();
		System.out.print("Month and Year of birth : ");
		month = inp.nextInt();
		year = inp.nextInt();
	}
}

class ageWeek5{
	public static void main(String[] args) {
		System.out.println("Details of person 1");
		Age a1 = new Age();
		a1.getData();
		System.out.println("Details of person 2");
		Age a2 = new Age();		
		a2.getData();

		if(a2.year == a1.year) {
			if(a2.month > a1.month) {
				System.out.println(a1.name+ " is elder ");
			}
			else
				System.out.println(a2.name+ " is elder ");

		}
		else if(a1.year > a2.year) {
			System.out.println(a2.name+ " is elder ");
		}
		else if(a2.year > a1.year){
			System.out.println(a1.name+ " is elder ");
		}
	}
}
