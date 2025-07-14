//to multiply two given matrices
import java.util.Scanner;
class multmatrix
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of 1st matrix:");
		int i,j,k;
		int row1=sc.nextInt();
		int col1=sc.nextInt();
		int a[][]=new int[row1][col1];
		System.out.print("Enter size of 2st matrix:");
		int row2=sc.nextInt();
		int col2=sc.nextInt();
		int b[][]=new int[row2][col2];
		int c[][]=new int[row1][col2];
		if(col1==row2){
		System.out.print("Enter the elements of 1st matrix:");
		for(i=0;i<row1;i++)
		{
			for(j=0;j<col1;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("1st matrix is:");
		for(i=0;i<row1;i++)
		{
			for(j=0;j<col1;j++)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.print("Enter the elements of 2nd matrix:");
		for(i=0;i<row2;i++)
		{
			for(j=0;j<col2;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		System.out.println("2nd matrix is:");
		for(i=0;i<row2;i++)
		{
			for(j=0;j<col2;j++)
			{
				System.out.print(b[i][j]+"\t");
			}
			System.out.println();
		}
		for(i=0;i<row1;i++)
		{
			for(j=0;j<col2;j++)
			{
				for(k=0;k<col1;k++)
				{
					c[i][j]+=a[i][k]*b[k][j];
				}
			}
		}
		System.out.println("MULTIPLICATION OF TWO MATRICES IS :");
		for(i=0;i<row1;i++)
		{
			for(j=0;j<col2;j++)
			{
				System.out.print(c[i][j]+"\t");
			}
			System.out.println();
		}
		}
		else{
			System.out.print("Multiplication is not possible");
		}
	}
}
		
		
		
