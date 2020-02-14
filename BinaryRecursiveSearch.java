public class BinaryRecursiveSearch implements Practice03Search
{
	//from class notes
	public int search(int [] arr, int target)
	{
		return trueSearch(arr, target, 0, arr.length - 1);
	}

	private int trueSearch(int [] arr, int target, int min, int max)
	{
		if (min > max)
		{
			return -1;
		}

		int mid = (min + max) / 2;
		
		if (arr[mid] == target)
		{
			return mid;
		}
		else if (arr[mid] < target)
		{
			return trueSearch(arr, target, mid + 1, max);
		}
		else
		{
			return trueSearch(arr, target, min, mid - 1);
		}
	}
}