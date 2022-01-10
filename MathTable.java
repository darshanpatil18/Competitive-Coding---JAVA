class MathTable{
	int k;
	public void print(){
		for(int i=1;i<=3;i++){
			for(int j=1;j<=3;j++){
				k=i*j;
				System.out.println(+i+"*"+j+"="+k);
			}
		}

	}
	public static void main(String args[]){
		MathTable m=new MathTable();
		m.print();

	}
}