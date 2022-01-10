import java.util.*;
class Swapping{
	public String Input(){
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		return a;

	}
	public void get(){
		try{
		System.out.println("Enter Value(X)");
		int fr=Integer.parseInt(Input());
		System.out.println("Enter value(Y)");
		int sc=Integer.parseInt(Input());
		
		if(fr>sc){
			fr=fr-sc;
			fr=fr+sc;
			fr=sc-fr;
		}
		if(sc>fr){
			sc=sc-fr;
			fr=fr+sc;
			sc=fr-sc;
		}
		System.out.println("Elements after Swapping(X) "+fr);
		System.out.println("Elements after Swapping(Y) "+sc);
		}
		catch(NumberFormatException nf){
			System.out.println("You are foolish");
		}
	}
	public static void main(String args[]){
		Swapping s=new Swapping();
		s.get();
	}
	}