import java.util.*;

public class Permutation_combination
{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Word: ");
        String str = in.nextLine();
        int len = str.length();

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                for (int k = 0; k < len; k++) {
                    for (int l = 0; l < len; l++) {
                        if (i != j && i != k && i != l 
                            && j != k && j != l 
                            && k != l) {
                            System.out.print(str.charAt(i));
                            System.out.print(str.charAt(j));
                            System.out.print(str.charAt(k));
                            System.out.println(str.charAt(l));
                        }
                    }
                }
            }
        }
    }
}