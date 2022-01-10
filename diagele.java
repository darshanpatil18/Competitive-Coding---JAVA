import java.util.*;
class diagele{
	static int MAX = 100;
	static void printPrinDiag(int mat[][], int n)
	{
		System.out.print("Principal Diagonal: ");

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j) {
					System.out.print(mat[i][j] + ", ");
				}
			}
		}
		System.out.println("");
	}
	static void printSecDiag(int mat[][], int n)
	{
		System.out.print("Secondary Diagonal: ");

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if ((i + j) == (n - 1)) {
					System.out.print(mat[i][j] + ", ");
				}
			}
		}
		System.out.println("");
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows and columns in array: ");
		int x=sc.nextInt();
		int arr[][] = new int[x][x];
		System.out.println("Enter the elements of array: ");
		for(int i=0;i<x;i++){
			for(int j=0;j<x;j++){
				arr[i][j]=sc.nextInt();
			}
		}
		printPrinDiag(arr, x);
		printSecDiag(arr, x);
	}
}