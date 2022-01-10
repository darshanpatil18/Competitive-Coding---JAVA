import java.util.Scanner;

class ShopkeeperSales
{
    protected String title;
    protected String author;
    protected String publication;
    protected double price;
    
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter book title: ");
        title = sc.nextLine();
        System.out.print("Enter book author: ");
        author = sc.nextLine();
        System.out.print("Enter publication name: ");
        publication = sc.nextLine();
        System.out.print("Enter book price: ");
        price = sc.nextDouble();
    }
    
    public void display() {
        System.out.println("Book Title: " + title);
        System.out.println("Book Author: " + author);
        System.out.println("Publication: " + publication);
        System.out.println("Price: " + price);
    }
}

class ShopkeeperPurchase extends ShopkeeperSales
{
    private int noc;
    private double amount;
    
    public void accept() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter no. of copies purchased: ");
        noc = in.nextInt();
    }
    
    public void calculate() {
        amount = noc * price;
    }
    
    public void show() {
        display();
        System.out.println("No. of copies: " + noc);
        System.out.println("Amount: " + amount);
    }
    
    public static void main(String args[]) {
        ShopkeeperPurchase obj = new ShopkeeperPurchase();
        obj.input();
        obj.accept();
        obj.calculate();
        obj.show();
    }
}