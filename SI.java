class SI {
	int p=5000;
	int r=2;
	int t=3;
		public void findSI(){
			long SI=p*r*t;
			System.out.println("Simple Interest="+SI);
		}
	public static void main(String args[]){
		SI obs=new SI();
		obs.findSI();
		}
	}