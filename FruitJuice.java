//pg.172
import java.io.*;
class FruitJuice{
	int product_code;
	String flavour;
	String pac_type;
	int pack_size;
	int product_price;

	FruitJuice(){
		product_code=0;
		flavour="";
		pac_type="";
		pack_size=0;
		product_price=0;
		
	}
	public void input(){
		try{
			InputStreamReader irs=new InputStreamReader(System.in);
			BufferedReader br=new BufferedReader(irs);
			System.out.println("Enter Product code");
			String pc=br.readLine();
			product_code=Integer.parseInt(pc);
				
			System.out.println("Enter Flavour");
			flavour=br.readLine();
		
			System.out.println("Enter pack type");
			pac_type=br.readLine();
		
			System.out.println("Enter Pack size");
			String ps=br.readLine();
			pack_size=Integer.parseInt(ps);

			System.out.println("Enter product price");
			String pp=br.readLine();
			product_price=Integer.parseInt(pp);
		}
		catch(IOException io){}

	}
	void discount(){
		product_price=product_price-10;
		System.out.println("Discounted Price="+product_price);

	}
	void display(){
		System.out.println("Product code="+product_code);
System.out.println("Flavour="+flavour);
System.out.println("Pack Type="+pac_type);
System.out.println("Pack Size="+pack_size);
System.out.println("Product Price="+product_price);

	}
	public static void main(String args[]){
		FruitJuice ob=new FruitJuice();
		ob.input();
		ob.discount();
		ob.display();
	}


}