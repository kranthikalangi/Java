public class Operator
{
    Operator(int x,int y,int z)
    {
        this(x,y);
        System.out.println("Value of z:+z");
    }
    Operator(int x,int y)
    {
        this(x);
        System.out.println("value of y:"+y);
    }
    Operator(int x)
    {
        System.out.println("value of z:"+x);
    }
    void print()
    {
        System.out.println("   ");
    }
}
class Operater
{
public static void main(String[] args)
    {
    Operator o=new Operator(10,20,30);
        o.print();
    } 
}
