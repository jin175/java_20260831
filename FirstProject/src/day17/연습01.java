package day17;

import java.util.Arrays;

public class 연습01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 2. 7 × 7 배열을 만들고 다음과 같이 출력되도록 하세요.
		// i=0일때 1 , j=0일때 1, i=arr.length일때 1, j=arr.length일때 1
		
		
		int arr [][] = new int [7][7];
	
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				arr[i][j] = Math.min(
					Math.min(i, j),
					Math.min(arr.length - 1 - i, arr.length - 1 - j)
				) + 1;
			}
		}

		for(int i=0; i<arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
		
		
		
	}

}
