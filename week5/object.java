//call by object
 class object
{
    int age=21;
    void change_age(object c)
    {
        age=age+10;
        System.out.println("age in local:"+age);
    }
    public static void main(String args[])
    {
        object c=new object();
        System.out.println("age before change:"+c.age);
        c.change_age(c);
        System.out.println("age after change:"+c.age);
    }
}