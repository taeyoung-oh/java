package test.t240704;

import java.util.Scanner;

public class T_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("숫자 : ");
		num = sc.nextInt();
		if (num > 9) System.out.println("9 이하의 숫자만 입력해주세요.");
		
		for (int i = num; i < 10; i++) {
			System.out.printf("=====%d단=====\n", i);
			for(int j = 1; j < 10; j++) {
				System.out.printf("%d * %d = %d\n",i ,j ,i*j);
			}
		}
	}

}
