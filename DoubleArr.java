class DoubleArr{
	int a[][]={{10,12},{13,14},{15,16},{1,18}};
	int sum;
	public void find(){
		
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length;j++){
				sum=sum+a[i][j];
			}
		}
		System.out.println(sum);
	}
	public static void main(String args[]){
		DoubleArr v=new DoubleArr();
		v.find();
	}
}