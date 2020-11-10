import java.util.Scanner;

class transpose {
	public static void main(String args[]){
		int m,n;
		Scanner inp=new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		m=inp.nextInt();
		System.out.print("Enter the number of colums : ");
		n=inp.nextInt();
		int[][] matrix=new int[m][n]; 
		int[][] trans=new int[n][m]; 
		int i,j,temp;
		System.out.println("Enter elements of the matrix : ");
		for(i=0;i<m;i++) {
			for(j=0;j<n;j++) {
				matrix[i][j]=inp.nextInt();
			}
		}
		for(j=0;j<n;j++)
		{
			for(i=0;i<m;i++)
			{
				trans[j][i]=matrix[i][j];
			}
		}
		System.out.println("The transpose matrix is : ");
		for(i=0;i<n;i++) {
			for(j=0;j<m;j++) {
				System.out.print(trans[i][j]+" ");
			}
			System.out.println();
		}
	}
}
