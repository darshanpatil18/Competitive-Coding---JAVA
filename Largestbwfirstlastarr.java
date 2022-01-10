import java.util.*; 
 public class Largestbwfirstlastarr {
 public static void main(String[] args)
 {
    	Scanner sc=new Scanner(System.in);
		int arr[] = new int[3];
		System.out.println("Enter the elements of the Array: ");
			for(int i=0;i<3;i++){
				arr[i]=sc.nextInt();
			} 
	int max_val = arr[0];
	if(arr[2] >= max_val)
		max_val = arr[2];
	System.out.println("Larger value between first and last element: "+max_val); 	 
 }
}
