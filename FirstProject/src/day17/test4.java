package day17;

public class test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		4.(10점) 아래와 같이 파일명이 문자열로 주어졌을 때, 
//		파일의 확장자(마지막 마침표 . 이후의 문자열)만 추출하는 코드를 작성하시오.
//		(파일명 중간에 마침표가 여러 개 들어갈 수도 있다는 점을 고려해야 합니다.)
//
//		String fileName = "my_project.version2.java";
//		출력 결과 : java

		
		String fileName = "my_project.version2.java";
		int index = fileName.lastIndexOf("."); 
		String result = fileName.substring(index+1);
		System.out.println(result);
		
		
	}
}
