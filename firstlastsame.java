import java.lang.*;
import java.util.*;
 public class firstlastsame{
 public static void main(String[] args)
 {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int x=sc.nextInt();
		int arr[] = new int[x];
		System.out.println("Enter the elements of an array: ");
		for(int i=0;i<x;i++){
			arr[i]=sc.nextInt();
		}
    
	System.out.println (x >= 2 && arr[0] ==  arr[x-1]);
 }
}