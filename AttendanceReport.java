class AttendanceReport{

	public static void main(String args[]){

		int MidTermDays=22;
		int TermEndDays=10;
		int attendanceCount=0;
		float attendancePercentage=0.00f;
		int a[][]=new int[2][];
		a[0]=new int[MidTermDays];
		a[1]=new int[TermEndDays];
		fillArray(a);
		for(int[] terms:a){
			for(int day : terms){
				if(day==1)
					attendanceCount++;	
			}
		
		}
		attendancePercentage=attendanceCount*100f/32;
		System.out.printf("Attendance Percentage=%.2f",attendancePercentage);
		System.out.printf("%.2s\n","%");
	
	}
	public static int randomAttendance(){

		return(int)(Math.random()*2);
	}
	public static void fillArray(int[][] a){
		System.out.println("Attendance Array: ");
		for(int[] terms:a){
			for(int day:terms){
				System.out.print(" " + day);

			}
			System.out.println(" ");

		}


	}


}