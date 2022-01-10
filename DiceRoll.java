import java.util.*;
public class DiceRoll{
  
   public static void main(String[] args) {
      int numberOfRolls;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number between 2 and 12: ");
      int num=sc.nextInt();
      numberOfRolls = rollFor(num);
      System.out.println("It took " + numberOfRolls + " rolls to sum up to the number given.");
   }    
   public static int rollFor( int N ) {
       if ( N < 2 || N > 12 )
          throw new IllegalArgumentException("Impossible total for a pair of dice.");
       int die1, die2;
       int roll;
       int rollCt;
       rollCt = 0;
       do {
          die1 = (int)(Math.random()*6) + 1;
          die2 = (int)(Math.random()*6) + 1;
          roll = die1 + die2;
          rollCt++;
       } while ( roll != N );
       return rollCt;
   }

}