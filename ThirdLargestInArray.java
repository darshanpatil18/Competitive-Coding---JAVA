import java.util.*;
class ThirdLargestInArray{  
	public static int getThirdLargest(int[] a, int total){  
	int temp;  
	for (int i = 0; i < total; i++)   
        {  
            for (int j = i + 1; j < total; j++)   
            {  
                if (a[i] > a[j])   
                {  
                    temp = a[i]; 
                    a[i] = a[j];  
                    a[j] = temp;  
                }  
            }  
        }  
       return a[total-3];  
}  
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the total number of elements: ");  
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the elements of an array: ");
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}  
		System.out.println("Third Largest: "+getThirdLargest(a,n));   
	}
}