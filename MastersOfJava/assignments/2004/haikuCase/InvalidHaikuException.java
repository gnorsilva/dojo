/**
 * Thrown whenever a haiku is incorrect.
 */
public final class InvalidHaikuException extends Exception {
	
	/** 
	 * always provide a message 
	 */
	public InvalidHaikuException(String msg) {
		super(msg);
	} 

}
