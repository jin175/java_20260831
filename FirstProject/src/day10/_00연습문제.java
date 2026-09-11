package day10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

public class _00연습문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		# 20개의 공간을 가지는 배열을 생성하고, 랜덤한 숫자 1~10사이의 값을 20개의 공간에 모두 넣으시오.
//
//		2) 각 숫자의 개수를 출력하시오.
//		답변 예시 : '1 : 6개, 2 : 3개, 3 : 5개, ... 10 : 2개'
//
//		2) 중복된 숫자가 가장 많은 수의 숫자와 개수를 출력하시오.
//		ex) [1,2,3,5,4,2,7,1,2,3,6,8,1,3,2,6,2,3,1,2]
//		위처럼 배열이 생성된 경우 2는 6개로 가장 많으므로 
//		답변 예시 : '가장 많은 수 : 2, 개수 : 6' 
		
		
		Random ran = new Random();
		int arr[] = new int[20]; 
		
		for(int i=0; i<arr.length; i++) {
			int ranNum = ran.nextInt(10)+1;
			arr[i] = ranNum;
			
		}
		
		System.out.println(Arrays.toString(arr));
		
		// 중복된 숫자개수 
		
		

//		for(int i=0; i<list.size(); i++ ) {
//			
//			HashMap<String, Object> student = list.get(i);
//			int total = (Integer)student.get("java") + (Integer)student.get("db") + (Integer)student.get("html");
//			int rank = 1;
//			
//			
//			for(int j=0; j<list.size(); j++) {
//				
//				HashMap<String, Object> otherStudent = list.get(j);
//				int otherTotal = (Integer)otherStudent.get("java") + (Integer)otherStudent.get("db") + (Integer)otherStudent.get("html");	
//				
//				
//				if(total < otherTotal) {
//					rank++;
//				}
//				
//				
//			}System.out.println(rank + "등");
//			
//			
//			
//		}
//		
		
		
		
		
		
		
		
		

	}

}
