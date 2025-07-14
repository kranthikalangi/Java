
public class Integer
{
    int i;
    Integer(int i)
    {
        this.i=i;
    }
    int min_value()
    {
        return i;
       
    }
    int max_value()
    {
        return i;

    }
    int Bytes()
    {
        return i;
        
    }
    public static Integer valueOf(int a) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'valueOf'");
    }
    public int intValue() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'intValue'");
    }
}
    class range
{
    public static void main(String args[])
    {
        Integer i=new Integer(5);
        System.out.println("int min" +i.min_value());
        System.out.println("int max" +i.max_value());
        System.out.println("int Bytes" +i.Bytes());
    }
}
