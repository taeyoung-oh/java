package array;

public class Test9 {

	public static void main(String[] args) {
		int[][] array = {{12, 41, 36, 56}, {82, 10, 12, 61}, {14, 16, 18, 78}, {45, 26, 72, 23}};
		int max = 0, min = 999;
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				if(array[i][j] > max) max = array[i][j];
				if(array[i][j] < min) min = array[i][j];
			}
		}
		System.out.printf("가장 큰 값 : %d\n",max);
		System.out.printf("가장 작은 값 : %d",min);
		
	}

}
