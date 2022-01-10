class selectionSort{
	
	int a[]={1,12,14,2,6,7,10,15,25};
	int smallest,pos,j;
	int n=a.length;
	void sort(){
		for(int i=0;i<n;i++){
			smallest=a[i];
			pos=i;
			
			for(j=i+1;j<n;j++){
				if(smallest > a[j]){
					smallest=a[j];
					pos=j;	
				}

			}
			int temp=a[i];
			a[i]=a[pos];
			a[pos]=temp;
		


		}
		System.out.println("Sorted array is::");
		for(int i=0;i<n;i++)
			System.out.println(a[i]);

	}
	public static void main(String args[]){
		selectionSort SS=new selectionSort();
		SS.sort();
		}
}