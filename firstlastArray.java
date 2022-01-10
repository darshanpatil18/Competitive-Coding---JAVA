import java.util.*; 
 public class firstlastArray {
 public static void main(String[] args)
 {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements for First Array: ");
		int x=sc.nextInt();
		int arr1[] = new int[x];
		System.out.println("Enter the elements of First Array: ");
		for(int i=0;i<x;i++){
			arr1[i]=sc.nextInt();
		}
		System.out.println("Enter the number of elements for Second Array: ");
		int y=sc.nextInt();
		int arr2[] = new int[x];
		System.out.println("Enter the elements of Second Array: ");
		for(int i=0;i<x;i++){
			arr2[i]=sc.nextInt();
		} 
    	int[] array_new = {arr1[0], arr2[2]};	
	System.out.println("New Array: " + Arrays.toString(array_new)); 	 
 }
}