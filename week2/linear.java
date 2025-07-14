//2.implement the linear search
import java.util.Scanner;
class linear{
    public static void main(String args[])
    {
        int[]arr=new int[100];
        Scanner sc=new Scanner(System.in);
        int i,j,temp,key,flag=0;
        System.out.println("enter size of array");
        int n=sc.nextInt();
        System.out.println("enter %d elements:");
        for(i=0;i<n;i++)
        arr[i]=sc.nextInt();
        System.out.print("enter the searching element:");
        key=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(key==arr[i])
            {
                flag=1;
                break;
            }
        }
        if(flag==1)
        System.out.print("FOUND");
        else
        System.out.println("NOT FOUND");
    }
}