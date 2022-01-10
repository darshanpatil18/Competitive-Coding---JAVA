import java.util.*;
class Stng{
	int i,vowels=0;
	public void find(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String..");
		String value=sc.next();
		//int leng=value.length();
			
		for(i=0;i<value.length();i++){
			char ch=value.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
				vowels++;
				
			}
		}
		System.out.println("Number of characters=="+i);
		System.out.println("Number of vowels=="+vowels);
		
	}
	public static void main(String args[]){
		Stng s=new Stng();
		s.find();
	}
}