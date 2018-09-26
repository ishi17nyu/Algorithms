
import java.lang.*;
import java.util.Scanner;

public class LinearSearch {
	
	public static void main (String args [])
	{
		//declaration of variables
		int [] searchArray =  new int [100000];
		Scanner s = new Scanner(System.in);
		int j = 0;

		for(int i = 0 ; i < 100000 ; i++)
		{
			searchArray[i] = i;
		}
		
		//Enter the number to be searched
		System.out.println("Enter the number to be searchd ");
		int numberToSearch = s.nextInt();
		
		//running linear search loop
		for( ; j < searchArray.length ; j++)
		{
			if(searchArray[j] == numberToSearch)
			{
				System.out.println("Number found " + searchArray[j] );
				break;
			}
		}
		
		//When number is not found in array
		if(j == (searchArray.length))
		{
			System.out.println("Number not found \n");
		}
		
	}

}
