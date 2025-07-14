//whether given number is palindrome or not
import java.util.*;
class palindrome
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int n,sum=0,rev;
    System.out.print("Enter a number :");
    n=sc.nextInt();
    int temp=n;
    while(n!=0)
    {
      rev=n%10;
      sum=(sum*10)+rev;
      n/=10;
    }
    if(sum==temp)
      System.out.println(temp+" is a Palindrome");
    else
      System.out.println(temp+" is not a Palindrome");
  }
}

