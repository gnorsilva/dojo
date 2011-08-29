/**
 * Racer defines the control interface of a ship equipped with the Binary Acceleration Drive (BAD).
 * At the start of a test run the ships signals the initial position and required target position. 
 * After that it starts running control cycles calling the decide method with the current position, 
 * speed and fuel reserve. 
 * 
 * The implementing algorithm can signal four possible moves : 
 * - GIVEUP   : initiates the self-destruct sequence.
 * - AHEAD    : Accelerates (doubles speed or moves from -1 -> 0 -> 1 using conventional thrusters.
 *              Uses 2 fuel.
 * - REVERSE  : Halves the speed or moves from 1 -> 0 -> -1 using conventional thrusters.
 *              Uses 2 fuel.
 * - DONOTHING: Maintains current speed. Uses 1 fuel.
 * 
 * The finish() method is invoked when the ship reaches its destination at speed -1,0 or 1.  
 */

public interface Racer {

	/** last safe left position */
	public static final int MINES_LEFT=0;
	/** last safe right position */
	public static final int MINES_RIGHT=100000;

	public static final int GIVEUP=0;
	public static final int AHEAD=1;
	public static final int REVERSE=2;
	public static final int DONOTHING=3;

	/**
	 * Invoked at the start of a test run.
	 * @param initialPosition the location on the track where the ship is now. 
	 * @param targetPosition the coordinate on the track where the ship must move to and stop.
	 * @throws RaceOutOfBounds 
	 * @throws RaceOutOfBounds 
	 */
	public void start(int initialPosition,int targetPosition);

	/**
	 * Invoked at each control cycle.
	 * @param currentPosition the position the ship is now at.
	 * @param speed the current speed. A positive speeds means moving forwards.
	 * @param fuel the fuel reserve.
	 * @return one of the four constants defined in this class.
	 */
	public int decide(int currentPosition,int speed,int fuel);
	
	/**
	 * Invoked when the ship reaches its destination.
	 */
	public void finish();

}
