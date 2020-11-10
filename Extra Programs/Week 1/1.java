import java.util.Scanner;

public class ExtraProg1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of elements present inside the array: ");
		int n = input.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the array: "); 
		
		for(int i=0;i<n;i++) {
			a[i] = input.nextInt();
		}
		int sum = 0;
		int j = 0;
		System.out.print("Sum of even indices: ");
		while(j<n) {
			sum = sum+a[j];
			j = j+2;
		}
		System.out.println(sum);

		j = 1;
		sum = 0;
		System.out.print("Sum of odd indices: ");
		while(j<n) {
			sum = sum+a[j];
			j = j+2;
		}
		System.out.println(sum);
	}
}
