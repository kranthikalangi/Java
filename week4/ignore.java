//2.write an appication uses String method equals and equalsignoreCase to tests any two string objects for equality
import java.util.Scanner;
class ignore
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string:");
        String s1=sc.nextLine();
        System.out.println("enter a another string:");
        String s2=sc.nextLine();
        if(s1.equals(s2))
        {
            System.out.println(s1+"and"+s1+"are equals");
        }
        else if(s1.equalsIgnoreCase(s2))
        {
            System.out.println(s1+"and"+s2+"are equal by ignoring the case of acharacters:");
        }
        else
        {
            System.out.println(s1+"and"+s2+"are not equal");
        }

    }
}