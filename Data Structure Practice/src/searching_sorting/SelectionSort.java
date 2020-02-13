package searching_sorting;

/**
 * Selection Sort -
 * 
 * In selection sort, we don't swap every element like bubble sort where we will have few swaps.
 * Instead we will check the largest element throughout the array and assign that to the last
 * position of the array. To do so, initially, we set largest element to 1st element of array
 * and compare it 2nd one. If we found 2nd element is greater than 1st one, we assign largest element
 * to 2nd element and continue to compare rest elements. Finally, at the end of the array we swap the last
 * element with largest element and again reset largest flag to 0th element and iterate over array.
 * 
 * @author akshaythakare
 *
 */

public class SelectionSort {

	public static void main(String[] args) {
		
		//Initializing integer array
		int[] intArray = {20, 7, 15, -10, 35, 1};
		
		/**
		 *Setting the outer loop to traverse from right to left sorting, i.e setting sorted element (largest)
		 *to the rightmost place
		 */
		for(int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--)
		{
			int largest = 0;
			for(int i = 1; i < lastUnsortedIndex; i++)
			{
				if(intArray[largest] < intArray[i])
				{
					largest = i;
					//swap(intArray,i,largest);
				}
			}
			swap(intArray,largest,lastUnsortedIndex);
		}
		
		//Printing array
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}

	}

	private static void swap(int[] intArray, int i, int j) {
		// TODO Auto-generated method stub
		int temp = intArray[i];
		intArray[i] = intArray[j];
		intArray[j] = temp;
	}

}
