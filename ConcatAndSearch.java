//All Concat & + operator &Searching Strings;
class ConcatAndSearch{

	String S="India is my Country";
	char a;

	ConcatAndSearch(){
		for(int i=0;i<S.length();i++){
		a=S.charAt(i);
		char uppercase=Character.toUpperCase(a);
		System.out.print(a);
		}
	}
	public static void main(String args[]){
		ConcatAndSearch c=new ConcatAndSearch();

	}


}