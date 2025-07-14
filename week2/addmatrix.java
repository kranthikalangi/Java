//4.addition of given two matrix
import java.util.*;
class addmatrix
{
  public static void main(String... args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter size of matrix :");
    int row,col,i,j;
    row=sc.nextInt();
    col=sc.nextInt();
    int a[][]=new int[row][col];
    int b[][]=new int[row][col];
    int c[][]=new int[row][col];
    System.out.print("Enter 1st matrix elements :"); 
    for(i=0;i<row;i++)
    {
      for(j=0;j<col;j++)
      {
        a[i][j]=sc.nextInt();
      }
    }
    for(i=0;i<row;i++)
    {
      for(j=0;j<col;j++)
      {
        System.out.print(a[i][j]+"\t");
      }
        System.out.println();
    }
    System.out.print("Enter 2st matrix elements :");
    for(i=0;i<row;i++)
    {
      for(j=0;j<col;j++)
      {
        b[i][j]=sc.nextInt();
      }
    }
    for(i=0;i<row;i++)
    {
      for(j=0;j<col;j++)
      {
        System.out.print(b[i][j]+"\t");
      }
        System.out.println();
    }
    System.out.println("Addition of Matrices");
    for(i=0;i<row;i++)
    {
      for(j=0;j<col;j++)
      {
        c[i][j]=a[i][j]+b[i][j];
        System.out.print(c[i][j]+"\t");
      }
      System.out.println();
    }
  }
}