package ncs.test2;

public class StringTest {

	public static void main(String[] args) {
		String str = "1.22,4.12,5.93,8.71,9.34";
		double data[] = new double[5];
		double sum = 0;
		
		
		String[] st;
		st = str.split(",");
		for(int i = 0; i < data.length; i++) {
			data[i] = Double.parseDouble(st[i]);
		}
		
		for(double value : data) {
			System.out.println(value);
		}
		
		
	}

}
