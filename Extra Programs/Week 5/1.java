import java.util.Scanner;

class employee {
	int empid;
	String empName;
	int empnohrs;
	int empbasic;
	int emphra;
	int empda;
	int empit;
	int empgross;

	void getData() {
		Scanner inp = new Scanner(System.in);

		System.out.println("Enter employee details : ");
		System.out.print("Name : ");
		empName = inp.nextLine();
		System.out.print("ID : ");
		empid = inp.nextInt();
		System.out.print("Employee no of hours : ");
		empnohrs = inp.nextInt();
		System.out.print("Basic Salary : ");
		empbasic = inp.nextInt();
		System.out.print("HRA(in %) : "  );
		emphra = inp.nextInt();
		System.out.print("IT(in %) : "  );
		empit = inp.nextInt();
		System.out.print("DA(in %) : "  );
		empda = inp.nextInt();
	}


	void cal_gross() {
		empgross = empbasic + (empbasic*emphra/100) + (empbasic*empda/100) - (empbasic*empit/100);
		System.out.println("Gross salary : "+empgross);
	}

	void cal_overtime() {
		int extra;
		int amount;

		if(empnohrs>200) {
			extra = empnohrs-200;
			amount = extra*100;
			empgross = amount + empgross;
			System.out.println("Gross Salary after overtime : "+empgross);
		}
		else if(empnohrs <200) {
			extra = 200-empnohrs;
			amount = extra*100;
			empgross = empgross - amount;
			System.out.println("Gross Salary after less time : "+empgross);
		}
		
	}
}

class employeeWeek5{
	public static void main(String[] args) {
		employee e = new employee();
		e.getData();
		e.cal_gross();
		e.cal_overtime();
	}
}
