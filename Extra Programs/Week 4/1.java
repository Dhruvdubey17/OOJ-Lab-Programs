import java.util.Scanner;

class Player {
	int id;
	String name;
	int no_of_matches;
	int scores[];

	void getData() {
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter the following information : ");
		System.out.print("Name of the player : ");
		name = inp.nextLine();
		System.out.print("Player ID : ");
		id = inp.nextInt();
		System.out.print("Number of matches played : ");
		no_of_matches = inp.nextInt();
		scores = new int[no_of_matches];
		System.out.println("Enter the score in ");
		for(int i = 0;i<no_of_matches;i++) {
			System.out.print("Match "+(i+1)+" : ");
			scores[i] = inp.nextInt();
		}
	}

	void printData() {
		System.out.println("Name : "+name);
		System.out.println("Player id : "+id);
		System.out.println("No. of matches : "+no_of_matches);
		System.out.println("Scores : ");
		for(int i=0;i<no_of_matches;i++) {
			System.out.println("Match " + (i+1) + " : " +scores[i]);
		}
	}
	void cal_average() {
		int totalScore = 0;
		for(int i=0;i<no_of_matches;i++) {
			totalScore = totalScore + scores[i];
		}
		double average = (double)totalScore/no_of_matches;
		System.out.println("Average score of the player : "+average);
	}
}


public class playerWeek4 {
	public static void main(String[] args) {
		Player p = new Player();
		p.getData();
		p.printData();
		p.cal_average();
	}
}
