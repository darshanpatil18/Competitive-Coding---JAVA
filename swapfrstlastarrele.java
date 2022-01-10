import java.util.*; 
 public class swapfrstlastarrele {
 public static void main(String[] args)
 {
	    	Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of an array: ");
		int x=sc.nextInt();
		int arr[] = new int[x];
		System.out.println("Enter the elements of the Array: ");
			for(int i=0;i<x;i++){
				arr[i]=sc.nextInt();
			} 
	int y = arr[0];
	arr[0] = arr[x-1];
	arr[x-1] = y;
	System.out.println("New array after swaping the first and last elements: "+Arrays.toString(arr));  
 }
}
