public class BinaryIterativeSearch implements Practice03Search
{
	public int search(int [] arr, int target)
	{
		int min = 0, max = arr.length - 1;

		while (min <= max)
		{
			int mid = (min + max) / 2;
			if (arr[mid] == target)
			{
				return mid;
			}
			if (arr[mid] < target)
			{
				min = mid + 1;
			}
			else 
			{
				max = mid - 1;
			}
		}
		return -1;
	}
}