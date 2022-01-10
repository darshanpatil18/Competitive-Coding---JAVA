import java.util.*;

public class FlipkartDiscount
{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total cost: ");
        double cost = sc.nextDouble();
        double amt;
        
        if (cost < 1000) {
            amt = cost - (cost * 15 / 100.0);
        }
        else if (cost < 3000 && cost >1000) {
            amt = cost - (cost * 17 / 100.0);
        }
        else if (cost < 5000 && cost >3000) {
            amt = cost - (cost * 25 / 100.0);
        }
        else {
            amt = cost - (cost * 30 / 100.0);
        }
        
        System.out.println("Amount to be paid: " + amt);
        
    }
}