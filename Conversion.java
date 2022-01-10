class Conversion{
	int n=124;
		public void ConvertIntoWords(){
			int r=0;
			while(n>0){			
				int re=n%10;
				int r=r*10+re;
				int n=n/10;
			}
		String result="";
			while(r>0){
			re=r%10;
			r=re/10;
	switch(r){
		case1:
			result=result+"one";
			break;
		case2:
			result=result+"two";
			break;
		case3:
			result=result+"three";
			break;	
		case4:
			result=result+"four";
			break;
		case5:
			result=result+"five";
			break;
		case6:
			result=result+"six";
			break;
		case7:
			result=result+"seven";
			break;
		case8:
			result=result+"eight";
			break;

		case9:
			result=result+"nine";
			break;
		default:
		result="8888888888888";
		}
	}System.out.println(result);
	}
	
public static void main(String args[]){
		Conversion ob=new Conversion();
		ob.ConvertIntoWords();
	}
}