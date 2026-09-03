package day4;

public class _8_객체생성 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 첫글자가 대문자(약속) => 클래스
		
		// 정보처리기사(산업기사)
		// sqld (데이터베이스 다루는 방법) - 노랭이책
		// 리눅스마스터2급
		
		int num = 10;
		Human hong = new Human();
		hong.name = "홍길동";
		
		Human kim = new Human();
		kim.name = "김철수";
		
		Human park = new Human();
		
		
		System.out.println(hong.name); // 홍길동
		System.out.println(kim.name); // 김철수
		
		
		hong.eat();
		kim.eat();
		
		hong.walk(1.0);
		
		
	}

}
