class fa{
	int a;
	int n=10;
	double fact;
	fact=1;
		public void findFa(){
			for(a=1;a<=n;a++){
				fact=fact*a;
				}
			}
		public static void main(String args[]){
			fa ob=new fa();
			ob.findFa();	
		}
	}