import java.util.*; 

class Student{ 

    String regNo; 

    String name; 

    String programme; 

    String school; 

    String proctor; 

    Scanner sc = new Scanner (System.in); 

    public void setData(String r, String n, String p, String s, String pr) 

    { 

        regNo = r; 

        name = n; 

        programme = p; 

        school = s; 

        proctor = pr; 

    } 

} 

class Exam extends Student 

{ 

    float[] marks = new float[6]; 

    String marksInput() 

    { 

        for(int i=0; i<6;i++) 

        { 

            System.out.println("Enter marks for subject" + (i+1)); 

            marks[i]=sc.nextFloat(); 

        } 

        return(Arrays.toString(marks)); 

    }    

} 

class Result extends Exam 

{ 

    float totalMarks; 

    float total() { 

        for(int i=0; i<6;i++) 

        { 

            totalMarks+=marks[i]; 

        } 

        return totalMarks; 

    } 

} 

 
 

public class StudentExamResult { 

 
 

    public static void main (String[] args) { 

        Scanner sc = new Scanner (System.in); 

        System.out.println("Enter n"); 

        int n = sc.nextInt(); 

 
 

        Result r = new Result(); 

         

        for(int i=0; i<n ; i++) 

        { 

            System.out.println("Enter details of student " + (i+1)); 

            System.out.println("Registration no."); 

            String regNo = sc.next(); 

            System.out.println("Name"); 

            sc.nextLine(); 

            String name = sc.nextLine(); 

            System.out.println("programme"); 

            String programme =  sc.next(); 

            System.out.println("school"); 

            sc.nextLine(); 

            String school =  sc.nextLine(); 

            System.out.println("proctor"); 

            String proctor = sc.nextLine(); 

            r.setData(regNo, name, programme, school, proctor);      

            System.out.println("Student's registration no. is " + r.regNo + ", name is "+ r.name +  ", programme is " + r.programme + ", school name is " + r.school + ", proctor name is " + r.proctor + ", "+r.marksInput()+" ,"+ r.total());                 

        } 

    } 

}