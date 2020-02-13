package searching_sorting;

/**
 * In insertion sort, we select array element by element in increasing order. Initially, the first 
 * element is considered as sorted array because of only one element. Then we add one more element
 * to the array and do comparison between two elements and make it sorted and so on.
 * @author akshaythakare
 *
 */

public class InsertionSort {

	public static void main(String[] args) {
		
		int[] intArray = {20,5,-7,10,55,35,-10};
		
		for(int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++)
		{
			int newElement = intArray[firstUnsortedIndex];
			int i;
			for(i = firstUnsortedIndex; i > 0 && intArray[i-1] > newElement; i--)
			{
				intArray[i] = intArray[i-1];
			}
			
			intArray[i] = newElement;
		}
		
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}


	}

}
