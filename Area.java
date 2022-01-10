class Area{
	int r=2;
	float pi=3.14f;
		public void findArea(){
			float Area=pi*r*r;
			System.out.println("Area Of circle="+Area);
	}
		public static void main(String args[]){
			Area oba=new Area();
			oba.findArea();
	}
}
