//3.Write a Java program to implement calculator operations
import java.util.*;
class calculator
{
  public static void main(String... args)
  {
    Scanner sc=new Scanner(System.in);
		System.out.println("Enter a, b values:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.print("Enter operator (+,-,*,/):");
		char c = sc.next().charAt(0);
		switch(c)
		{
		  case '+': System.out.println(a+b);
		    break;
		  case '-': System.out.println(a-b);
		    break;
		  case '*': System.out.println(a*b);
		    break;
		  case '/': System.out.println(a/b);
		    break;
		  default:
		    System.out.println("INVALID Operator");
		}
	}
}
