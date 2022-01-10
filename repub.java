class repub{
	String in="JANUARY 26 IS CELEBRATED AS REPUBLIC DAY";
	void get(){
		String Aug=in.replace("JANUARY","AUGUST");
		String tw=in.replace("26","15");
		String ind=in.replace("REPUBLIC","INDEPENDENCE");
		System.out.println(Aug+""+tw+" IS CELEBRATED AS "+ind+" DAY");
	}
	public static void main(String args[]){
		repub r=new repub();
		r.get();
	}
}