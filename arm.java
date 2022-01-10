//pg.186
class arm{
	int i,k,s,d;
	int n=500;
	
	arm(){	
		//System.out.println("Range="+n);
		for(i=1;i<=n;i++){
			s=0;
			k=i;
			while(k!=0){
				d=k%10;
				s=s + d*d*d;
				k=k / 10;

			}
			if(s==i){
				System.out.println(+i);
			}
		}
	}
	public static void main(String args[]){
		arm ob=new arm();

	}
}