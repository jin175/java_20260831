package day8;

public class _5_Equals문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Fruit apple1 = new Fruit("사과", 1000);
		Fruit apple2 = new Fruit("사과", 1000);
		Fruit banana = new Fruit("바나나", 500);

		if(apple1.equals(apple2)) {
			System.out.println("같은 과일 입니다!"); // 출력
		} 

		if(apple1.equals(banana)) {
			System.out.println("같은 과일 입니다!"); // 미출력
		} 
		
		

	}

}
