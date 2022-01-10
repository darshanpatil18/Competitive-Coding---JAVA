class reverseor{
	int num=12563;
	reverseor(){
		System.out.println("Number is::"+num);
		while(num!=0){
		int rev=num%10;
		System.out.print(rev);
		num=num/10;
		}
	}
	public static void main(String args[]){
		reverseor ob=new reverseor();
	}
	}