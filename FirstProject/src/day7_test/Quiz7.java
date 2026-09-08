package day7_test;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

//7. 크기가 5인 정수형 배열을 선언하고 사용자로부터 숫자를 5개 입력받아 저장하세요.
//그 후, 사용자에게 '검색할 숫자'를 하나 더 입력받습니다. 
//검색한 숫자가 배열에 존재한다면 "해당 숫자는 배열의 O번째에 있습니다." (인덱스 출력)라고 안내하고, 
//존재하지 않는다면 "배열에 없는 숫자입니다."라고 출력하세요.

		
		Scanner scan = new Scanner(System.in);
		int arr[] = new int[5];
		
		for(int i=0; i<arr.length; i++) {
			System.out.print((i+1) + "번째 숫자 입력 : ");
			int input = scan.nextInt();
			arr[i] = input;
		
		}
		System.out.println(Arrays.toString(arr));
		
		Scanner scan2 = new Scanner(System.in);
		
		
		System.out.print("검색할 숫자 : ");
		int search = scan2.nextInt();
		
		
		for(int i=0; i<arr.length; i++) {
		
		if (arr[i] == search) {
			System.out.println((i+1) + "번째에 있습니다.");
			i--;
			break;
			
			
		} else {
		
			System.out.println("배열에 없는 숫자입니다.");
		}
		
		}
		
		
		
		
	}

}
