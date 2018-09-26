
//Iterative code for binary search
import java.util.Scanner;
import java.lang.Math;
public class BinarySearch {
	
	public static void main(String args [])
	{
   
	final int SIZE = 11;
	Scanner s = new Scanner(System.in);
	int [] searchArray = new int[SIZE];
	int low = 0;
	int high = searchArray.length;
	
	for(int i = 0 ; i < searchArray.length ; i++ )
	{
		searchArray[i] = i ;
	}
	
	System.out.println("Enter the number to be searched : ");
	
	int input = s.nextInt();
	
	
	
	while(low < high)
	{
		if(searchArray.length == 1)
		{
			System.out.println("Array contains only one element ");
			if(searchArray[low] == input)
			{
				System.out.println("Number found !!!!! ");
				break;
			}
			else
			{
				System.out.println("Number does not exist !!!!! ");
				break;
			}
		}
		else
		{
			int mid = (int)Math.floor((low + high) / 2);
			
			if(input == searchArray[mid])
			{
				System.out.println("Number Found !!!! ");
				break;
			}
			else if (input > searchArray[mid])
			{
				low = mid + 1;
			}
			else
			{
				high = mid -1;
			}
		}
	}
	

   }
}
