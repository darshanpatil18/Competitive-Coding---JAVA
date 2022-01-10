class co{		
	int comm=500;
	int sales=210;
		public void cal(){
		System.out.println("value of sale="+sales);

			if(sales>10000){
				double comm=sales*0.25;
			System.out.println("commission="+comm);
			}
			else
			if(sales>=8000){
				double comm=sales*0.12;
			System.out.println("commission="+comm);
			}
			else
			if(sales>=5000){
				 double comm=sales*0.50;
			System.out.println("commission="+comm);
			}
	}
	public static void main(String args[]){
		co ob=new co();
		ob.cal();
		}
	}