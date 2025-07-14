import java.util.*;
interface Vehicle
{
    void  getcolour();
    void  getnumber();
    void  getconsumption();
}
class twowheelers implements Vehicle
{
    int fuel;
    String name,colour,num;

    twowheelers(int fuel,String name,String colour,String num)
    {
        this.colour=colour;
        this.fuel=fuel;
        this.name=name;
        this.num=num;
    }
    void getcolour(String colour)
    {
        System.out.println("The colour of the vehicle is "+colour);
    }
    void getnumber(String num)
    {
        System.out.println("The number of vehicle is "+num);
    }
    void getconsumption(int fuel)
    {
        System.out.println("the fuel consumed per 1 km is "+fuel);
    }

}
class fourwheelers implements Vehicle
{
    int fuel;
    String name,colour,num;

    fourwheelers(int fuel,String name,String colour,String num)
    {
        this.colour=colour;
        this.fuel=fuel;
        this.name=name;
        this.num=num;
    }
    void getcolour(String colour)
    {
        System.out.println("The colour of the vehicle is "+colour);
    }
    void getnumber(String num)
    {
        System.out.println("The number of vehicle is "+num);
    }
    void getconsumption(int feul)
    {
        System.out.println("the fuel consumed per 1 km is "+feul);
    }


}

public class vehicle {
    public static void main(String[] args) 
    {

    }
    
}
