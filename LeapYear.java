class LeapYear{
	int y=2002;
		public void findLeapYear(){
			if(y%4==0){
				System.out.println("The year is leap year");
			}
		else{
			System.out.println("The year is not a leap year");
		}
	}
		public static void main(String args[]){
			LeapYear ob=new LeapYear();
			ob.findLeapYear();
		}
}