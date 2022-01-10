class fibo{
	int f=10,s=1,n=0;
		public void cal(){
			System.out.println(f+""+s);
			for(int i=1;i<=10;i++){
				n=f+s;
				System.out.println(n);
				f=s;
				s=n;
		}

	}
	public static void main(String args[]){
			fibo ob=new fibo();
			ob.cal();
		}
	}