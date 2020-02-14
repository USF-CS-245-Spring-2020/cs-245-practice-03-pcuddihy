public class SelectionSort implements Practice03Sort
{
	//from class notes
	public void sort(int [] a)
	{
		for (int i = 0; i < a.length - 1; i++)
		{
			swap(a, i, findMin(a, i));
		}
	}

	private void swap(int [] a, int currentNum, int smallestNum)
	{
		int temp = a[currentNum];
		a[currentNum] = a[smallestNum];
		a[smallestNum] = temp;
	}

	private int findMin(int [] a, int start)
	{
		int min = start;
		for (int i = start + 1; i < a.length; i++)
		{
			if (a[i] < a[min])
			{
				min = i;
			}
		}
		return min;
	}
}