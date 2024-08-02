package array;

public class Test8 {

	public static void main(String[] args) {
		int[][] array = {{12, 41, 36, 56}, {82, 10, 12, 61}, {14, 16, 18, 78}, {45, 26, 72, 23}};
		double sum = 0, aver;
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				sum += array[i][j];
			}
		}
		aver = sum / 16;
		
		System.out.printf("합계 : %s\n", sum);
		System.out.printf("평균 : %s", aver);
	}

}
