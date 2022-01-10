import java.util.*;
public class MatrixMult{  
public static void main(String args[]){      
Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows in array: ");
		int x=sc.nextInt();
		System.out.println("Enter the number of columns in array: ");
		int y=sc.nextInt();
		int arr1[][] = new int[x][y];
		System.out.println("Enter the elements of first array: ");
		for(int i=0;i<x;i++){
			for(int j=0;j<y;j++){
				arr1[i][j]=sc.nextInt();
			}
		}
		int arr2[][] = new int[x][y];
		System.out.println("Enter the elements of second array: ");
		for(int i=0;i<x;i++){
			for(int j=0;j<y;j++){
				arr2[i][j]=sc.nextInt();
			}
		}    
        
int arr3[][]=new int[x][y];     
for(int i=0;i<x;i++){    
for(int j=0;j<y;j++){    
arr3[i][j]=0;      
for(int k=0;k<x;k++)      
{      
arr3[i][j]+=arr1[i][k]*arr2[k][j];      
}
System.out.print(arr3[i][j]+" ");  
}  
System.out.println();    
}    
}}