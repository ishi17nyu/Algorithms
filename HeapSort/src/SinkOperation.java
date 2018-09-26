
public class SinkOperation {
	
	public int [] sink_operation(int[] array , int k)
	{
		int N = array.length;
		int smallest;
		while(2*k <= N)
		{
			smallest = 2 * k;
			if(array[2 * k] > array[2*k + 1])
			{
				smallest = 2*k +1;
			}
			if(array[k] < array[smallest])
			{
				break;
			}
			else
			{
				int temp;
				temp = array[smallest];
				array[smallest] = array[k];
				array[k] = temp;
			}
			k = smallest;
		}
		
		return array;
	}

}
