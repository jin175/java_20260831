package day6;

public class IPTV extends ColorTV {
	String ip;
	IPTV(String ip, int size, int color){
		super(size, color);
		this.ip = ip;
		
	}
	void printProperty() {
		// 나의 iptv는 
		//방법 1.
		System.out.println("나의 IPTV는 " + ip + "주소의 " + getSize() + "인치 " + getColor() + "컬러");
		
		
		// 방법 2.
		System.out.print("나의 IPTV는 " + ip + "주소의 " );
		super.printProperty();
		
	}
	
	
	

}
