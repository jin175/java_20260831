package day4;

import java.util.Arrays;
import java.util.Random;

public class ArrayFunc {

	void arrayMax(int[] arr) {
		// arr = {3,5,2,4,1}

	}

	void arraySum(int[] arr) {

	}

	int arrayChoice(int[] qqq, loc) {
		// qqq = {3,5,2,4,1} 
		return qqq[loc-1];
	}

	void arrayRandom(int x) {
		int arr[] = new int[x];
		Random ran = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = ran.nextInt(30) + 1;
		}
		System.out.println(Arrays.toString(arr));

	}

}
