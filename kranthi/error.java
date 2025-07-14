public class error 
{
    public static void main(String args[]) 
    {
        int data=0;
        try 
        {
            
            data = 100 / 0;
            data+=1;
        }
        catch (ArithmeticException e) 
        {
            System.out.println(e);
        }
    } 
}