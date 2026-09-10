package day9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class _8_과일가게수정1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		System.out.println("====== 과일 가게 프로그램 ======");

		while (true) {
			System.out.println("[ (1) 과일등록 (2) 가격수정 (3) 과일 구매 (그 외) 종료 ] : ");
			int menu = s.nextInt();
			if (menu == 1) {
				HashMap<String, Object> map = new HashMap<>();
				System.out.print("과일이름 : ");
				String name = s.next();
				HashMap<String, Object> fruit = FruitFunc.searchFruit(list, name); // 앞에 반복문 1줄로 바꿈(클래스)
				if(fruit != null) {
					System.out.println("이미 등록된 과일 입니다.");
				} else {
					map.put("name", name);
					

					
					int price = FruitFunc.nonNegative("가격 : ");
					map.put("price", price);
					
					
					int count = FruitFunc.nonNegative("개수 : ");
					map.put("count", count);

					list.add(map);
					System.out.println(list);

				}

				
				
				
				
			} else if (menu == 2) {
				
				System.out.println("수정할 과일 이름 : ");
				String name = s.next();
				HashMap<String, Object> fruit = FruitFunc.searchFruit(list, name);
					
					if (fruit != null) {
						int price = FruitFunc.nonNegative("수정할 가격 입력 : ");
						fruit.put("price", price);
						System.out.println(list);
						break;
						
					} else {
						System.out.println("해당 과일이 없습니다.");
						
					}
					
			}else if (menu == 3) {
				
				System.out.println("구매할 과일 이름 : ");
				String name = s.next();
				HashMap<String, Object> fruit = FruitFunc.searchFruit(list, name);
				if(fruit != null){
					System.out.print("변경 전 : " + fruit);
					
					
					
//					int count = FruitFunc.nonNegative("구매할 과일 개수 : ");
//					while((Integer)fruit.get("count") <= count) {
//						count = FruitFunc.nonNegative("구매할 과일 개수 : ");
//					}
					
					
					int count = 0;
					do {
						count = FruitFunc.nonNegative("구매할 과일 개수 : ");
						
						if((Integer)fruit.get("count") < count) {
							System.out.println("현재 남은 과일의 개수는" + (Integer)fruit.get("count") + "개 입니다.");
						}
						
					} while ((Integer)fruit.get("count") <= count);
					
					
					
					
					
				} else {
					System.out.println("해당 과일이 없습니다.");
				}
				
				
			}
		}
	}

}
