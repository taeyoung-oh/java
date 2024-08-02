package array;

public class Test10 {

	public static void main(String[] args) {
		int[][] array = {{12, 41, 36, 56}, {82, 10, 12, 61}, {14, 16, 18, 78}, {45, 26, 72, 23}};
		int[] copyAr = new int[array[0].length * array[3].length];
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				if (array[i][j] % 3 == 0) {
					copyAr[i * 4 + j] = array[i][j];
				}
			}
		}
		for(int i = 0; i < 16; i++) {
			for(int j = 15; j >= 0; j--) {
				if(i == j) continue;
				else if(copyAr[i] == copyAr[j]) copyAr[j] = 0;
			}
		}
		System.out.print("copyAr : ");
		for(int i = 0; i < 16; i++) {
			if(copyAr[i] == 0) continue;
			System.out.printf("%d  ",copyAr[i]);
		}
	}

}
