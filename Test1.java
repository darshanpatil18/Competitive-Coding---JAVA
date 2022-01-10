import java.util.*; 
interface Newspaper
{

void news();
}

class Magazine implements Newspaper
{

String title;
 
int ISBN;
String editor;
Magazine(String title, int ISBN, String editor)
{
this.title=title; 
this.ISBN=ISBN;
this.editor=editor;

}
public void news()
{
System.out.println("Title:"+title); 
System.out.println("ISBN:"+ISBN); 
System.out.println("editor:"+editor);

}
}

class Brochure implements Newspaper
{

String title; 
int year;
int page_no;
Brochure(String title, int year, int page_no)
{
this.title=title; 
this.year=year; 
this.page_no=page_no;
}
 
public void news()
{
System.out.println("Title:"+title); 
System.out.println("ISBN:"+year); 
System.out.println("Page number:"+page_no);
}
}

public class Test1
{

public static void main(String args[])
{
Scanner sc = new Scanner(System.in); 
System.out.print("Enter your choice:\nPress 1 to get details of magazine OR Press 2 to get details of the brochure: ");
int ch = sc.nextInt(); 
switch(ch)
{
case 1:

System.out.println("Enter title of the magazine: "); 
String mtitle = sc.next();
System.out.println("Enter ISBN of the magazine: "); 
int ISBN = sc.nextInt();
System.out.println("Enter editor of the magazine: "); 
String editor = sc.next();
Newspaper m = new Magazine(mtitle,ISBN,editor); m.news();
break;
 
case 2:
System.out.println("Enter title of the brochure: "); 
String btitle = sc.next();
System.out.println("Enter year of the brochure: "); 
int year = sc.nextInt();
System.out.println("Enter page number of the brochure: "); 
int page_no = sc.nextInt();
Newspaper b = new Brochure(btitle,year,page_no); 
b.news();
break;
default: System.out.println("Wrong Entry");
}
sc.close();

}
}
