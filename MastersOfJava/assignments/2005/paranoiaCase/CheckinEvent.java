/**
* An employee checks in a byte stream. This is the time
* to act for the Cyber Police! Make sure that the byte
* stream is legitimate
* @author Robert Bor
*/
public interface CheckinEvent {
	/**
	* Returns the employee doing the checking in
	* @return employee doing the checking in
	*/
	public Employee getEmployee();
	/**
	* Returns the byte stream the employee wants to check in
	* @return the byte stream attempted to check in
	*/
	public CompanyByteStream getByteStream();
}
