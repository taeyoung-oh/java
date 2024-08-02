package com.calc;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int argument1, argument2;
		
		System.out.print("정수1 : ");
		argument1 = sc.nextInt();
		System.out.print("정수2 : ");
		argument2 = sc.nextInt();
		
		if(1 <= argument1 && argument1 <= 9 && 1 <= argument2 && argument2 <= 9) {
			System.out.printf("합 : %d\n", argument1 + argument2);
			System.out.printf("차 : %d\n", argument1 - argument2);
			System.out.printf("곱 : %d\n", argument1 * argument2);
			System.out.printf("나누기 : %d\n", argument1 / argument2);
		}
		
		
	}

}
