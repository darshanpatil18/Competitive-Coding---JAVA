import java.util.*;
class BinToDec {
    
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Binary Number: ");
    long n = sc.nextLong();
    int decimal = convertBinaryToDecimal(n);
    System.out.println("Binary to Decimal");
    System.out.println(n + " = " + decimal);
  }

  public static int convertBinaryToDecimal(long n) {
    int decimalNumber = 0, i = 0;
    long remainder;
    
    while (n != 0) {
      remainder = n % 10;
      n /= 10;
      decimalNumber += remainder * Math.pow(2, i);
      ++i;
    }
    
    return decimalNumber;
  }
}