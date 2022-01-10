class floydTri{
	int c=1;
	floydTri(){	
		for(int i=1;i<6;i++){
			for(int j=1;j<=i;j++){
				System.out.print(c+"\t");
				c++;
			}
			System.out.println("");
		}

		
	}
	public static void main(String args[]){
		floydTri ft=new floydTri();
	

	}



	

}