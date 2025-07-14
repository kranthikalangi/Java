/*Write a program to display details of the required employee based on his Id.
The details of employee includes, Emp_name, Emp_age, Emp_gender, Emp_designation,
Emp_salary, Emp_Address etc., */
import java.util.*;
class employee
{
  int id;
  String name;
  int age;
  String gender;
  String desig;
  int salary;
  String address;
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in); 
    System.out.println("Enter size of the employees :");
    int i;
    int n= sc.nextInt();
    employee e[] =new employee[n];
    sc.nextLine();
    for(i=0;i<n;i++)
    {
      e[i]=new employee();
      e[i].create();
    }
    
    System.out.println("Enter id to search :");
    int s_id=sc.nextInt();
    for(i=0;i<n;i++)
    {
      if(e[i].id==s_id)
      {
        System.out.println("Employee Details :");
        System.out.println("ID         :"+e[i].id);
        System.out.println("NAME       :"+e[i].name);
        System.out.println("AGE        :"+e[i].age);
        System.out.println("GENDER     :"+e[i].gender);
        System.out.println("DESIGNATION:"+e[i].desig);
        System.out.println("SALARY     :"+e[i].salary);
        System.out.println("ADDRESS    :"+e[i].address);
        break;
      }
    }
    if(i==n){
      System.out.println("Employee with id " + s_id + " not found.");
    }
  } 
  void create()
  {
    System.out.println("Enter I'D,Emp_name, Emp_age, Emp_gender, Emp_designation,Emp_salary, Emp_Address :");
    Scanner sc = new Scanner(System.in); 
    id=sc.nextInt();
    sc.nextLine();
    name=sc.nextLine();
    age=sc.nextInt();
    sc.nextLine();
    gender=sc.nextLine();
    desig=sc.nextLine();
    salary=sc.nextInt();
    sc.nextLine();
    address=sc.nextLine();
  }
}
    
    
  
