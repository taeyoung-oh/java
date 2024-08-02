package ncs.test3;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateTest {

	public static void main(String[] args) {
		Calendar cal = new GregorianCalendar(1987, 5, 27);
		SimpleDateFormat sim = new SimpleDateFormat();
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH);
		int date = cal.get(Calendar.DATE);
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		String d = "";
		
		switch (dayOfWeek) {
	    case 1:
	        d = "일";
	        break;
	    case 2:
	        d = "월";
	        break;
	    case 3:
	        d = "화";
	        break;
	    case 4:
	        d = "수";
	        break;
	    case 5:
	        d = "목";
	        break;
	    case 6:
	        d = "금";
	        break;
	    case 7:
	        d = "토";
	        break;
	}
		
		System.out.printf("생일 : %d년 %d월 %d일 %s요일\n", year, month, date, d);
		System.out.println("현재 : "  );
	}

}
