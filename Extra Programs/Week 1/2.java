import java.util.Scanner;

public class ExtraProg2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of elements present inside the array: ");
		int n = input.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the array: "); 
		int cnt1 = 0;
		int cnt2 = 0;
		int cnt3 = 0;
		for(int i=0;i<n;i++) {
			a[i] = input.nextInt();
			if(a[i]>0) 
				cnt1++;
			else if(a[i]==0)
				cnt2++;
			else 
				cnt3++;
		}
		System.out.println("Number of positive integers: "+cnt1);
		System.out.println("Number of zeroes: "+cnt2);
		System.out.println("Number of negative integers: "+cnt3);
	}
}
