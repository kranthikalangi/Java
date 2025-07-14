abstract class shape2D
{
    abstract double getArea();
}
abstract class shape3D
{
    abstract double getVolume();
}
class circle extends shape2D
{
   int r;
   circle(int r)
   {
    this.r=r;
   }
   double getArea()
   {
     System.out.println("area of the circle is  ");
     return (2*3.14*r);
   } 
}
class square extends shape2D
{
    int s;
    square (int s)
    {
     this.s=s;
    }
    double getArea()
    {
        System.out.println("area of the square is  ");  
      return (s*s);
    } 
}
class cube extends shape3D
{
    int a;
   cube (int a)
   {
    this.a=a;
   } 
   double getVolume()
   {
    System.out.println("volume of the cube is  ");
     return (a*a*a);
   }
}
class sphere extends shape3D
{
    int r;
   sphere (int r)
   {
    this.r=r;
   }
   double getVolume()
   {
    System.err.println("volume of the sphere is  ");
    return (r*r*r*3.14*1.33);
   } 
}
public class shapes
{
    public static void main(String[] args)
    {
        shape2D c=new circle(2);
        System.out.println(c.getArea());
        shape2D sq=new square(5);
        System.out.println(sq.getArea());
        shape3D cu=new cube(3);
        System.out.println(cu.getVolume());
        shape3D sp=new sphere(7);
        System.out.println(sp.getVolume());

    }
}