//call by value
class Callbyvalue
{
    int age=21;
    void change_age(int age)
    {
        age=age+10;
        System.out.println("age in local:"+age);
    }
    public static void main(String args[])
    {
        Callbyvalue c=new Callbyvalue();
        System.out.println("age before change:"+c.age);
        c.change_age(10);
        System.out.println("after changed age:"+c.age);
    }
}