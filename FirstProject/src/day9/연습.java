package day9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class 연습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner s = new Scanner(System.in);
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		System.out.println("====== 과일 가게 프로그램 ======");

		while (true) {
			System.out.println("[ (1) 과일등록 (2) 가격수정 (3) 과일 검색 (그 외) 종료 ] : ");
			int menu = s.nextInt();
			if (menu == 1) {
				// 과일이름, 가격, 개수 입력받아서 map 저장 후
				// list에 저장
				// 단, 동일한 이름의 과일이 이미 있으면
				// '이미 등록된 과일 입니다' 출력 후 다시 메뉴로 이동
		
				
				HashMap<String, Object> map = new HashMap<>();
				System.out.println("과일이름");
				String name = s.next();
				map.put("name", name);
				
				
				
				
				System.out.print("가격 : ");
				int price = s.nextInt();
				map.put("price", price);

				System.out.print("개수 : ");
				int count = s.nextInt();
				map.put("count", count);
				
				list.add(map);
				System.out.println(list);
				
				
				
				
//				while(true) {
//					
//				System.out.print("가격 : ");
//				int price = s.nextInt();
//				
//				
//				if (price > 0) {
//					map.put("price", price);
//					break;
//					
//				} else {
//					continue;
//				}
//				
//				}
				
				
				
			}
	}
	}
}
