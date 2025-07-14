//4.To find out prime factor of given number
import java.util.Scanner;
class Prime
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a number :");
    int n=sc.nextInt();
    int i;
    for(i=2;i<=n;i++)
    {
      while (n%i==0)
      {
        System.out.print(i+"\t");
        n=n/i;
      }
    }
  }
}
    