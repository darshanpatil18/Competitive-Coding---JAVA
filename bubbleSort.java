import java.util.*;
class bubbleSort{
	
	int a[]=new int[5];
	int temp;	
	void sort(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 5 Array Elements");
		for(int i=0;i<5;i++){
			a[i]=sc.nextInt();

		}
		System.out.println();
		System.out.println("Array Elements are:::");
		for(int i=0;i<5;i++){
			System.out.println(a[i]);

		}
		
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length-1;j++){
				if(a[j]>a[j+1]){
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		
		System.out.println();
		System.out.println("Sorted array elements are::");
			for(int i=0;i<a.length;i++)
				System.out.println(a[i]);		

	}

	public static void main(String args[]){
		bubbleSort bubbleSort=new bubbleSort();
		bubbleSort.sort();

	}
}