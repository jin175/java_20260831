package day7;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class _test연습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		1. 1부터 100까지의 숫자 중 5의 배수이지만 8의 배수는 아닌 숫자들만 화면에 출력하고, 
//		마지막에 그 숫자들의 총 개수를 출력하세요.
		
		int count = 0;
		for(int i=1; i<=100; i++) {
			if(i %5 == 0 && i % 8 != 0) {
				System.out.print(i);
				count++;
			}
			
		}
		
		System.out.println("총 개수 : " + count);
		
		
		
//
//		2. 크기가 5인 정수형 배열을 만들고 1부터 100사이의 랜덤한 숫자 5개를 넣습니다.
//		이후 배열의 숫자들 중에서 '홀수'만 찾아내어 출력하고, 마지막에 홀수가 총 몇 개 입력되었는지 카운트하여 출력하세요.
		
		
		Random ran = new Random();
		int arr[] = new int[5];
		for(int i=0; i<arr.length; i++) { 
			int ranNum = ran.nextInt(100) + 1;
			arr[i] = ranNum; 
			for(int j=0; j<i; j++) {
				if(ranNum == arr[j]) {
					i--;
					break;
				}
			}
			
	
		}
		System.out.println(Arrays.toString(arr));
		
		
//
//		3. 크기가 5인 정수형 배열을 선언하고 사용자로부터 5개의 숫자를 입력받아 저장하세요.
//		그 후, 배열에 저장된 숫자들을 입력받은 순서의 반대(역순)로 화면에 출력하세요.
//		( Arrays.sort() 필요하다면 사용해도되고 안해도 되고.. )
//		(예: 10, 20, 30, 40, 50 순으로 입력했다면 50, 40, 30, 20, 10 순으로 출력되어야 합니다.)
		
		
		Scanner scan = new Scanner(System.in);
		
		int arr1[] = new int[5];
		
		
		for(int i=0; i<arr1.length; i++) {
			arr1[i] = scan.nextInt();
		}
		
		Arrays.sort(arr1);
		for(int i = arr1.length-1; i>=0; i--) {
			System.out.println(arr1[i]);
		}
		
		System.out.println(Arrays.toString(arr1));
		
//
//		4. Random 클래스를 활용하여 컴퓨터와 사용자의 '주사위 게임'을 만드세요.
//		컴퓨터와 사용자가 각각 주사위(1~6 사이의 랜덤한 수)를 3번씩 던집니다(반복문 활용). 3번 던져서 나온 눈의 총합을 각각 구한 뒤, 총합이 더 큰 쪽이 승리합니다. 
//		최종적으로 "컴퓨터 총합: O점, 사용자 총합: O점"을 출력하고 승자(컴퓨터 승리 / 사용자 승리 / 무승부)를 출력하세요.

		
		Scanner sc = new Scanner(System.in);
		
		int com = 0;
		int user = 0;
		
		for(int i=0; i<3; i++) {
			System.out.println("컴퓨터 주사위 숫자 입력 : ");
			com += sc.nextInt();
			System.out.println("사용자 주사위 숫자 입력 : ");
			user += sc.nextInt();
		}
			
		System.out.println("컴퓨터 총합 : " + com);
		System.out.println("사용자 총합 : " + user);
		
		if(com > user) {
			System.out.println("컴퓨터 승리");
		} else if (com < user) {
			System.out.println("사용자 승리");
		} else {
			System.out.println("무승부");
		}
		
		
		
	}

}
