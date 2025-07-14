//1.write an application that uses String method compareTo to compare two strings defined by the user
import java.util.Scanner;
class equal
{
    public static void main(String... ar)
    {
        String str1;
        String str2;
        Scanner sc =new Scanner(System.in);
        System.out.println("String str1:");
        str1=sc.next();
        System.out.println("String str2:");
        str2=sc.next();
        System.out.println(str1.compareTo(str2));
        if(str1.compareTo(str2)==0)

        System.out.println("EQUAL");
        else
         System.out.println("NOT EQUAL");
    }
}