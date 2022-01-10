import java.util.*; 
 public class arrayfourorseven {
 public static void main(String[] args)
 {
	Scanner sc=new Scanner(System.in);
		int arr[] = new int[2];
		System.out.println("Enter the elements of the Array: ");
		for(int i=0;i<2;i++){
			arr[i]=sc.nextInt();
		} 
	if(arr[0] == 4 || arr[0] == 7)
		System.out.println("True");
	else
    	System.out.println(arr[1] == 4 || arr[1] == 7);
	 
 }
}