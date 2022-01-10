class libFunc{
	String val="hI i Am DaRsHaN";
	
	public void print(){
		for(int i=0;i<val.length();i++){
			char c=val.charAt(i);
			if(Character.isLowerCase(c)){
				char z=Character.toUpperCase(c);
			}
		//System.out.print(val);
		}
		System.out.print(val);
	}
	public static void main(String args[]){
		libFunc l=new libFunc();
		l.print();
	}
}