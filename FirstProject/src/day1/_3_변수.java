package day1;

public class _3_변수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		
		//실수
	//	float//4바이트
		//double//8바이트 -> 명확하게 표현가능하므로, 실수에서는 더블을 씀
		
		
	//	char t = "z" ; // 캐릭터는 한글자만 쓸 수 있음 
	//	String // 따라서 문자는 캐릭터보다는 그냥 스트링씀. 캐릭터도 나중에 유용하게 쓸곳있음
		
	// ------------------------------------------------------------
		
		
		
		int num1 = 100; // +- 21억
		long num2 = 12341234111L; // 그 이상 가능, 21억넘으면 뒤에 'L'붙여야 함(대소문자 상관없음)
		
		float num3 = 1.1234f; // 뒤에 'f' 붙여야 함. 2의 32제곱의 개수 한계로 약간의 오차가 있을 수 있음
		double num4 = 1.1234; // double 써라
		
		// char 변수 값은 숫자랑 매핑이 된다(아스키코드)
		char num5 = 'a' ;
		System.out.println(num5+2);
		
		
		// 학생을 만들어서 출력
		String stuName = "홍길동";
		int age = 20;
		String addr = "인천";
		String phone = "010-1234-1234";
		double stuGrade = 3.93;
		
		System.out.println(stuName + "의 나이는 " + age + ", 학점은 " + stuGrade + "점 입니다." );
		
	}

}
