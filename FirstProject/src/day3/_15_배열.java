package day3;

public class _15_배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 3, 5, 2, 7, 4 };
		// 배열안에 있는 숫자 중에서 가장 큰 숫자가 뭔지 알고 싶어요

		int max = arr[0]; // 마이너스 값일 경우를 대비해 0번째 값을 맥스 시작값으로 줌
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(max);
	}

}
