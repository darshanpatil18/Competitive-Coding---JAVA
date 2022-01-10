import java.util.*;
class Book 
{
    int id;
    String author,publisher;
    Book(int id, String author, String publisher) 
    {
        this.id = id;
        this.author = author;
        this.publisher = publisher;
    }
    public String toString()
    { 
        return "ID:"+ this.id + "\tAuthor:"+ this.author + "\tPublisher:"+ this.publisher;  
    } 
}
class BookDetailsCATtwo
{
    public static void main(String args[]) 
    {
        Scanner in=new Scanner(System.in);
        int n,i;
        ArrayList<Book> b = new ArrayList<Book>();
        System.out.print("Enter the number of books: ");
        n=in.nextInt();
        for (i=0;i<n;i++)
        {
            System.out.print("\nEnter Book ID for book "+(i+1)+" : ");
            int bid=in.nextInt();
            in.nextLine();
            System.out.print("Enter Author for book "+(i+1)+" : ");
            String auth=in.nextLine();
            System.out.print("Enter Publisher for book "+(i+1)+" : ");
            String pub=in.nextLine();
            Book b1 = new Book(bid,auth,pub);
            b.add(b1);
        }
        System.out.println("\nDisplaying Details of all the Books: ");
        Iterator<Book> itr = b.iterator();
        while (itr.hasNext()) 
        {
            System.out.println(itr.next());
        }
    }
}