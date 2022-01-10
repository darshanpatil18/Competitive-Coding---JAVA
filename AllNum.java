import java.io.*;
class	AllNum{
	String input;
	int v,od;
	String oe;
	String pm;
	int pr, pri, i;
	int z,l;
	int x = 0;
	int y = 1;
	String fib;
	int fibo;
	String ar;
	int am,po,s,d,k;
	String au;
	int atm, dp = 10;
	int vat,dragon,number;
	int rat = 0;
	String kill;
	
	public void lines(){

		for(int i = 1; i<81; i++){
			System.out.print("~");
		}
			}
	public void menu(){
		lines();
		System.out.println("\n\t\t\tWelcome to the World of Numbers");
		System.out.println("");
		lines();
		System.out.println("\n\t\t\tPress 1 for Odd Even Program");
		System.out.println("\n\t\t\tPress 2 for Prime Number Program");
		System.out.println("\n\t\t\tPress 3 for Fibonacci Number Program");
		System.out.println("\n\t\t\tPress 4 for Armstrong Number Program");
		System.out.println("\n\t\t\tPress 5 for Automorphic Number Program");
		System.out.println("\n\t\t\tPress 6 for Palindrome Program");
		System.out.println("\n\t\t\tPress 7 To Exit");
		System.out.println("");
		lines();
		System.out.println("Enter Your Choice");
		System.out.println("");
		ayush();
		lines();
		priya();
	}
	
	public void ayush(){
		try{
			InputStreamReader isr= new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			input = br.readLine();
			v = Integer.parseInt(input);
		}
		catch(IOException io){
			System.out.println("Input Error");
		}
		
	}
	
	public void priya(){
		switch(v){
		case 1:
			System.out.println("");
			lines();
			System.out.println("\n\t\t\tOdd or Even Program");
			System.out.println("");
			System.out.print("Enter Value To be Checked ");
			System.out.println("");
			oddorEven();
			lines();
			System.out.println("\n\t\t\tThanks for using Odd Or Even Program");
			System.out.println("");
			break;
		case 2:
			lines();
			System.out.println("");
			
			System.out.println("\n\t\t\tPrime Number Program");
			System.out.println("");
			prime();
			System.out.println("");
			System.out.println("\n\t\t\tThanks For Using Prime Number Program");
			System.out.println("");
			lines();
			break;
		case 3:
			lines();
			System.out.println("\n\t\t\tFibonacci Program");
			System.out.println("");
			lines();
			fibonacci();
			lines();
			System.out.println("\n\t\t\tThanks For Using Fibonacci Program");
			System.out.println("");
			lines();
			
			break;
		case 4:
			lines();
			System.out.println("\n\t\t\tArmstrong Number Program");
			System.out.println("");
			lines();
			armstrong();
			lines();
			System.out.println("\n\t\t\tThanks For Using Armstrong Number Program");
			System.out.println("");
			lines();
			break;
		case 5:
			lines();
			System.out.println("\n\t\t\tAutomorphic Number Program");
			System.out.println("");
			lines();
			automorphic();
			lines();
			System.out.println("\n\t\t\tThanks For Using Automorphic Number Program");
			System.out.println("");
			lines();
			break;
		case 6:	
			System.out.println("");
			System.out.println("\n\t\t\tPalindrome Number Program");
			System.out.println("");
			lines();
			palindrome();
			lines();
			System.out.println("\n\t\t\tThanks For Using Palindrome Number Program");
			System.out.println("");
			lines();
			break;
			
		case 7:
			System.out.println("\n\t\t\tThanks For Using All Number Program");
			System.out.println("");
			lines();
			System.exit(0);
			break;
		default:
			System.out.println("Wrong input ! Enter Again");
			break;
		}
		menu();
		
	}
	public void oddorEven(){
		System.out.println("");
		try{
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			String oe = br.readLine();
			od = Integer.parseInt(oe);
		}
		catch(IOException io){
			System.out.println("Input Error");
		}
		System.out.println("");
	
		if(od%2==0){
			
			System.out.println("Entered Number " +od + " is Even");
		}
		else{
			System.out.println("Entered Number " +od +" is Odd");
		}
		System.out.println("");
		lines();
	}
	public void prime(){
		System.out.println("Enter Value To Be Checked");
		System.out.println("");
		try{
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			pm = br.readLine();
			pr = Integer.parseInt(pm);
		}
		catch(IOException io){
			System.out.println("Input Error.....");
		}
		System.out.println("");
			if(pr ==1){
				System.out.println("Entered number 1 is neither prime nor composite");
			}
			else{
			for( i = 2; i<pr; i++){
				if(pr%i==0){
					pri = 1;
				}
			}
			if(pri == 1){
				System.out.println("Entered Number " +pr+ " Is Not Prime");
			}
			else{
				System.out.println("Entered Number " +pr+" Is Prime");
			}
		
			}
		System.out.println("");
		lines();
		}
		
	public void fibonacci(){
		System.out.println("");
		System.out.print("Enter Range = ");
		System.out.println("");
		System.out.println("");
		try{
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			fib = br.readLine();
			fibo = Integer.parseInt(fib);
		}
		catch(IOException io){
			System.out.println("Input Error....");
		}
		System.out.println("");
		System.out.println("Fibonacci Series Till " + fibo + " = ");
		System.out.println("");
		System.out.println(x);
		System.out.println(y);
		for(l = 1; l<=fibo-1; l++){
			z = x + y;
			System.out.println(z);
			x = y;
			y = z;
		}
		
	}
	
	public void armstrong(){
		System.out.print("Enter Range = ");
		try{
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			ar = br.readLine();
			am = Integer.parseInt(ar);
		}
		catch(IOException io){
			System.out.println("Input Error......");
		}	
		System.out.println("");
		System.out.println("Armstrong Numbers Upto Range Of " + am +  " Are :");
		System.out.println("");
		for(po = 1; po <= am; po++){
		s = 0;
		k = po;
		while(k!=0){
			d = k%10;
			s = s + d*d*d;
			k = k / 10;
		}
		if(s == po){
			System.out.println(+po);
		}
		}
	}
	
	public void automorphic(){
		System.out.println("");
		System.out.println("Enter number to be checked ");
		System.out.println("");
		try{
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			au = br.readLine();
			atm = Integer.parseInt(au);
		}
		catch(IOException io){
			System.out.println("Input Error.....");
		}
		System.out.println("");
		if(dp>=atm){
			if((atm*atm)%dp ==atm){
			System.out.println("It Is A Automorphic Number");
			}
			else{
				System.out.println("Not A Automorphic Number");
			}
		}
		else if(dp<=atm){
			dp = dp * 10;
			if((atm*atm)%dp == atm){
				System.out.println("Automorphic Number");
			}
			else{
				System.out.println("It Is Not A Automorphic Number");
			}
		}
		System.out.println("");
	}
	
	public void palindrome(){
		System.out.println("");
		System.out.println("Enter number to be checked");
		System.out.println("");
		try{
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			kill = br.readLine();
			number = Integer.parseInt(kill);
		}
		catch(IOException io){
			System.out.println("Input Error...");
		}
		System.out.println("");
		vat =number;
		do{
			dragon = number % 10;
			rat = rat * 10 + dragon;
			number  = number / 10;
		}while(number!=0);
		if(rat == vat){
			System.out.println("Number is palindrome");
		}
		else{
			System.out.println("number is not a palindrome");
		}
		System.out.println("");
	}


	public static void main(String args[]){
		AllNum ob = new AllNum();
		ob.menu();
	}
}


