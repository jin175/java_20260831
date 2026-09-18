package day15;

import java.util.HashMap;
import java.util.Scanner;

public class HashMap예제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 스캐너로 학번, 이름, 자바점수, db점수 입력받아서 
		// map(hong)에 저장
		// 키는 순서대로 'stuNo, name, java, db'로 저장

		HashMap<String, Object> hong = new HashMap<>();
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("학번 : ");
		String stuNo = s.next();
		hong.put("stuNo", stuNo);
		
		System.out.println("이름 : ");
		String name = s.next();
		hong.put("name", name);
		
		System.out.println("자바점수 : ");
		String java = s.next();
		hong.put("java", java);
		
		System.out.println("db점수 : ");
		String db = s.next();
		hong.put("db", db);
		
		System.out.println(hong);
		
	}

}
