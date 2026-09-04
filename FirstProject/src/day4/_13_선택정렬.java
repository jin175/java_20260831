package day4;

import java.util.Arrays;

public class _13_선택정렬 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {9,6,7,5,6,3,5};
		for(int j=0; j<arr.length-1; j++) {
			
			int minIndex = j;
			for(int i=j+1; i<arr.length; i++) {
				if(arr[minIndex] > arr[i]) {
					minIndex = i;
				}
			}
			int temp = arr[j];
			arr[j] = arr[minIndex];
			arr[minIndex] = temp;
			System.out.println(Arrays.toString(arr));
			
		}

	}

}
