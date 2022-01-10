import java.util.*;
class SubjectName
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int r;
		System.out.println("Enter the room number:");
		r=in.nextInt();
		if (r==604)
		System.out.println("Subject Name : Java Programming");
		else if (r==605)
		System.out.println("Subject Name : Python Programming");
		else
		System.out.println("Invalid Input from the user");
	}
}
