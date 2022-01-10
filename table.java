import java.util.*;
public class table{
	
	public void multable(){
		for(int i=1;i<=15;i++){
			for(int j=1;j<=10;j++){
				System.out.println(i+"*"+j+"="+(i*j));

			}
		
		}
	

	}
	public static void main(String args[]){
		table ob=new table();
		ob.multable();
	
	}

}