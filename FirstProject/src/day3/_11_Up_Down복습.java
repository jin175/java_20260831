package day3;

import java.util.Random;
import java.util.Scanner;

public class _11_Up_Down복습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		System.out.println("Up&Down 게임을 시작합니다!");
		
		int ranNum = ran.nextInt(100)+1;
		int count = 0;
				
				
		for(;;) {
			count++;
			System.out.println(count + "번째 시도 : ");
			int answer = scan.nextInt();
			
			if (answer < 1 || answer > 100) {
				System.out.println("1~100사이의 값을 입력해주세요");
				count--;
			}else if (ranNum == answer) {
				System.out.println(count + "번째 정답을 맞추셨습니다"  );
				break;
			}
			else if(ranNum > answer) {
				System.out.println("Up");
				} else {
					System.out.println("Down");
			}
			
			
		}
		
		
		
		
		
	}

}
