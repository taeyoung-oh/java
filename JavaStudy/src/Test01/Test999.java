package Test01;

import java.net.InetAddress;
import java.util.Arrays;
import java.util.Scanner;

public class Test999 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//방법1
		int arr1[] = {1, 2, 3, 4};
		int arr2[] = new int[4];
		for(int i = 0; i < arr2.length; i++) {
			arr2[i] = arr1[i];
			System.out.printf("%d ", arr2[i]);
		}
		//방법2
		System.arraycopy(arr1, 0, arr2, 0, arr1.length);
		//방법3
		arr2 = Arrays.copyOf(arr1, arr1.length);
		//방법4
		arr2 = arr1.clone();
		InetAddress.getLocalHost();
	}
	
}