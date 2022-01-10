public class FindAverage {

   public static void main(String[] args) {

       String name;
       int exam1, exam2, exam3, exam4;
       double average;

       TextIO.readFile("examination.txt");

       name = TextIO.getln();
       exam1 = TextIO.getlnInt();
       exam2 = TextIO.getlnInt();
       exam3 = TextIO.getlnInt();
       exam4 = TextIO.getlnInt();
    
       average = ( exam1 + exam2 + exam3 + exam4) / 4.0;

       System.out.printf("The average grade for %s was %1.1f", name, average);
       System.out.println();

   }

}