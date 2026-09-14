package day11;

import java.util.Arrays;
import java.util.Random;

public class _0_연습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		1. 기본 연습문제
//
//		# 20개의 공간을 가지는 배열을 생성하고, 랜덤한 숫자 1~10사이의 값을 20개의 공간에 모두 넣으시오.
//
//		2) 각 숫자의 개수를 출력하시오.
//		답변 예시 : '1 : 6개, 2 : 3개, 3 : 5개, ... 10 : 2개'
//
//		2) 중복된 숫자가 가장 많은 수의 숫자와 개수를 출력하시오.
//		ex) [1,2,3,5,4,2,7,1,2,3,6,8,1,3,2,6,2,3,1,2]
//		위처럼 배열이 생성된 경우 2는 6개로 가장 많으므로 
//		답변 예시 : '가장 많은 수 : 2, 개수 : 6' 
		
		Random random = new Random();
		int[] arr = new int [20];
		
		for (int i=0; i<arr.length; i++) {
			arr[i] = random.nextInt(10)+1;
			
		}System.out.println(Arrays.toString(arr));
		
		int[] count = new int[11];
		
		for(int i=0; i<arr.length; i++) {
			count[arr[i]]++;
		}System.out.println(Arrays.toString(count));
		
		System.out.println();

		System.out.println("개수 : ");
		for (int i=0; i <=10; i++) {
			System.out.println(i + " : " + count[i] + "개");
			
			if(i != 10) {
				System.out.println(", ");
			}
		}

		System.out.println();
		
		int max = 0;
		int maxNumber = 0;
		
		for(int i=1; i<=10; i++) {
			if(count[i] > max) {
				max = count[i];
				maxNumber = i;
			}
		}
		
		System.out.println("가장 많은 수 : " + maxNumber + ", 개수 : " + max);

	}

}
