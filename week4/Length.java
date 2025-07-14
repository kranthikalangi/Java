//6.write an appilication that finds length of a given string
import java.util.Scanner;
class Length
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter Strings :");
      String s=sc.nextLine();
      System.out.println(s.length());
    }
}