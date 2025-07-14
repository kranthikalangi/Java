//write an application reverse of a string
import java.util.Scanner;
class reverse
{
    public  static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string:");
        String str=sc.nextLine();
        int n=str.length();
        System.out.println("reverse of given string is:");
        for(int i=n-1;i>=0;i--)
        {
            char rev=str.charAt(i);
            System.out.println(rev);
        }
        System.out.println(" ");
    }
}