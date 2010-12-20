package com.gnorsilva.moj._2004.adventureInventoryCase;

/**
 * Abstraction for the player interface in the game. The player types text-command which are analysed
 * in this class and executed on the environment (typically a Room).  
 */

public interface Adventurer {

	/** response indicating all went well. */
	public static final String RESPONSE_OK="Ok.";
	/** response indicating one of the items is not there. */
	public static final String RESPONSE_NOTHERE="NotHere.";
	/** response indicating the command was not understood. */
	public static final String RESPONSE_NOTUNDERSTAND="NotUnderstand.";

	/** words indicating that the user wants to take an object */
	public static final String[] TAKEWORDS=new String[] { "take","fetch","get" };
	/** words indicating that the user wants to drop an object */
	public static final String[] DROPWORDS=new String[] { "drop","leave","dump" };
	/** words indicating that the user wants to do something with all the objects. */
	public static final String[] ALLWORDS=new String[] { "all","everything" };
	/** words indicating that the user wants exclude some objects from the operation. */
	public static final String[] BUTWORDS=new String[] { "except","but" };
	/** words indicating that the user wants include two or more objects. */
	public static final String[] ANDWORDS=new String[] { "and","both" };

	/**
	 * notification that the adventurer has entered a specific room.
	 * @param room the room the adventurer has entered.
	 */
	public void enter(Room room);

	/**
	 * performTakeOrDrop analyses the command string and performs the requested take or drop operation.
	 * @param command the command to analyse and execute.
	 * @return one of the RESPONSE_ constants indicating the result of the operation.
	 */
	public String performTakeOrDrop(String command);

}
