/**
 * AaiBot describes the control interface of the cute AaiBot.
 * The robot can be controlled by sending move or turn commands. 
 * It has 2 sensors, a light sensor in the center of the robot and a 
 * bumper on the front. 
 */

public interface AaiBot {
	
	/** 
	 * constant indicating the optimal moving distance of the AaiBot 
	 */
	public static final int OPTIMAL_MOVE=16;
	
	/**
	 * @return true if the AaiBot is on its start tile.
	 */	
	public boolean isStart();
	/**
	 * @return true if the AaiBot has returned home.
	 */	
	public boolean isHome();
	/**
	 * @return true if the robot is on a light tile.
	 */
	public boolean isOnLightTile();
	/**
	 * @return true if the robot is on a dark tile.
	 */
	public boolean isOnDarkTile();
	
	/** 
	 * @return true if the bumper is pressed (i.e. the front of the robot
	 * has crashed into a wall.)
	 */
	public boolean isBumperPressed();
	
	/** 
	 * instructs the robot to move amount steps. The movement stops when the 
	 * specified amount is moved or a sensor detects a change.
	 * @param amount the amout to move ahead (positive) or backwards (negative) 
	 * @return int the amount actually turned. 
	 */
	public int move(int amount);

	/** 
	 * instructs the robot turn amount degrees. The turning stops when the 
	 * specified amount is moved or a sensor detects a change.
	 * @param degrees the nr of degrees to turn right (positive) or left (negative)
	 * @return int the amount actually turned. 
	 */ 
	public int turn(int degrees);
	
}
