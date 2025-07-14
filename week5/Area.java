//radius of the circle
import java.util.Scanner;
class Area
{
    double r;
    double Area()
    {
        return(22/7)*r*r;
    }
    double perimeter()
    {
        return 2*(22/7)*r;
    }
}           
        class demo
        {
            public static void main(String args[])
            {
                Scanner s=new Scanner(System.in);
                Area a=new Area();
                System.out.println("enter the radius of the circle");
                double R=s.nextDouble();
                a.r=R;
                System.out.println("perimeter of the circle is:" +a.perimeter());
                System.out.println("Area of circle is:"+a.Area());
            }
        }