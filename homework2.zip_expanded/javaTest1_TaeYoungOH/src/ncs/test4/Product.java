package ncs.test4;

public class Product {

	String name;
	int price;
	int quantity;
	
	
	
	public Product() {
		super();
	}
	public Product(String name, int price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	
	
	public String information() {
		String res;
		res = "\n" + "상품명 : " + getName() + "\n" + "가격 : " + getPrice() + " 원" + "\n" + "수량 : " + getQuantity() + " 개" + "\n" + "총 구매 가격 : " + getPrice()*getQuantity() + " 원";
		return res;
		
		
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
