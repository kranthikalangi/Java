abstract class empol
{
    abstract double getAmount();
}
class weekelyPaid extends empol
{
   int n,s,netAmt;
   weekelyPaid(int n,int s)
   {
    this.n=n;
    this.s=s;
   }
   double getAmount()
   {
        netAmt=n*s;
        System.out.print("the total no of weeks is "+n+"the total amt to be paid is  ");
        return(netAmt);
   }
}
class hourlyPaid extends empol
{
    int n,s,netAmt;
    hourlyPaid(int n,int s)
    {
     this.n=n;
     this.s=s;
    }
    double getAmount()
   {
        netAmt=n*s;
        System.out.print("the total no of hours is "+n+"the total amt to be paid is  ");
        return(netAmt);
   }
}
public class empolye
{
    public static void main(String args[])
    {
        empol e1;
        empol s=new hourlyPaid(50,2000);
        System.out.println(s.getAmount());
        empol s1=new weekelyPaid(5,8000);
        System.out.println(s1.getAmount());
    }
}