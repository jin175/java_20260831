package day15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class 컬렉션무한루프 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		System.out.println("====== 포인트 관리 프로그램 ======");
		while(true) {
			System.out.println("[ (1) 회원추가 (2) 확인 (그 외) 종료 ]");
			int menu = s.nextInt();
			
			
			
			
			if(menu == 1) {
				// 이름, 포인트 값(정수) 입력받아서 map 저장 후
				// list에 저장
				// 포인트를 0이하, 10000초과 입력할 경우
				// 1~10000 사이 값을 입력해주세요. 출력 후 다시 입력받도록
				
				HashMap<String, Object> map = new HashMap<>();
				
				System.out.println("이름 : ");
				String name = s.next();
				map.put("name", name);
				
				
				System.out.println("포인트 : ");
				int point = s.nextInt();
				
					if(point > 0 && point<=10000) {
						map.put("point", point);
						list.add(map);
						System.out.println(list);
						break;
						
					}else {
						System.out.println("1~10000 사이 값을 입력해주세요");
					}
				
					
					
				
			} else if(menu == 2) {
				System.out.println(list);
			} else {
				System.out.println("종료되었습니다.");
				break;
			}
			
			
		}
		
	}

}
