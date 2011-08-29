/**
 * InvalidSolutionException should be thrown whenever an invalid
 * SudokuBoard is encountered. Preferrably with a message.
 */
public class InvalidSolutionException extends Exception {
	
	public InvalidSolutionException() {
		super();
	}
	
	public InvalidSolutionException(String s) {
		super(s);
	}
	 
}
