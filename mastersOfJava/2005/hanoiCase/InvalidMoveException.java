/**
 * thrown whenever an invalid move is preformed.
 */
public class InvalidMoveException extends Exception {

	public InvalidMoveException() { super(); }
	
	public InvalidMoveException(String msg) { super(msg); }

}
