class diagArray{
	int a[][]={
	       {1,2,3,4},
	       {5,6,7,8},
	       {9,10,11,12},
	       {13,14,15,16},
	      };
	int sum,sum2,k=3;
	public void sum(){
		for(int i=0;i<=3;i++){
			for(int j=0;j<=3;j++){
				if(i==j){
					sum=sum+a[i][j];
				}
			}

		}
		for(int i=0;i<=3;i++){
			for(int j=3;j>=0;j--){
				sum2=sum2+a[i][k];
				k--;
				break;
			}
		}
		System.out.println("Sum=="+(sum+sum2));
	}
	public static void main(String args[]){
		diagArray d=new diagArray();
		d.sum();

	}
}