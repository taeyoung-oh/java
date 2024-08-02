package ncs.test4;

import java.util.Scanner;

public class ProductTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Product p = new Product();
		String name;
		int price, quantity;
		
		System.out.print("상품명 : ");
		name = sc.next();
		System.out.print("가격 : ");
		price = sc.nextInt();
		System.out.print("수량 : ");
		quantity = sc.nextInt();
		
		p.setName(name);
		p.setPrice(price);
		p.setQuantity(quantity);
		
		System.out.println(p.information());
	}

}
