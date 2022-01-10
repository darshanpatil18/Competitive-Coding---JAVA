import java.util.*;

public class Greetings{
    
    public static void main(String[] args) {
    
        Scanner sc = new Scanner( System.in );
    
        String usersName;
        String upperCaseName;
        
        System.out.print("Please enter your name: ");
        usersName = sc.nextLine();        
        upperCaseName = usersName.toUpperCase();
        
        System.out.println("Hallo, " + upperCaseName + ", Freut mich, dich kennenzulernen!");
    
    }
 
}