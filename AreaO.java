class AreaO{
	float r=2.02f;
	float pi=3.14f;
		public void findArea(){
			if(r>0){
			float Area=pi*r*r;
			System.out.println("Area="+ Area);
		
} }
	public static void main(String args[]){
		AreaO ob=new AreaO();
		ob.findArea();
	}
}