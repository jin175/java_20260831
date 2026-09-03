package day4;

import java.util.Arrays;

public class _12_선택정렬 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {9,6,7,3,5};
		
		// arr에서 가장 작은 숫자를 찾아서 맨 앞의 숫자랑 자리 바꾸기 
		// {9,6,7,3,5} => {3,6,7,9,5}
		// 아래 코드를 반복문 안의 반복문으로 처리
		
		
		
		int minIndex = 0;
		for(int i=1; i<arr.length; i++) {
			if(arr[minIndex] > arr[i]) {
				minIndex = i;
			}
		}
		int temp = arr[0];
		arr[0] = arr[minIndex];
		arr[minIndex] = temp;
		
		
		System.out.println(Arrays.toString(arr));
		

	}

}
