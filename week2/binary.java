//3.program to implement binary search
import java.util.Scanner;
class binary{
    public static void main(String args[])
    {
        int[]arr=new int[100];
        Scanner sc=new Scanner(System.in);
        int i,k,flag=0,mid=0,first=0,last;
        System.out.println("enter the array size");
        int n=sc.nextInt();
        System.out.println("enter %d elements:");
        last=n;
        for(i=0;i<n;i++)
        arr[i]=sc.nextInt();
        System.out.println("enter the searching element");
        k=sc.nextInt();
        mid=first+last/2;
        while(mid>0 && mid<last){
            mid=first+last/2;
            if(mid==k)
            {
                flag=1;
                break;
            }
            else
            if(mid<k)
            {
                first=mid;
            }
            else
            {
                last=mid;
            }
        }
        if(flag==1)
        System.out.println("searching element is found");
        else
        System.out.println("searching element is not found");
    }
}