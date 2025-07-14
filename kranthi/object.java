
class Object
{
    int age=21;
    void change_age(Object c1)
    { 
       age=age+10;
       System.out.println("age in local:"+age);
    }
         public static void main(String args[])
        {

            Object c1=new Object();
            System.out.println("age before change:"+c1.age);
            c1.change_age(c1);
            System.out.println("age after change:"+c1.age);
        }
}
