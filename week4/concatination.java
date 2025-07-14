//4.write an application that uses String method concat to concatenate two defined strings
 import java.util.Scanner;
 class concatination
 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string:");
        String s1=sc.nextLine();
        System.out.println("enter a another string:");
        String s2=sc.nextLine();
         System.out.println("concatinatiom of two strings:"+s1+s2);
         String s3=s1.concat(s2);
          System.out.println("concatination of given two strings by using concate method:"+s3);
    }
    
 }