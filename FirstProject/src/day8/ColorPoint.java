package day8;

public class ColorPoint extends Point {
	
	
	private String color;
	
	ColorPoint(){
		this(0, 0);
//		super(0,0);
//		this.color = "BLACK";
	}
	
	ColorPoint(int x, int y){
		this(x, y, "BLACK");
	}
	
	
	
	ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}
	
		
	void setXY(int x, int y) {
		move(x, y);
	}
	void setColor(String color) {
		this.color = color;
	}
	
	public String toString() {
		return color + "색의 (" + getX() + "," + getY() + ")의 점";
	}
	
	
//	결과 : RED색의 (10,20)의 점입니다. 
	

	//	public ColorPoint() {
//		super(0,0);
//		color = "BLACK";
//		
//		
//	public ColorPoint(int x, int y) {
//		super()
//	}	
		
	
	
}
	


