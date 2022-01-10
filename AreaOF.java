class AreaOF{
	int r=-3;
	float pi=3.14f;
		public void findArea(){
			if(r>0){
			float Area=pi*r*r;
			System.out.println("Area="+Area);
		}
	else{
	 System.out.println("Enter radius correctly");
		}	
	}
		public static void main(String args[]){
			AreaOF ob=new AreaOF();
			ob.findArea();
}	
}
