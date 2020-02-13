package searching_sorting;

public class BubbleSort {

	public static void main(String[] args) {
		
		int[] intArray = {20, 35, -15, 7, 55, 1, -22};
		
		//printArray();
		for (int unsortedArrayIndex = intArray.length - 1; unsortedArrayIndex > 0; unsortedArrayIndex--) {
			for (int i = 0; i < unsortedArrayIndex; i++) {
				if(intArray[i] > intArray[i+1])
				{
					swapArray(intArray, i, i+1);
				}
			}
		}
		
		
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
		

	}

	
	private static void swapArray(int[] intArray, int i, int j)
	{
		if (i ==j)
		{
			return;
		}
		
		int temp = intArray[i];
		intArray[i] = intArray[j];
		intArray[j] = temp;
	}

}
