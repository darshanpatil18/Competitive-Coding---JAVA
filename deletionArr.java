import java.util.*;
class deletionArr{

	int a[]=new int[5];
	int n,number,j;
	void del(){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter 5 Array Elements");
		for(int i=0;i<a.length;i++)
			a[i]=sc.nextInt();
	
		Arrays.sort(a);
		System.out.println("Sorted array is::");
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);

		
		System.out.println();
		System.out.println("Enter Location of Number to be Deleted...");			
		int loc=sc.nextInt();
		
		loc=loc-1;
		n=4;
		
		
		if(loc<n){
			number=a[loc];
			j=loc;
			while(j<n){
				a[j]=a[j+1];
				j=j+1;
			

			}
			n=n-1;
			System.out.println();
			System.out.println("ARRAY ELEMENT DELETED IS::"+number);
			System.out.println("Array Elements after deletion Are::");
			
			for(int i=0;i<n+1;i++)
				System.out.println(a[i]);
		}	

	}
	public static void main(String args[]){
		deletionArr d=new deletionArr();
		d.del();

	}
}