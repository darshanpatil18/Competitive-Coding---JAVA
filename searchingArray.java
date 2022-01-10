import java.util.*;
class searchingArray{
	int a[]=new int[100];
	int pos;
	void search(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Number of values to be entered::");
		int numOfVal=sc.nextInt();
		System.out.println();
		for(int in=0;in<numOfVal;in++){
			System.out.println("Enter Values");
			a[in]=sc.nextInt();
		}
		
		System.out.println();
		System.out.println("Enter Number to be Searched::");	
		int searc=sc.nextInt();
		
		for(int i=0;i<numOfVal;i++){
			if(searc==a[i]){
				pos=i+1;
				System.out.println("Index Value of "+searc+" is "+i);
				System.out.println("Position of "+searc+" is "+pos);
			}


		}

	}

	public static void main(String args[]){
		searchingArray ar=new searchingArray();
		ar.search();
		

	}
}