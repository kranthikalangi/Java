// 3. Write java program that inputs 5 numbers, each between 10 and 100 inclusive. As each number is read display it only if it’s not a duplicate of any number already read display the complete set of unique values input after the user enters each new value
import java.util.*;
class duplicate
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int a[]=new int[5];
    int n,i;
    int count=0;
    while(count<5)
    {
     System.out.println("enter the num");
     int b=sc.nextInt();
     if(b>9 && b<101){
     a[count]=b;
     
     for(i=0;i<count;i++)
     {
       if(a[i]==b)
       {
         System.out.println("Duplicate values are INVALID");
         count--;
       }
     }
     count++;
    }
    else {
      System.out.println("Please enter values between 10 and 100 inclusive");
    }
    }
     System.out.println("after deleting duplicates:");
     for(i=0;i<5;i++)
     {
     System.out.println(a[i]);
     }
  }
}
