package day8;

public class Fruit {

	private String name;
	private int price;
	
	Fruit(String name, int price){
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	
	
	public boolean equals(Object obj) {
		Fruit p = (Fruit)obj;
		if(name.equals(p.getName()) && price == p.getPrice()) { 
			// 문자열 비교하는거(equals 사용) 잘모름
			return true;
			
		} else {
			return false;
		}
			
	}
	
	
	
	
}
