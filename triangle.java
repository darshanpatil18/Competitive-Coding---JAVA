class triangle{
	
	triangle(){
		int c=1;
		for(int i=1;i<6;i++){
			for(int j=1;j<=i;j++){
				System.out.print(c);
			}	
				c++;
				System.out.println();				
		}	
	}
	public static void main(String args[]){
		triangle t=new triangle();
		
	}
}