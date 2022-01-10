import java.util.*; 
 public class grtfrsclsarr{
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
	int max_val = arr[0];
	if(max_val <= arr[x-1])
		max_val = arr[x-1];
	if(max_val <= arr[x/2])
		max_val = arr[x/2];
	System.out.println("Largest element between first, last, and middle values: " + max_val);  
 }
}
