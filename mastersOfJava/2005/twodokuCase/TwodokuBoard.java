

/**
 * Describes the Twodoku Board. 
 */
public interface TwodokuBoard {

	/** indicates an empty position on the board */
	public static final int EMPTY=-1;
	/** the lowest digit on the board */
	public static final int MIN_DIGIT=0;
	/** the highest digit on the board */
	public static final int MAX_DIGIT=3;

	/** thrown whenever an invalid move is attempted on the board */
	public static class InvalidMoveException extends Exception {
		public InvalidMoveException() { super(); }
		public InvalidMoveException(String s) { super(s); }
	}

	/** returns the width of the board which is 4 */
	public int getWidth();
	/** returns the height of the board which is 4 */
	public int getHeight();
	
	/** returns true if the specified cell is empty */
	public boolean isEmpty(int x,int y);
	
	/** returns the digit on the specified cell */
	public int getDigit(int x,int y);
	/** 
	 * sets the specified digit (or EMPTY) on the specified cell.
	 * @param x the x coordinate.
	 * @param y the y coordinate.
	 * @param digit the value to set to that position. 
	 * @throws InvalidMoveException if an illegal move is attempted. 
	 */
	public void setDigit(int x,int y,int digit) throws InvalidMoveException;
	
	/** converts the specified coordinates to a block */
	public int toBlock(int x,int y);
	
	/** Gets (a copy of) the values of a single row */
	public int[] getRow(int row);
	/** Gets (a copy of) the values of a single column */
	public int[] getColumn(int col);
	/** 
	 * Gets (a copy of) the values of a single block. The block is translated 
	 * to the array as follows : top-left, top-right, bottom-left, bottom-right.   
	 */
	public int[] getBlock(int block);

	/** 
	 * returns a boolean array with one element for each digit. The element
	 * for that digit is true if that digit is used in the specified row. 
	 */ 
	public boolean[] getUsedDigitsForRow(int row);
	/** 
	 * returns a boolean array with one element for each digit. The element
	 * for that digit is true if that digit is used in the specified column. 
	 */ 
	public boolean[] getUsedDigitsForColumn(int column);
	/** 
	 * returns a boolean array with one element for each digit. The element
	 * for that digit is true if that digit is used in the specified block. 
	 */ 
	public boolean[] getUsedDigitsForBlock(int block);

	/**
	 * returns true if the Tudoku is solved. 
	 */
	public boolean isSolved();

}
