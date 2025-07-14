//3.write  an application that uses
import java.util.Scanner;
class character
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a string:");
        String str=sc.nextLine();
        System.out.println("enter a character:");
        char ch=sc.next().charAt(0);
        int count=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(str.indexOf(ch))==str.charAt(i))
            {
                count++;
            }
        }
        System.out.println(ch +"is present"+  count  +"times in given string:");
    }
}