class sepWord{
	String s1="THE BOY WAS FOOLISH";
	public void get(){
		String s[]=s1.split(" ");
		for(int i=0;i<s.length;i++){
			System.out.println(s[i]);
		}

	}
	public static void main(String args[]){
		sepWord s=new sepWord();
		s.get();
	}
}