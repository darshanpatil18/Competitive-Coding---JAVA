import java.util.*;
class BinarySr{
	int num[]=new int[11];
	int number;
	int poss=-1,mid,last,fir;
	void get(){
		Scanner sc=new Scanner(System.in);	
		System.out.println("Enter 10 array elements");
		for(int i=0;i<num.length;i++){
			num[i]=sc.nextInt();
		}
		System.out.println("Enter number to be searched");
		number=sc.nextInt();
	}
	void find(){
		fir=0;
		last=num.length-1;
		
		while(fir<=last){
			mid=(fir+last)/2;
			if(num[mid]==number){
				poss=mid;
				break;
			}
			elseif(num[mid]>number){
				last=mid-1;
			}
			elseif(num[mid]<number){
				first=mid+1;
			}
	
		}
		if(pos==-1){
			System.out.println("Entered Numbered doesnt exist");
			}
		else{
			System.out.println("Entered Numbered exists at"+pos);
		}
		

	}
	public static void main(String args[]){
		BinarySr ob=new BinarySr();
		ob.get();
		ob.find();
	}
}