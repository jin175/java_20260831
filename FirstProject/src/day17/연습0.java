package day17;

import java.util.Arrays;

public class 연습0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. 5 x 5 크기의 숫자형 배열 선언 후 1부터 25까지의 숫자를 세로방향으로 순차적으로 채우세요.
		
		int arr [][] = new int [5][5];
		int num = 0;
		
		// 세로 방향으로 1부터 25까지 채우기 
		for (int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				num++;
				arr[j][i] = num;
				
			}
			
		}
		for(int i=0; i<arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
		
		
	}

}
