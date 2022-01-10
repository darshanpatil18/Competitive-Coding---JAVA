 import java.util.*;
class binarysrch{

	int a[]=new int[5];
	int numOfVal,Number,last,first=0,middle,pos=-1;
	
	Scanner sc=new Scanner(System.in);
	void get(){
		
			System.out.println("Enter 5 array elements");
		
		for(int i=0;i<a.length;i++){
			
			a[i]=sc.nextInt();
				
		}
	
		
		System.out.println("Enter Number To be Searched::");
		Number=sc.nextInt();
		Arrays.sort(a);
		System.out.println();
		System.out.println("Sorted array");
		for(int i=0;i<5;i++)
			System.out.println(a[i]);

		//Last should be index value
		last=4;
		
		while(first<=last){
			middle=(first+last)/2;
			
			if(a[middle]==Number){
				pos=middle;
				break;

			}
			else if(Number>a[middle]){
				first=middle+1;	
			}
			else if(Number<a[middle]){
				last=middle-1;
				
			}
		}
		
		if(pos==-1)
			System.out.println("Number doesnot exist");
		else
		
			System.out.println("Number exists at Index value::"+pos);

		}
	public static void main(String args[]){
		binarysrch bs=new binarysrch();
		bs.get();
		

	}
}	