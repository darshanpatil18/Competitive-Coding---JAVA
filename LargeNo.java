class LargeNo{
	int a=2;
	int b=6;
	int c=3;
	int big=a;
		public void findLarge(){
			if(b>a){
     			int big=b;
			}
		else if(c>big)
		{
			int big=c;		
		}
		System.out.println("big number="+big);
		}
	public static void main(String args[]){
		LargeNo ob=new LargeNo();
		ob.findLarge();
		}
	}
				