package day7_test;

import java.util.Scanner;

public class Quiz1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

//1. 아래 조건에 맞게 변수 선언 및 초기화 하고 변수를 이용하여 결과를 출력하세요.
//	- 변수명 : name 	 , 값 : 홍길동
//	- 변수명 : age  	 , 값 : 30
//	- 변수명 : addr 	 , 값 : 인천
//출력 결과 : '홍길동의 나이는 30, 주소는 인천 입니다.'
		
		
		String name = "홍길동";
		int age = 30;
		String addr = "인천";
		
		System.out.println(name + "의 나이는 " + age + ", 주소는 " + addr + " 입니다.");
		
		

		
//2. 스캐너를 통해 숫자를 입력받은 후 
//홀수일 경우 "홀수", 짝수일 경우 "짝수"를 출력하세요.
//단, 0이하의 숫자나 11이상의 숫자일 경우 "계산할 수 없습니다." 를 출력하시오.
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		
		int num = scan.nextInt();
		
		
		if (num <0 || num > 11) {
			System.out.println("계산할 수 없습니다.");
		}		
		else if (num % 2 == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
		
		
		
		
		
		
		
	}

}
