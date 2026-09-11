package day10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Score {
	
static Scanner s = new Scanner(System.in);
	
	static HashMap<String, Object> search (ArrayList<HashMap<String, Object>> list, String stuNo) {
		
		for(int i=0; i<list.size(); i++) {
			HashMap<String, Object> stu = list.get(i);
			if(stuNo.equals(stu.get("stuNo"))) {
				return stu;
			}
		}
		return null;
	}
	
	

}
