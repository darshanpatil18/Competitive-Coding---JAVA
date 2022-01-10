class rev{
	int a=124,rem,rever,re;
	
	public void revrse(){

		while(a>0){
			rem=a%10;
			rever=rever*10+rem;
			a=a/10;
		}
		System.out.print(rever);
	}
	public void print(){
		while(rever>0){
			re=rever%10;
			switch(re){
				case 0:
					System.out.print("Zero-");
					break;
				case 1:
					System.out.print("One-");
					break;
				case 2:
					System.out.print("Two-");
					break;
				case 3:
					System.out.print("Three-");
					break;
				case 4:
					System.out.print("Four-");
					break;
				case 5:
					System.out.print("Five-");
					break;
				case 6:
					System.out.print("Six-");
					break;
				case 7:
					System.out.print("Seven-");
					break;
				case 8:
					System.out.print("Eight-");
					break;
				case 9:
					System.out.print("Nine-");
					break;
				
			}
			rever=rever/10;
		
		}
	}
	public static void main(String args[]){
		rev r=new rev();
		r.revrse();
		r.print();
	}
}