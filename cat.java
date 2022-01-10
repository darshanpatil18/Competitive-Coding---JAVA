abstract class dog{
	
	abstract void print();
}
class cat extends dog{
	public void print(){
		System.out.print("HI kutta");
	}
	public static void main(String args[]){
		cat c=new cat();
		c.print();
	}
}