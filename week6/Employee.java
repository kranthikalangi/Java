/*3. Write an application to create a super class Employee with information first name & last name and methods getFirstName(), getLastName() derive the sub-classes ContractEmployee and RegularEmployee with the information about department, designation & method displayFullName() , getDepartment(), getDesig() to print the salary and to set department name & designation of the corresponding sub-class objects respectively.*/
import java.util.*;
class Employee
{
  public String first_name;
  public String last_name;

  String getFirstName(String first_name)
  {
    this.first_name=first_name;
    return first_name;
  }
  String getLastName(String last_name)
  {
    this.last_name=last_name;
    return last_name;
  }
}
class ContractEmployee extends Employee
{
  String x=getFirstName("YADAGIRI");
  String y=getLastName("GAINI");
  String getDepartment()
  {
    return "CSE";
  }
  String getDesig()
  {
    return "LECTURER";
  }
  String displayFullName()
  {
    return first_name+" "+last_name;
  }
  Double Salary()
  {
  return 50000.50;
  }
}
class RegularEmployee extends Employee
{
  String a=getFirstName("RAHUL");
  String b=getLastName("MALAVATH");
  String getDepartment()
  {
    return "IT";
  }
  String getDesig()
  {
    return "HoD";
  }
  String displayFullName()
  {
    return first_name+" "+last_name;
  }
  Double Salary()
  {
  return 75000.50;
  }
}
class d
{
  public static void main(String... args){
  ContractEmployee CE = new ContractEmployee();
  RegularEmployee RE = new RegularEmployee();
  int choice;
  
  do 
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("--------------------------------------------------------");
    System.out.println("1.Contract Employee");
    System.out.println("1.Regular Employee DETAILS");
    System.out.println("3.TO EXIT");
    System.out.println("Enter your choice :");
    choice=sc.nextInt();
    switch(choice)
    {
      case 1: System.out.println("Contract Employee DETAILS");
        System.out.println("Full Name : "+CE.displayFullName());
        System.out.println("Department : "+CE.getDepartment());
        System.out.println("Designation : "+CE.getDesig());
        System.out.println("Salary    : "+CE.Salary());
        break;
      case 2: System.out.println("Contract Employee DETAILS");
        System.out.println("Full Name : "+RE.displayFullName());
        System.out.println("Department : "+RE.getDepartment());
        System.out.println("Designation : "+RE.getDesig());
        System.out.println("Salary    : "+RE.Salary());
        break;
      case 3: System.out.println("THANK YOU");
        System.exit(0);
    }
  }while(choice==1||choice==2||choice==3);
}
}  



/*
class Employee {
    private String firstName;
    private String lastName;

    // Constructor
    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Getter methods
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}

class ContractEmployee extends Employee {
    private String department;

    // Constructor
    public ContractEmployee(String firstName, String lastName) {
        super(firstName, lastName);
        this.department = "Not specified";
    }

    // Setter method for department
    public void setDepartment(String department) {
        this.department = department;
    }

    // Display full name and department
    public void displayFullName() {
        System.out.println("Contract Employee: " + getFirstName() + " " + getLastName());
        System.out.println("Department: " + department);
    }
}

class RegularEmployee extends Employee {
    private String designation;

    // Constructor
    public RegularEmployee(String firstName, String lastName) {
        super(firstName, lastName);
        this.designation = "Not specified";
    }

    // Setter method for designation
    public void setDesignation(String designation) {
        this.designation = designation;
    }

    // Display full name and designation
    public void displayFullName() {
        System.out.println("Regular Employee: " + getFirstName() + " " + getLastName());
        System.out.println("Designation: " + designation);
    }
}

public class EmployeeApp {
    public static void main(String[] args) {
        // Creating instances of ContractEmployee and RegularEmployee
        ContractEmployee contractEmployee = new ContractEmployee("John", "Doe");
        RegularEmployee regularEmployee = new RegularEmployee("Alice", "Smith");

        // Setting department and designation for ContractEmployee and RegularEmployee
        contractEmployee.setDepartment("HR");
        regularEmployee.setDesignation("Software Engineer");

        // Displaying full name and additional information
        contractEmployee.displayFullName();
        System.out.println("-----------------------");
        regularEmployee.displayFullName();
    }
}
*/
