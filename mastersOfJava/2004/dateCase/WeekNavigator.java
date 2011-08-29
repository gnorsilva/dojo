import java.util.Date;

/**
 * WeekNavitator : utility class to easy navigation through the weeks.
 * For this application a week starts on monday and ends on sunday.
 */

public interface WeekNavigator {

	/** 
	 * sets the navigator to the specified date. 
	 * If the day of week of the date is not a monday,
	 * it must move to the monday in that week. 
	 */
	public void set(Date t);

	/** moves the navigator to the previous year. */
    public void previousYear();
	/** moves the navigator to the previous month. */
	public void previousMonth();
	/** moves the navigator to the previous week. */
	public void previousWeek();	

	/** returns the current year based on the monday of this week */
	public int  getYear();
	/** returns the current week based on the monday of this week */
	public int  getWeek();
	/** returns the monday of the current week. */
	public Date get();

	/** moves the navigator to the next week. */
	public void nextWeek();
	/** moves the navigator to the next month. */
	public void nextMonth();
	/** moves the navigator to the next year. */
	public void nextYear();

}
