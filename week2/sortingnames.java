//6.sorting a given list of names
import java.util.*;
class sortingnames
{
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("How many names are you going to enter? :");
		int i,j,n;
        n=sc.nextInt();
		sc.nextLine();
		String s[] = new String[n];
		String temp;
		System.out.println("ENTER NAMES :");
		for(i=0;i<n;i++)
		{
			s[i]=sc.nextLine();
		}
		System.out.println("ENTERED NAMES :");
		for(i=0;i<n;i++)
		{
			System.out.print(s[i]+"\t");
		}
		System.out.println();
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(s[i].compareTo(s[j])>0)
				{
					temp=s[i];
        	s[i]=s[j];
        	s[j]=temp;
        }
        
    	}
    }
    System.out.println("SORTED NAMES :");
		for(i=0;i<n;i++)
		{
			System.out.print(s[i]+"\t");
		}
		System.out.println();
	}
}
		
