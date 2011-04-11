import java.awt.Color;

/**
 * Visits the maze, one location at a time. 
 * Allows to navigate through the maze using the move command.
 */

public interface MazeVisitor {

	//
	// Movement
	//
	
	
	/** returns true when the visitor can move to the specified exit. */
	public boolean isFree(Exit x);
	/** moves to the specified exit. */
	public void    move(Exit x);

	//
	// Marking
	//
	
	/** marks the floor of this location with the specified color */
	public void    setMark(Color c);
	/** returns the marked color of this location (unmarked is Color.BLACK) */
	public Color   getMark();
	/** 
	 * uses a powerful flashlight to see the marked color of the room beyond the specified exit.
	 * returns null if there is no room in that direction.
	 */
	public Color   getMark(Exit x);  
	
	//
	// Treasure
	//
	
	/** returns true if the treasure is in this room */
	public boolean hasTreasure();
	/** takes the treasure */
	public Object  getTreasure();
	
	//
	// Exit
	//
	
	/** returns true if this room has the exit */
	public boolean isExit();
	/** 
	 * signals the escape from the maze with the treasure.
	 * This is the last method to be called on the MazeVisitor.
	 */
	public void    leave(Object treasure);
	
}
