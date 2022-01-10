class Stg{
	String str="VOKO HAS SMILED";
	int num;
	char ch;
	int nmun;
	public void find(){
		for(int i=0;i<str.length();i++){
			ch=str.charAt(i);
			num=(int)ch;
			nmun=num+10;
			System.out.print((char)nmun);
		}
	}
	public static void main(String args[]){
		Stg s=new Stg();
		s.find();
	}
}