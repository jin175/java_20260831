package day14;

import java.util.Scanner;

public class Quiz0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.println("금액 : ");
		int money = s.nextInt();
		
		int[] units = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 1};
		
		System.out.println("계산");
		
		for(int i=0; i<units.length; i++) {
			int u = units[i];
			int count = money / u;
			
			System.out.println(u + "원  " + count + "장(개)") ;
			
			money = money % u;
		}
		
		

	}

}
