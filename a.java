class a{
	double a=-2.7;
	String s="prateek";
	String sub=" ";
		public void findA(){

			/*int var1=5,var2=6;
			if((var2=1)==var1)
				System.out.println(var2);
			else
				System.out.println(++var2);
			x+=(x++)+(++x)+x;
			System.out.println(x);	
			char c=s.charAt(3);
			System.out.println(c);
			sub=s.substring(2,5);
			System.out.println(sub);
			sub=s.replace('e','1');
			System.out.println(sub);
			System.out.println(Math.ceil(a));
			String v=a.toString();
			
			System.out.println(v);*/

			for(int i=0;i<5;i++){
				System.out.println(i);
				i++;
				System.out.println(i);
			}

	
		}
	public static void main(String args[]){
		a ob=new a();
		ob.findA();
	}
}