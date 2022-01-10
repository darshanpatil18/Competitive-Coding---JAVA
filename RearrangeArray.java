import java.util.*;
public class RearrangeArray
{
	public static void rearrange(int[] arr, int n)
	{
		int temp[] = arr.clone();
		int small = 0, large = n - 1;
		boolean flag = true;
		for (int i = 0; i < n; i++) {
			if (flag)
				arr[i] = temp[large--];
			else
				arr[i] = temp[small++];

			flag = !flag;
		}
	}
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
		System.out.println("Original Array ");
		System.out.println(Arrays.toString(arr));
		rearrange(arr, arr.length);
		System.out.println("Modified Array ");
		System.out.println(Arrays.toString(arr));
	}
}
