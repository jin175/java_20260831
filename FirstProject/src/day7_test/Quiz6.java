package day7_test;

import java.util.Arrays;
import java.util.Random;

public class Quiz6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		6. 크기가 10인 정수형 배열을 생성하고, 반복문을 사용하여 1부터 100 사이의 랜덤한 값으로 배열을 가득 채우세요.
//		단, 마지막 숫자가 3으로 끝나는 숫자는 넣으면 안됩니다.(예 => 3, 13, 23 .. 93).
//		최종 결과를 Arrays.toString() 메소드를 통해 출력해주세요.

		Random ran = new Random();
		int arr[] = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = ran.nextInt(100) + 1;

			if (arr[i] % 10 == 3) {
				i--;
			}
		}
		System.out.println(Arrays.toString(arr));

	}

}
