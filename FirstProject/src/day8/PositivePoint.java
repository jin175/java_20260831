package day8;

public class PositivePoint extends Point {
	PositivePoint(){
		super(0, 0);
	}
	
	PositivePoint(int x, int y){
		super(x, y);
	}
	
	
	protected void move(int x, int y) {
		if(x >=0 && y >= 0) {
			super.move(x, y);
		}
	}
	
	public String toString() {
		return "색의 (" + getX() + "," + getY() + ")의 점";
	}
	

}
