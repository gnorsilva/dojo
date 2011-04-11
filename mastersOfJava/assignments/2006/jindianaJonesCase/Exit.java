/**
 * represents the four possible exits from a room inside the maze. 
 */

public enum Exit {

	NORTH,EAST,SOUTH,WEST;
	
	/** returns the opposite exit of the current one */
	public Exit opposite() {
		switch (this) {
		case NORTH: return SOUTH;
		case SOUTH: return NORTH;
		case WEST: return EAST;
		case EAST: return WEST;
		default: return null;
		}
	}
	
	/** returns the exit right of the current one */
	public Exit right() {
		switch (this) {
		case NORTH: return EAST;
		case EAST: return SOUTH;
		case SOUTH: return WEST;
		case WEST: return NORTH;
		default: return null;
		}
	}

	/** returns the exit left of the current one */
	public Exit left() {
		switch (this) {
		case NORTH: return WEST;
		case WEST: return SOUTH;
		case SOUTH: return EAST;
		case EAST: return NORTH;
		default: return null;
		}
	}

}
