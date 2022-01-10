class sumSeries{
	public void Sum(){
		int s=0,f=1;
		for(int i=1;i<=20;i++){
			f=1;
			for(int j=1;j<=i;j++){
				f=f*j;
				
			}
			s=s+f;
			
		}
			System.out.println(s);

	}	
	public static void main(String args[]){
		sumSeries s=new sumSeries();
		s.Sum();
	}


}