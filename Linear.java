import java.util.*;
class Linear{
	int num[]=new int[11];
	int number;	
	public void get(){
		Scanner sc=new Scanner(System.in);	
		System.out.println("Enter 10 array elements");
		for(int i=0;i<num.length;i++){
			num[i]=sc.nextInt();
		}
		System.out.println("Enter number to be searched");
		number=sc.nextInt();
		
		for(int i=0;i<num.length;i++){
			if(num[i]==number){
				System.out.println(number+" is present at index "+i);
			}
		}		
		
		
		
	
	}
	public static void main(String args[]){	
		Linear ob=new Linear();
		ob.get();
	
	}	

}