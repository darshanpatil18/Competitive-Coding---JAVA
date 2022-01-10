import java.util.*; 
 public class Arrayreverse {
 public static void main(String[] args)
 {
   		Scanner sc=new Scanner(System.in);
		int arr[] = new int[3];
		System.out.println("Enter the elements of the Array: ");
			for(int i=0;i<3;i++){
				arr[i]=sc.nextInt();
			} 
	int[] new_array = {arr[1], arr[2], arr[0]};
	System.out.println("Rotated Array: " + Arrays.toString(new_array)); 	 
 }
}