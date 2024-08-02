package test.controller;

public class Test2 {

	public static void main(String[] args) {
		for(int i = 2; i <= 5; i++) {
			for(int j = 1; j < 10; j++) {
				if (i % 2 == 1 && j % 2 ==1) System.out.printf("%d * %d = %d\n",i , j, i*j);
			}
		}
		
		
	}

}
