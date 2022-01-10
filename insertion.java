import java.util.*;
class insertion{
	
	int a[]=new int[100];
	int nOfVal,num,pos,j;
	Scanner sc=new Scanner(System.in);
	
	void insert(){
		System.out.println("Enter Number of elements::");
		nOfVal=sc.nextInt();
		
		for(int i=0;i<nOfVal;i++){
			System.out.println("Enter Elements");
			a[i]=sc.nextInt();
		}
	
		System.out.println();
		System.out.println("Enter Number to Insert::");
		num=sc.nextInt();
		System.out.println();
		System.out.println("Enter Position to be inserted::");
		pos=sc.nextInt();
		
		if(pos<=nOfVal){
			j=nOfVal;
			while(j>=pos){
				a[j]=a[j-1];
				j=j-1;

			}
			
			a[j]=num;
			nOfVal=nOfVal+1;
		
			System.out.println("New Output is");
			
			for(int i=0;i<nOfVal;i++){
				System.out.println(a[i]);
			}

		}
	
	}
	public static void main(String args[]){
		insertion in=new insertion();		
		in.insert();
	}
}