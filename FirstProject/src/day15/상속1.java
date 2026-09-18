package day15;

public class 상속1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person hong = new Person("홍길동", 30, "인천");
		hong.speak();
//		hong.study(); 자식클래스 것 호출 불가능
		
		Student kim = new Student("김철수", 25, "서울", "1234");
		kim.speak();
		kim.study();
		
		String hongInfo = hong.getInfo();
		System.out.println(hongInfo);
		// '홍길동의 나이는 30살 입니다' 출력
		
		String kimInfo = kim.getInfo();
		System.out.println(kimInfo);
		
	}

}
