package day6;

public class Student extends Human {
	// Human이 갖고 있는 멤버들(필드+메소드)를 가지게 된다.
	int stuNo;
	
	// 자식클래스로 객체를 만들면 
	// 따로 지정을 하지 않으면 부모클래스의 '기본 생성자'를 호출한다
	Student(int stuNo){
		this.stuNo = stuNo;
	}
	
	Student(String name, int age, String addr, int stuNo){
		//super()라는 메소드를 통해서 부모의 생성자 선택이 가능 

		super(name, age, addr); 
		this.stuNo = stuNo;
	}
	
	
	void study() {
		System.out.println("공부한다.");
	}
	
	

}
