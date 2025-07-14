public class Wrapper
{
    /**
     * @param args
     */
    public static void main(String args[])
    {
    int a=10;
    Integer c=Integer.valueOf(a);
    Integer b=a;
    System.out.println(a+" "+c+" "+b);
        Integer x=new Integer(5);
        int z=x.intValue();
        int y=x;
        System.out.println(x+" "+y+" "+z);

    }
}