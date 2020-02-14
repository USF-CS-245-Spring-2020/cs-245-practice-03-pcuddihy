public class BubbleSort implements Practice03Sort
{
	//from class notes
	public void sort(int [] a)
	{
		int passes = 1;
		boolean swapped = true;

		while (swapped)
		{
			swapped = false;
			for (int i = 0; i < a.length - passes; i++)
			{
				if (a[i] > a[i + 1])
				{
					swap(a, i, i + 1);
					swapped = true;
				}
			}
			++passes;
		}
	}

	private void swap(int [] a, int currentNum, int smallestNum)
	{
		int temp = a[currentNum];
		a[currentNum] = a[smallestNum];
		a[smallestNum] = temp;
	}
}