package day7_test;

import java.util.Random;
import java.util.Scanner;

public class Quiz9 {
	
	
	static Scanner s = new Scanner(System.in);
	static Random ran = new Random();
	
	static Scanner t = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		

//		9. 홀짝 맞추기 게임을 만들어주세요. 랜덤으로 생성되는 숫자의 범위는 1~100 사이 값 입니다.
//		1번 메뉴로 들어가면 5문제를 출제하며, 선택한 답변에 따라 정답 및 오답을 출력합니다.
//		2번 메뉴를 선택하면 종료되며, 그 외의 값을 입력하면 다시 입력하도록 유도합니다.
//		자세한 내용을 아래 이미지를 참고해주세요.
//		
	
	
		int ranNum = ran.nextInt(100) + 1;
		
		System.out.println("[1. 홀짝 게임 시작, 2. 종료] : ");
		int inputNum = s.nextInt();
		if(inputNum == 1) {
			System.out.println("====== 홀짝 맞추기 게임을 시작합니다(5라운드) ======");
			
			
			int corr = 0;
			
			for(int i=0; i<5; i++) {
				
				int ranNum2 = ran.nextInt(100) + 1;
			
			System.out.println("[" + (i+1) + "라운드] 컴퓨터가 숫자를 뽑았습니다! [1. 홀수, 2. 짝수]");
			int num = t.nextInt();
			
			
			
			if(ranNum2 %2 == 0 && num == 2) {
				System.out.println("정답입니다! (컴퓨터가 뽑은 숫자 : " + ranNum2 + ")");
				corr++;
				
			} else if(ranNum2 %2 != 0 && num == 1){
				System.out.println("정답입니다! (컴퓨터가 뽑은 숫자 : " + ranNum2 + ")");
				corr++;
			}else {
				System.out.println("틀렸습니다 (컴퓨터가 뽑은 숫자 : " + ranNum2 + ")");
			}
			
			}
			System.out.println("총 5문제 중" + corr + "개 맞추셨습니다.");
			
		} else {
			System.out.println("종료되었습니다.");
		}
	
	
	
	
	
	
	
	}
	}