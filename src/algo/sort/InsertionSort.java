package algo.sort;

import java.util.Arrays;

public class InsertionSort {

	public void insertionSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int temp = arr[i];
			int j = i - 1;
			
			while (j >= 0 && arr[j] > temp) {
				arr[j + 1] = arr[j];
				j--;
			}
			
			arr[j + 1] = temp;
		}
	}
	
	public static void main(String[] args) {
		InsertionSort sort = new InsertionSort();
		
		int[] arr = {5, 1, 9, 2, 10};
		sort.insertionSort(arr);
		
		System.out.println(Arrays.toString(arr));
	}

}
