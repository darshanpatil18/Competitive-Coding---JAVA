import java.util.*;

public class PatternI {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter highest number for the pattern (1-9) : ");
    int Rows = sc.nextInt();
    printPattern(Rows);
  }
    
   static void printPattern(int num){
    for(int i = 1; i <= num; i++){
      for(int j = 1; j <= i; j++){
        System.out.print(j);
      }            
      System.out.println();       
    }
    for(int i = num; i >= 1; i--){
      for(int j = 1; j < (i+1); j++){
        System.out.print(j);
      }
      System.out.println();
    }                               
  }
}