/*2 .A mail-order house sells five products whose retail prices are as follows : Product 1: Rs. 99.90 , Product 2: Rs. 20.20 , Product 3: Rs. 6.87 , Product 4: Rs 45.50 and Product 5 : Rs. 40.49 . Each product has Product_Id, Product_Name, Product_Quantity, Product_Price. Write an application that reads a series of pairs of numbers as follows :
a) product Id
b) quantity sold
your program use a switch statement to determine the retail price for each product. it should calculate and display the total retail value of all products sold.*/
import java.util.*;
//import java.lang.*;
class product
{
  public static void main(String... args)
  {
    Scanner sc = new Scanner(System.in);
    calculate c = new calculate();
    double pr1=0,pr2=0,pr3=0,pr4=0,pr5=0,total=0;
    int p;
    System.out.println("1.Product 1");
      System.out.println("2.Product 2");
      System.out.println("3.Product 3");
      System.out.println("4.Product 4");
      System.out.println("5.Product 5");
      System.out.println("6.Total Price ");
    do{
      
      System.out.println("which Product you want?");
      p=sc.nextInt();
      switch(p)
      {
        case 1: pr1=c.product1();
        
          break;
        case 2: pr2=c.product2();
          break;
        case 3: pr3=c.product3();
          break;
        case 4: pr4=c.product4();
          break;
        case 5: pr5=c.product5();
          break;
        case 6: total=pr1+pr2+pr3+pr4+pr5;
          System.out.println(total);
          System.out.println("THANK YOU");
          System.exit(0);
      }
    }while(p==1||p==2||p==3||p==4||p==5||p==6);
  }
}
class calculate
{
  Scanner sc = new Scanner(System.in);
  double product1()
  {
    double p1=99.90;
    System.out.print("Enter Quantity of product:");
    double q = sc.nextDouble();
    double t= p1*q;
    System.out.println("Product 1: "+t);
    return t;
  }
  double product2()
  {
    double p2=20.20;
    System.out.print("Enter Quantity of product:");
    double q = sc.nextDouble();
    double t= p2*q;
    System.out.println("Product 2: "+t);
    return t;
  }
  double product3()
  {
    double p3=6.87;
    System.out.print("Enter Quantity of product:");
    double q = sc.nextDouble();
    double t= p3*q;
    System.out.println("Product 3: "+t);
    return t;
  }
  double product4()
  {
    double p4=45.50;
    System.out.print("Enter Quantity of product:");
    double q = sc.nextDouble();
    double t= p4*q;
    System.out.println("Product 4: "+t);
    return t;
  }
  double product5()
  {
    double p5=40.49;
    System.out.print("Enter Quantity of product:");
    double q = sc.nextDouble();
    double t= p5*q;
    System.out.println("Product 5: "+t);
    return t;
  }
}
    
