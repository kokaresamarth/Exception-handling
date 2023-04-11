import java.util.*;
public class Text {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println("4");
		try
		{
			double c;
			Scanner sc=new Scanner(System.in);
			System.out.println("enter any two numbers");
			int a=sc.nextInt();
			int b=sc.nextInt();
			c=a/b;
			System.out.println("Division is " +c);
		}
		catch(Exception ex)
		{
			System.out.println("you cannot divided by zero");
		}
		System.out.println("5");
		System.out.println("6");
    	System.out.println("7");
		System.out.println("8");
	}

}
