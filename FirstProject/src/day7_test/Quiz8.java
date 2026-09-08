package day7_test;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Quiz8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//8. 크기가 20인 int형 배열을 생성하고, 1부터 5 사이의 랜덤한 숫자로 배열을 가득 채우세요.
//그 다음, 배열 안에 1, 2, 3, 4, 5가 각각 몇 번씩 등장(생성)했는지 개수를 세어서 출력하세요.
//(출력 예시 => 1: 3번, 2: 1번, 3: 4번, 4: 0번, 5: 2번)

	
		Random ran = new Random();
		int arr[] = new int[20];
		

		for (int i = 0; i < arr.length; i++) {
			arr[i] = ran.nextInt(5) + 1;

		}
		
		System.out.println(Arrays.toString(arr));
		
		
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		int count5 = 0;
		
		for(int i=0; i <=arr.length; i++) {
			
			if (arr[i] == 1) {
				count1 += 1;
				
			}
		}
		
		
		
		
	}

}
