class Large{
	int a=5;
	float b=8.0f;
		public void findBig(){
			if(a>b){
				System.out.println("A is big");
			}
		else{
			System.out.println("A is small");
			}
		}
	public static void main(String args[]){
		Large ob=new Large();
		ob.findBig();
		}
}