import java.util.Scanner;
public class MatrixMultiplication {
	
	public static void main(String args [])
	{
		int a [][] = new int[2][3];
		int b [][] = new int[3][2];
		int c[][] = new int[2][2];
		Scanner s = new Scanner(System.in);
		
		System.out.println("Take for matrix A from user : \n");
		for(int i = 0; i < 2 ; i++)
		{
			for(int j = 0 ; j < 3 ; j++)
			{
				 a[i][j] = s.nextInt();
			}
		}
		
		System.out.println("Take for matrix B from user : \n");
		for(int i = 0; i < 3; i++)
		{
			for(int j = 0 ; j < 2 ; j++)
			{
				 b[i][j] = s.nextInt();
			}
		}
		
		for(int i = 0; i < 2 ; i++)
		{
			for(int j = 0 ; j < 2 ; j++)
			{
				c[i][j] = 0;
 				for(int k = 0; k < 3; k++)
				{
					c[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		
		System.out.println("Result of Matrix Multiplication : \n");
		for(int i = 0 ; i<2 ; i++)
		{
			for(int j = 0 ; j<2 ; j++)
			{
				System.out.print(c[i][j]);
				System.out.print("\t");
			}
			System.out.print("\n");
		}
		
	}
}
