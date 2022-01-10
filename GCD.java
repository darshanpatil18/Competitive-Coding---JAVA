class GCD{

	int x=80;
	int y=15;
	int G=0;
	public void get(){
		while(x!=0 && y!=0){
			if(x>y){
				x=x-y;
			}
			else{
				y=y-x;
			}
		}
		G=x;
		System.out.println(G);
	}
	public static void main(String args[]){
		GCD G=new GCD();
		G.get();
	}
}