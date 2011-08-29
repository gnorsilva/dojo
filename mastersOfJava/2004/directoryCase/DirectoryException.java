/**
* Thrown when an illegal operation on a Directory takes place
*/
public final class DirectoryException extends Exception {
	/**
	* Constructor
	* @param msg the message thrown when the error occurs
	*/
	public DirectoryException(final String msg) {
		super(msg);
	} 
}
