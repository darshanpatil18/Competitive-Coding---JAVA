import java.util.*;
class geometricSeries{
	double sum;
	int n=0;
	void geo(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first term");
		int a=sc.nextInt();
		System.out.println("Enter common ratio");
		int r=sc.nextInt();

		for(int i=1;i<=3;i++){
			sum=sum+(a*(Math.pow(r,n)));
			n++;
			
		}
		System.out.println(sum);

	}
	public static void main(String args[]){
		geometricSeries g= new geometricSeries();
		g.geo();
	}
}