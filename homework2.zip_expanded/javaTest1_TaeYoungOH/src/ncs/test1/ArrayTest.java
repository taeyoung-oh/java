package ncs.test1;

public class ArrayTest {

	public static void main(String[] args) {
		int[][] array = {{12,41,36,56,21}, {82,10,12,61,45}, {14,16,18,78,65}, {45,26,72,23,34}};
		double sum = 0, avg;
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 5; j++) {
				sum += array[i][j];
			}
		}
		
		avg = sum /20;
		System.out.printf("합계 : %.2f\n", sum);
		System.out.printf("평균 : %.2f\n", avg);
		
	}

}
