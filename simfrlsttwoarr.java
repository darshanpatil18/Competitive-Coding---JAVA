import java.util.*;
import java.lang.*;
public class simfrlsttwoarr{
 public static void main(String args[])
 {
	Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements for First Array: ");
		int x=sc.nextInt();
		int arr1[] = new int[x];
		int arr2[] = new int[x];
		System.out.println("Enter the elements of First Array: ");
		for(int i=0;i<x;i++){
			arr1[i]=sc.nextInt();
		}
		System.out.println("Enter the number of elements for Second Array: ");
		int y=sc.nextInt();
		System.out.println("Enter the elements of Second Array: ");
		for(int i=0;i<x;i++){
			arr2[i]=sc.nextInt();
		}
	
	
  if(x>=2 && y>=2)
  {
	  System.out.println(arr1[0] == arr2[0] || arr1[x-1] == arr2[y-1]);
  }
  else
  {
   System.out.println("Array lengths less than 2.");
  }
 }
}