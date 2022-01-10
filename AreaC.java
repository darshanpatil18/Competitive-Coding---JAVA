class AreaC{
	void find(){
		double rad=15.2;
		double area=3.14*rad*rad;
		double arRd=Math.round(area*100)/100;
		System.out.println(arRd);
	}

	public static void main(String args[]){
		AreaC a=new AreaC();
		a.find();
	}
}