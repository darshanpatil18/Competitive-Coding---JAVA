//pg.207:::
import java.util.*;
class sumofDigits{
	int num,d,s,i=0;
	double avg;
	void get() throws NumberFormatException{
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		
	}
	void sum(){
		while(num>0){
			d=num%10;
			s=s+d;
			num=num/10;
			i=i+1;
		
		}
		avg=(double)s/i;	
		System.out.println("Sum="+s);
		System.out.println("Average="+avg);

	}
	public static void main(String args[]){
		sumofDigits o=new sumofDigits();
		o.get();
		o.sum();	
	}

}