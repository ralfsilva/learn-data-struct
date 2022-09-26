package supports;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateSupports {
	public static void main(String[] args) {
		
		// Instantiate a Date object
		// Date date = new Date();
		Date dateNow = new Date();
		
		// Display time and date using toString
		// System.out.println(date.toString());
		System.currentTimeMillis();
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy.MM.dd 'at' hh:mm:ss a zzz");
		SimpleDateFormat sdf2 = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy.MM.dd 'at' hh:mm:ss");
		// SimpleDateFormatCodes - E, a, zzz
		
		System.out.println("Current Date: " + sdf1.format(dateNow));
		System.out.println("Current Date: " + sdf2.format(dateNow));
		System.out.println("Current Date without Simple DateFormat codes: " + sdf3.format(dateNow));
		
		SimpleDateFormat brSdf = new SimpleDateFormat("E dd/MM/yyyy 'às' hh:mm:ss a zzz");
		System.out.println("\nDate/hour in Brazil: " + brSdf.format(dateNow));
		
		System.out.println(System.currentTimeMillis());
		
	}
}
