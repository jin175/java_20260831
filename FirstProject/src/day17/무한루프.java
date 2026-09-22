package day17;

import java.util.Random;
import java.util.Scanner;

public class 무한루프 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 컴퓨터와 가위바위보
		
		Scanner s = new Scanner(System.in);
		Random ran = new Random();
		
		// 1-> 가위, 2-> 바위, 3-> 보
		// 컴퓨터가 1~3중에 랜덤 숫자 생성
		
		// 사용자는 1~3사이 숫자 입력하기
		int computer = ran.nextInt(3)+1;
		
		System.out.println("[ 1(가위) 2(바위) 3(보) ] : ");
		int player = s.nextInt();
		
		String comChoice = computer == 1 ? "가위" : computer == 2 ? "바위" : "보";
		String playerChoice = player == 1 ? "가위" : player == 2 ? "바위" : "보";
		System.out.println("플레이어 : " + playerChoice + ", 컴퓨터 : " + comChoice);
		
		if(computer == player) {
			System.out.println("비겼다!");
		} else if((player == 1 && computer == 3) || (player == 2 && computer == 1) || (player == 3 && computer == 2)){
			System.out.println("플레이어 윈!");
		} else {
			System.out.println("컴퓨터 윈!");
		}

	}

}
