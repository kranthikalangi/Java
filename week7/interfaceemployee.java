import java.util.*; 
interface interfacename 
{
    double getAmt();    
}
class employee implements interfacename
{
   public  double getAmt()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the amount to be paid for invoice ");
        int n=sc.nextInt();
        System.out.println("enter the amount to be paid for incentives ");
        int incentives=sc.nextInt();
        int invoice=n+incentives;
       // System.out.println("amount to be paid of invoice ");
        return invoice;
    }
} 
public class interfaceemployee
{
    public static void main(String[] args) 
    {
        interfacename i;
        interfacename e=new employee();
        System.out.println(e.getAmt());    
    }
   
} 