//1.to sort given list of numbers
import java.util.Scanner;
class sort{
    public static void main(String[] args)
    {
        int[]
        arr=new int[10];
        Scanner sc=new Scanner(System.in);
        int i,j,temp;
        System.out.println("enter size of array:");
        int n=sc.nextInt();
        System.out.println("enter %d elements:");
        for(i=0;i<n;i++)
        arr[i]=sc.nextInt();
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
        for(i=0;i<n;i++)
        System.out.println(arr[i]);
    }
}
