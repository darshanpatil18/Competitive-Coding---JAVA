import java.util.*;
 public class multarrcrs {
     public static void main(String[] args){	
	   String result = "";
	   	Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements in array: ");
		int x=sc.nextInt();
		int arr1[] = new int[x];
		System.out.println("Enter the elements of first array: ");
		for(int i=0;i<x;i++){
			arr1[i]=sc.nextInt();
		}
		int arr2[] = new int[x];
		System.out.println("Enter the elements of second array: ");
		for(int i=0;i<x;i++){
			arr2[i]=sc.nextInt();
		}
	        for (int i = 0; i < x; i++) {
				int num1 = arr1[i];
				int num2 = arr2[i];
				result += Integer.toString(num1 * num2) + " "; 
			}
		System.out.println("\nResult: " + result);     
	 }			
}
