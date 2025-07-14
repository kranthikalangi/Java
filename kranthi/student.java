class studentdemo
{
    private String name;
    private int rno;
    private int age;
    public studentdemo (String name,int rno,int age)
    {
        this.name=name;
        this.rno=rno;
        this.age=age;
    }
    public void setAge(int age)
    {
        if(age>0&&age<100)
        this.age=age;
    }
    int getAge(){
    return age;
    }
    public void printdetails()
    {
        System.out.println("name:"+name);
        System.out.println("roll:"+rno);
        System.out.println("age:"+age);
    }
}
public class student
{
    public static void main(String args[]){
    studentdemo s=new studentdemo("jyothi",1,5);
    studentdemo s1=new studentdemo("uma",1,12);
    s1.setAge(5);
    s1.printdetails();
    s.printdetails();
}
}