//pg.182
/*class cuboid{
	double length,breadth,height,sfareacub;
	cuboid(){

		length=0.0;
		breadth=0.0;
		height=0.0;


	}
	cuboid(double x,double y,double z){
		length=x;
		breadth=y;
		height=z;
	

	}
	void compute(){
		sfareacub=2*((length * breadth)+(breadth * height)+(height * length));


	}
	void display(){
		System.out.println("Surface area of cuboid:::"+sfareacub);
	}
	public static void main(String args[]){
		cuboid cd=new cuboid();
		cuboid dc=new cuboid(4.40,3.25,2.25);
		dc.compute();
		dc.display();
	} 


}*/

			//OR USing this();

class cuboid{
	double length,breadth,height,sfareacub;
	cuboid(){

		length=0.0;
		breadth=0.0;
		height=0.0;


	}
	cuboid(double x,double y,double z){
		this();
		length=x;
		breadth=y;
		height=z;
	

	}
	void compute(){
		sfareacub=2*((length * breadth)+(breadth * height)+(height * length));


	}
	void display(){
		System.out.println("Surface area of cuboid:::"+sfareacub);
	}
	public static void main(String args[]){
		cuboid dc=new cuboid(4.40,3.25,2.25);
		dc.compute();
		dc.display();
	} 


}
