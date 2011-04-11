/**
* A User is a representation of a user who makes use of an application on
* a server. A user identifies herself to the loadbalancer and is then
* assigned to a server.
*/
public class User {
	/** Counter that maintains the last used unique identifier */
	private static int counter = 0;
	/** Unique identifier for the User. Not used in equals */
	private final int uniqueId;
	/** Name of the user. Guaranteed to be unique */
	private final String name;
	
	/**
	* Constructor
	* @param name name of the user
	*/
	public User(final String name) {
		this.name = name;
		counter++;
		uniqueId = counter;
	}
	/**
	* Returns the name of the user
	* @return name of the user
	*/
	public String getName() {
		return this.name;
	}
	/**
	* Returns true if two users have the same name
	* @return true; the users have the same name
	* false; either are not both users or do not have the same name
	*/		
	public boolean equals(Object o) {
		if (o == null) {
			return false;	
		}	
		if (!(o instanceof User)) {
			return false;	
		}
		User matchUser = (User)o;
		return this.name.equals(matchUser.name);
	}
	/**
	* Returns the hashCode of the name
	* @return hashcode of the name
	*/
	public int hashCode() {
		return this.name.hashCode();	
	}
}
