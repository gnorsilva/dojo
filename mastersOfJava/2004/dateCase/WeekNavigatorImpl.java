import java.util.Date;
import java.util.Calendar;

/**
 * WeekNavitatorImpl : actual implementation of the utility class to 
 * easily navigatate through the weeks. NOTE : For this application a 
 * week starts on monday and ends on sunday.
 */

public class WeekNavigatorImpl implements WeekNavigator {

	private Calendar myCalendar;

	public WeekNavigatorImpl() {
		myCalendar=Calendar.getInstance();
		// ToDo : convince the calendar that the starting 
		//        day of the week is a monday.
	}
	
	/** 
	 * sets the navigator to the specified date. 
	 * If the day of week of the date is not a monday,
	 * it must move to the monday in that week. 
	 */	
	public void set(Date d) {
		// ToDo : Implement 
	}
	/** returns the monday of the current week. */
	public Date get() {
		// ToDo : Implement 
		return null; 
	}
	
	/** returns the current week */
    public int getWeek() {
		// ToDo : Implement
		return 0; 
    }
	/** returns the current month based on the monday of this week */
	public int getMonth() {
		// ToDo : Implement
		return 0; 
	}
	/** returns the current year based on the monday of this week */
    public int getYear() {
		// ToDo : Implement
		return 0; 
    }
    
	/** moves the navigator to the next week. */
	public void nextWeek() {
		// ToDo : Implement
	}
	/** moves the navigator to the next month. */
	public void nextMonth() {
		// ToDo : Implement
	}
	/** moves the navigator to the next year. */
	public void nextYear() {
		// ToDo : Implement
	}
	
	/** moves the navigator to the previous month. */
	public void previousWeek() {
		// ToDo : Implement
	}
	/** moves the navigator to the previous week. */
	public void previousMonth() {
		// ToDo : Implement
	}
	/** moves the navigator to the previous year. */
	public void previousYear() {
		// ToDo : Implement
	}

}
