package day6;

public class _3_Static {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tj_Student hong = new Tj_Student("홍길동", 1234, 50000);	
		Tj_Student kim = new Tj_Student("김철수", 9876, 300000);	
		
		kim.money -= 30000;
		// 홍길동의 money는 영향 x, non-static => 공유되지 않는 속성들
		System.out.println(hong.money); 
		
		
		kim.classMoney =+ 100000;
		// static은 공유하는 값이므로 홍길동이 접근했을 때 10만원이 줄어든 상태로 출력
		System.out.println(hong.classMoney);
		
		// static은 클래스 이름으로도 접근이 가능
		// non-static 클래스 이름으로 접근 불가능(객체 생성 후 접근)
// Tj_Student.money = 10; // ==> 누구 money인지 알 수 없음 
		
		Tj_Student.classMoney += 50000;
		System.out.println(Tj_Student.classMoney);
		
		
		kim.classMoneyInfo();

		
		
	}

}
