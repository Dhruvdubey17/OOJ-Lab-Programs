import java.util.Scanner;

class Person{
	String name;
	int id;
}

class Employee extends Person{
	int salary;
}

class Teaching extends Employee{
	String subject;
	Scanner inp = new Scanner(System.in);
	void getData() {
		System.out.print("Name of the teacher : ");
		name = inp.nextLine();
		System.out.print("Teacher ID: ");
		id = inp.nextInt();
		inp.nextLine();
		System.out.print("Subject expertise: ");
		subject = inp.nextLine();
		System.out.print("Salary of Teacher: ");
		salary = inp.nextInt();
	}

	void printData() {
		System.out.println("Name : "+name);
		System.out.println("Teacher ID: "+id);
		System.out.println("Subject expertise: "+subject);
		System.out.println("Salary of Teacher: "+salary);
	}
}
class Non_teaching extends Employee{
	String department;
	Scanner inp = new Scanner(System.in);
	void getData() {
		System.out.print("Name of the employee : ");
		name = inp.nextLine();
		System.out.print("Employee ID: ");
		id = inp.nextInt();
		inp.nextLine();
		System.out.print("Department of employee: ");
		department = inp.nextLine();
		System.out.print("Salary of Employee: ");
		salary = inp.nextInt();
	}

	void printData() {
		System.out.println("Name : "+name);
		System.out.println("Teacher ID: "+id);
		System.out.println("Subject expertise: "+department);
		System.out.println("Salary of Employee: "+salary);
	}
}

class Student extends Person{
	String admission_thru;
	String branch;
}

class UG extends Student {
	int sem;
	Scanner inp = new Scanner(System.in);
	void getData() {
		System.out.print("Name of the student : ");
		name = inp.nextLine();
		System.out.print("Student id : ");
		id = inp.nextInt();
		System.out.print("Semester of Student: ");
		sem = inp.nextInt();
		inp.nextLine();
		System.out.print("Way of Admission of student : ");
		admission_thru = inp.nextLine();
		System.out.print("Branch of Student : ");
		branch = inp.nextLine();
	}

	void printData() {
		System.out.print("Name of the student : "+name);
		System.out.print("Student id : "+id);
		System.out.print("Semester of Student: "+sem);
		System.out.print("Way of Admission of student : "+admission_thru);
		System.out.print("Branch of Student : "+branch);
	}
}

class PG extends Student{
	int sem;
	Scanner inp = new Scanner(System.in);
	void getData() {
		System.out.print("Name of the student : ");
		name = inp.nextLine();
		System.out.print("Student id : ");
		id = inp.nextInt();
		System.out.print("Semester of Student: ");
		sem = inp.nextInt();
		inp.nextLine();
		System.out.print("Way of Admission of student : ");
		admission_thru = inp.nextLine();
		System.out.print("Branch of Student : ");
		branch = inp.nextLine();
	}

	void printData() {
		System.out.print("Name of the student : "+name);
		System.out.print("Student id : "+id);
		System.out.print("Semester of Student: "+sem);
		System.out.print("Way of Admission of student : "+admission_thru);
		System.out.print("Branch of Student : "+branch);
	}
}

class personWeek8{
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);

		int n1,n2,n3,n4;
		System.out.print("Number of teaching employees : ");
		n1 = inp.nextInt();
		System.out.print("Number of non-teaching employees : ");
		n2 = inp.nextInt();
		System.out.print("Number of UG students : ");
		n3 = inp.nextInt();
		System.out.print("Number of PG students : ");
		n4 = inp.nextInt();

		Teaching t[] = new Teaching[n1];
		Non_teaching nt[] = new Non_teaching[n2];
		UG u[] = new UG[n3];
		PG p[] = new PG[n4];

		for(int i=0;i<n1;i++) {
			System.out.println("Teacher "+(i+1));
			t[i] = new Teaching();
			t[i].getData();
		}

		for(int i=0;i<n2;i++) {
			System.out.println("Employee "+(i+1));
			nt[i] = new Non_teaching();
			nt[i].getData();
		}

		for(int i=0;i<n3;i++) {
			System.out.println("UG Student "+(i+1));
			u[i] = new UG();
			u[i].getData();
		}

		for(int i=0;i<n4;i++) {
			System.out.println("PG Student "+(i+1));
			p[i] = new PG();
			p[i].getData();
		}


		System.out.println("\n----------EMPLOYEE DETAILS--------");
		System.out.println("--------TEACHING EMPLOYEES--------");
		for(int i=0;i<n1;i++){
			System.out.println("Teacher "+(i+1));
			t[i].printData();
		}
		System.out.println("--------NON Teaching EMPLOYEES---------");
		for(int i=0;i<n2;i++){
			System.out.println("Employee "+(i+1));
			nt[i].printData();
		}
		System.out.println("\n----------END OF EMPLOYEE DETAILS--------\n");
		System.out.println("----------STUDENTS DETAILS--------");
		System.out.println("----------UG STUDENTS--------");
		for(int i=0;i<n3;i++) {
			System.out.println("UG Student "+(i+1));
			u[i].printData();
		}
		System.out.println("----------PG STUDENTS--------");
		for(int i=0;i<n4;i++){
			System.out.println("PG Student "+(i+1));
			p[i].printData();
		}
		System.out.println("\n----------END OF STUDENT DETAILS--------\n");
	}
}
