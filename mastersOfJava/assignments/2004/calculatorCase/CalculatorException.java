/**
 * Thrown whenever the input parameters for the Calculator are incorrect.
 */
public final class CalculatorException extends Exception {
	
	/** 
	 * always provide a message 
	 */
	public CalculatorException(String msg) {
		super(msg);
	} 
}
