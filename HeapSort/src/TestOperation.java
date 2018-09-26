import java.util.Scanner;

public class TestOperation {
	
	public static void main(String [] args)
	{
		Scanner s = new Scanner(System.in);
		int heapArray [] = new int[6];
		int value = 0;
		
		SinkOperation so = new SinkOperation();
		SwimOperation sw = new SwimOperation();

		System.out.println("Enter the heap elements : \n");
		
		for(int i = 0 ; i < heapArray.length ; i++)
		{
			heapArray[i] = s.nextInt();
		}
		
		int min = getMin(heapArray);
		System.out.println("Minimum element : \n" + min);
		System.out.println("\n");
		heapArray = so.sink_operation(heapArray,1);
		
		for(int i = 0 ; i < heapArray.length ; i++)
		{
			System.out.println(heapArray[i]);
		}
		
		
		System.out.println("Enter the element to be inserted : \n ");
		value = s.nextInt();
		insert(heapArray,value);
		
		for(int i = 0 ; i < heapArray.length ; i++)
		{
			System.out.println(heapArray[i]);
		}
		
		
		
	}
	
	public static int getMin(int array [])
	{
		int N = array.length;
		int min = array[0];
		array[0] = array[N-1];
		array[N-1] = 0;
		return min;
	}
	
	public static void insert(int array [],int value)
	{
		int N = array.length;
		array[N-1] = value;
	}

}
