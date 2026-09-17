package day14;

import java.util.Arrays;
import java.util.Random;

public class _5_2차원배열_문제 {

public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	Random ran = new Random();	
	int arr[][] = new int [4][4];
	
	for (int i=0; i <= 2; i++) {
		for(int j=0; j <=2; j++) {
		int x = ran.nextInt(10)+1;
		
			
		
//		if(arr[x][y] != 0) {
//			i--;
//			continue;}
			
		 
		arr[i][j] = x;
		}
	}
	int sum = 0;
	for (int i=0; i= arr[i].length; i++) {
		sum += arr[i][j];
	}
	
	
		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		
		}
	
}

}