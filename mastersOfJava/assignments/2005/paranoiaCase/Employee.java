/**
* The employee doing a checkin action
*/
public class Employee {
	/** name of the employee */
	private final String name;
	
	/**
	* Constructor for the employee
	* @param name of the employee
	*/
	public Employee(final String name) {
		this.name = name;	
	}
	/**
	* Returns the name of the employee
	* @return the name of the employee
	*/
	public String getName() {
		return this.name;	
	}
}
