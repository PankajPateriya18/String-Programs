package dataApi;

import java.time.LocalDate;
import java.util.Date;

public class ConvertStringIntoDate {

	public static void main(String[] args) {

		

//		LocalDate locaDate = LocalDate.parse("17-nov-2023");
//		System.out.println(LocalDate.now());
//		
//		try {
//			String startDateString = "17-nov-2023";
//			DateFormat df = new SimpleDateFormat("dd-m-yyyy");
//			Date startDate = (Date) df.parse(startDateString);
//		}catch(Exception e) {
//			e.printStackTrace();
		
		
//		}
		
//		String date = "2016/04/26";
//        Date enteredDate = null;
//        Date matcher = null;
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
//        try {
//            enteredDate = (Date) sdf.parse(date);
//        } catch (Exception ex) {
//            ex.printStackTrace();// enteredDate will be null if date="287686";
//        }
//
//        try {
//            matcher = (Date) sdf.parse("2016/04/26");
//        } catch (ParseException e) {
//            // TODO Auto-generated catch block
//            // e.printStackTrace();
//        }
//
//        if (enteredDate.compareTo(matcher) == 0) {
//            System.out.println("enteredDate will be null");
//        }

//        Date currentDate = new Date();
//        if (enteredDate.after(currentDate)) {
//            System.out.println("after ");
//        } else
//            System.out.println("before");
//		
//		Date date = new 
//		System.out.println(date);
		
		
		/*	after(Date when)
Tests if this date is after the specified date.
boolean	before(Date when)
Tests if this date is before the specified date.
Object	clone()
Return a copy of this object.
int	compareTo(Date anotherDate)
Compares two Dates for ordering.
boolean	equals(Object obj)
Compares two dates for equality.
static Date	from(Instant instant)
Obtains an instance of Date from an Instant object.
int	getDate()
Deprecated. 
As of JDK version 1.1, replaced by Calendar.get(Calendar.DAY_OF_MONTH).
int	getDay()
Deprecated. 
As of JDK version 1.1, replaced by Calendar.get(Calendar.DAY_OF_WEEK).
int	getHours()
Deprecated. 
As of JDK version 1.1, replaced by Calendar.get(Calendar.HOUR_OF_DAY).
int	getMinutes()
Deprecated. 
As of JDK version 1.1, replaced by Calendar.get(Calendar.MINUTE).
int	getMonth()
Deprecated. 
As of JDK version 1.1, replaced by Calendar.get(Calendar.MONTH).
int	getSeconds()
Deprecated. 
As of JDK version 1.1, replaced by Calendar.get(Calendar.SECOND).*/
		
		LocalDate date = LocalDate.now();  
		LocalDate yesterday = date.minusDays(1);    
	    LocalDate tomorrow = yesterday.plusDays(2);    
	    System.out.println("Today date: "+date);    
	    System.out.println("Yesterday date: "+yesterday);    
	    System.out.println("Tomorrow date: "+tomorrow);    
	    
	    LocalDate date1 = LocalDate.of(2017, 1, 13);    
	    System.out.println("Leap Year : " + date1.isLeapYear());    
	    LocalDate date2 = LocalDate.of(2016, 9, 23);    
	    System.out.println("Leap Year : " + date2.isLeapYear()); 
	    
	    String dInStr = "2011-09-01";  
        LocalDate d1 = LocalDate.parse(dInStr);  
        System.out.println("String to LocalDate : " + d1);  
        // Example 2  
        String dInStr2 = "2015-11-20";  
        LocalDate d2 = LocalDate.parse(dInStr2);  
        System.out.println("String to LocalDate : " + d2);  
		
		
		
        Date d = new Date();
        Date d3 = new Date(d.getTime() - 1000*60*60*24);
        System.out.println(d3);
        System.out.println(d.getDate());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
