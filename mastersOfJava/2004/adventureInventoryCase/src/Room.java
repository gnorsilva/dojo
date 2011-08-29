/**
 * A room is a game location where the player can navigate into. A room has a
 * title and a description. Also it can contain items, as it implements the
 * Container interface. By calling the toString() method of the room you
 * get a full description of the room including any items.
 */
public interface Room extends Container {

	/** the title of the room */
	public String getTitle();

	/** the description of the room */
	public String getDescription();

	/** renders a full text description of the room. */
	public String toString();
	
}
