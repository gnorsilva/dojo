/**
 * SudokuBoard allows the SudokuSolutionChecker to access the boards data
 * without modifying it.   
 */
public interface SudokuBoard {

	/** @returns the width of the board. Should be 9 */
	public int getWidth();
	/** @returns the height of the board. Should be 9 */
	public int getHeight();
	
	/** @returns the character at the specified board position. Should be '1'..'9' */ 
	public char getDigitAt(int x,int y); 

}
