/**
 * Thrown whenever the input parameters for the PeanutValidator are incorrect.
 */
public final class NutsException extends Exception {
	
	/** 
	 * always provide a message 
	 */
	public NutsException(String msg) {
		super(msg);
	} 

}
