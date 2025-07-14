import java.util.*;
class sort
{
    int i,j,temp;
    void elements(int n,int []arr)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the elements :");
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
    }
    void sorting(int n,int []arr)
    {
        for(i=0;i<n;i++)
        {
            for(j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    void print(int n,int arr[])
    {

        for(i=0;i<n;i++)
        {
            System.out.println("\t"+arr[i]+"\t");
        }
    }
}
public class arraysort
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no. of elements: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        sort s=new sort();
        s.elements(n,arr);
        System.out.println("before sort ");
        s.print(n, arr);
        s.sorting(n,arr);
        System.out.println("after sort");
        s.print(n, arr);
    }
}