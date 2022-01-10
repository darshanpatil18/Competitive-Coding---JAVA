import java.util.*;
class st{
	int a[]={15,10,4,5,4,2,3};	
	void find(){
		Arrays.sort(a);
		for(int i=0;i<a.length;i++)
		System.out.println(a[i]);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter");
		String s=sc.next();

	}
	public static void main(String args[]){
		st t=new st();
		t.find();
	}
} 