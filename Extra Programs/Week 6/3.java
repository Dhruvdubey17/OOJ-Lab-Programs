import java.util.Scanner;

class Actor{
	int id;
	String name;
	int no_of_movies;
	int no_of_years_exp;
	int avg_performance;

	void getdata() {
		Scanner inp=new Scanner(System.in);
		System.out.println("Enter the following details of the actor :");
		System.out.print("ID : ");
		id=inp.nextInt();
		inp.nextLine();
		System.out.print("Name : ");
		name=inp.nextLine();
		System.out.print("Number of Movies : ");
		no_of_movies=inp.nextInt();
		System.out.print("Number of years experienced : " );
		no_of_years_exp=inp.nextInt();	
	}

	void cal_avg_per(){
		avg_performance = no_of_movies/no_of_years_exp;
	}
}

class ActorInfo{
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter number of actors : ");
		int n = inp.nextInt();
		Actor a[] = new Actor[n];
		for(int i=0;i<n;i++) {
			System.out.println("Actor "+(i+1));
			a[i] = new Actor();
			a[i].getdata();
			a[i].cal_avg_per();
		}

		int temp=0,max = a[0].avg_performance;
		for(int i=1;i<n;i++) {
			if(a[i].avg_performance>max){
				max = a[i].avg_performance;
				temp = i;
			}
		}
		System.out.println("Actor with best average : "+a[temp].name);
	}
}
