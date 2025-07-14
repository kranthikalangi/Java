import java.util.Scanner;
public class quadratic
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a value");
        double a=sc.nextDouble();
        System.out.println("enter b value:");
        double b=sc.nextDouble();
        System.out.println("enter c value:");
        double c=sc .nextDouble();
        double d=b*b-4*a*c;
        if(d==0)
        {
            System.out.println("roots are equal:");
            System.out.println("root1:"+(-b/(2*a)));
            System.out.println("root2:"+(b/(2*a)));
        }
        else if(d>0)
        {
            System.out.println("roots are imaginary:");
        }
        else{
            System.out.println("roots are unequal");
            System.out.println("root1:"+(-b+Math.sqrt(d)/2*a));
            System.out.println("root2:"+(-b-Math.sqrt(d)/2*a));
        }
    }
}