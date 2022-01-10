//pg.173
class taximeter{
	int taxino;
	String name;
	int km,bill;
	
	taximeter(){
		taxino=0;
		name="";
		km=0;

	}
	void input(int n,String nm,int k){
		taxino=n;
		name=nm;
		km=k;
		

	}
	void calculate(){
		if(km<1){
			bill=km*25;
			System.out.println("Bill="+bill);
		}
		else if(km>=1 && km<=6){
			bill=km*10;
			System.out.println("Bill="+bill);

		}
		else if(km>=6 && km<=12){
			bill=km*15;
			System.out.println("Bill="+bill);
		}
		else if(km>=12 && km<=18){
			bill=km*20;
			System.out.println("Bill="+bill);
		}
		else{
			bill=km*25;
			System.out.println("Bill="+bill);

		}

	}
	void display(){
		System.out.println("Taxino"+"\tName"+"\tKilometers travelled"+"\tBill amount");
		System.out.println(+taxino+"\t"+name+"\t\t\t"+km+"\t\t\t"+bill);
	}
	public static void main(String args[]){
		taximeter tm=new taximeter();
		tm.input(1365,"Darshan",15);
		tm.calculate();
		tm.display();
	}

} 