import java.util.Scanner;

public class TowerOfHanoi {

	public static void main(String args [])
	{
		int n;
		Scanner s = new Scanner(System.in);

		System.out.println("Enter the number of disks : \n");
		n = s.nextInt();
		towerOfHanoi(n , "A" , "C" ,"B");
	}

	static void towerOfHanoi(int n , String source, String dest, String auxilliary)
	{
		if(n == 1)
		{
			System.out.println("Move disk 1 from Peg " + source + " to Peg " + dest);
		}
		else
		{
			towerOfHanoi(n-1, source, auxilliary, dest );
			System.out.println("Move disk " + n + " from Peg " + source + " to Peg " + dest);
			towerOfHanoi(n-1, auxilliary, dest, source );
		}

	}
}


