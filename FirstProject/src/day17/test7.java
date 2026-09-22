package day17;

import java.util.ArrayList;
import java.util.Comparator;

public class test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		7. (15점) 아래와 같이 리스트를 선언하고, 리스트에 있는 텍스트를 사전순으로 재정렬하여 출력하시오.
//		(새로운 리스트를 만들어도 상관 없음)(패키지 pdf파일 28페이지 참고)
//		ArrayList<String> list = new ArrayList<>();
//		list.add("java");
//		list.add("mysql");
//		list.add("css");
//		list.add("html");
//		list.add("oracle");
		
		
		ArrayList<String> list = new ArrayList<>();
		list.add("java");
		list.add("mysql");
		list.add("css");
		list.add("html");
		list.add("oracle");
		
		list.sort(Comparator.naturalOrder());
		System.out.println(list);
		
	}
}
