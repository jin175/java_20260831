package day17;

import java.util.Arrays;

public class test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 6. (15점) int arr[] = { 3, 9, 6, 5, 4, 2, 15, 8 } 를 선언한 후 아래 조건과 같이 재배열하여
		// 출력하시오.
		// 조건. 홀수는 홀수번째에서 오름차순, 짝수는 짝수번째에서 내림차순
		// 출력 결과 : {3,8,5,6,9,4,15,2}

		int arr[] = { 3, 9, 6, 5, 4, 2, 15, 8 };

		int oddArr[] = new int[arr.length / 2];
		int evenArr[] = new int[arr.length / 2];
		int oddCount = 0;
		int evenCount = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				evenArr[evenCount] = arr[i];
				evenCount++;
			} else {
				oddArr[oddCount] = arr[i];
				oddCount++;
			}
		}

		Arrays.sort(oddArr);
		Arrays.sort(evenArr);

		int evenIdx = 1;
		int oddIdx = 0;
		for (int i = 0; i < oddArr.length; i++) {
			arr[oddIdx] = oddArr[i];
			oddIdx += 2;
		}
		for (int i = 0; i < evenArr.length; i++) {
			arr[evenIdx] = evenArr[i];
			evenIdx += 2;
		}
		System.out.println(Arrays.toString(arr));
	}
}
