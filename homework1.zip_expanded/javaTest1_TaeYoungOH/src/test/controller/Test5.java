package test.controller;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		
		System.out.print("입력 : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		if(1 <= num1 && num1 <=9 && 1 <= num2 && num2 <=9) {
			if((num1 * num2) < 10) System.out.println("한자리 수 입니다.");
			else System.out.println("두자리 수 입니다.");
		}

	}

}
