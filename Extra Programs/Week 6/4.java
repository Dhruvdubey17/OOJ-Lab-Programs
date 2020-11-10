import java.util.Arrays;

class commandLine{
	public static void main(String[] args) {
		int n = args.length;
		double a[] = new double[n];

		for(int i=0;i<n;i++){
			a[i] = Double.parseDouble(args[i]);
		}
		Arrays.sort(a);
		System.out.println("Sorted array: ");
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
	}
}
