package test.controller;

public class Test3 {

	public static void main(String[] args) {
		int num = 1;
		double sum = 0, aver;
		while(num < 101) {
			sum += num;
			num++;
		}
		aver = sum / num - 1;
		System.out.printf("합계 : %s\n",sum);
		System.out.printf("평균 : %s\n",aver);
		
	}

}
