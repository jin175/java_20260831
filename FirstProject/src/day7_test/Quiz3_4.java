package day7_test;

import java.util.Scanner;

public class Quiz3_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//3. 2이상 9이하의 숫자를 입력받은 후 해당 숫자의 구구단을 출력하세요.
				//2~9사이 숫자가 아닐경우 '잘못 입력된 숫자 입니다'를 출력 후 종료해주세요.
						
				
		
		Scanner scan = new Scanner(System.in);
		System.out.print("몇 단 : ");
		
		int x = scan.nextInt();	
		
		if(x >= 2 && x <= 9) {
		
			System.out.println("=====" + x + "단 =====");
			for (int j = 1; j <= 9; j++) {
				System.out.println(x + " * " + j + " = " + (x * j));
			}
		
		} else {
			System.out.println("잘못 입력된 숫자 입니다");
			}
		
		
		

//		4. 1에서 50 사이의 숫자를 하나 입력받습니다.
//		만약 사용자가 1~50 범위를 벗어난 숫자를 입력하면, 올바른 범위의 숫자를 입력할 때까지 계속해서 다시 입력받도록 안내문을 띄웁니다. 
//		올바른 숫자가 입력되면 종료합니다.
		
		
		
		
		
		Scanner scan2 = new Scanner(System.in);
			
		
		for(;;) {
			System.out.print("숫자 입력 : ");
			int y = scan2.nextInt();	
			if (y<1 || y>50) {
				System.out.println("다시 입력하세요");
			}else {
				break;
			}
		}
		
		
		
		
		
		
	}

}
