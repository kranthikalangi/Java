//upercase letters to lowercase letters 
import java.util.Scanner;
class upper
{
    public static void main(String... ar)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string:");
        String str=sc.nextLine();
        String s1=str.toLowerCase();
        System.out.println("lowercase string is:"+s1);
       // String s1=str.toUpperCase();
       // System.out.println("uppercase string is:"+s1);
        System.out.println(" ");
    }
}