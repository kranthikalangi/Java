public class collage
{
    void MPC()
    {
        System.out.println("MPC");
    }
}
class firstyear extends collage
{
void BIPC()
{
    System.out.println("BIPC");
}
}
class inter
{
public static void main(String args[])
{
firstyear f1=new firstyear();
f1.MPC();
f1.BIPC();
secondyear s2=new secondyear();
s2.HEC(); 
}
}
class secondyear extends collage
{
    void HEC()
    {
        System.out.println("HEC");
    }
}
