/**
* Maintains the users logged in to the server. 
* @author Robert Bor
*/
public interface Server extends Comparable {
	/**
	* Returns the name of the server
	* @return name of the server
	*/
	public String getName();
	/**
	* Returns whether the server is available or not
	* @return true; server is up / false; server is down
	*/
	public boolean isUp();
	/**
	* Returns whether the server is down or not
	* @return true; server is down / false; server is up
	*/
	public boolean isDown();
	/**
	* Adds a new user to the server
	* @param user user to be added to the server
	*/
	public void assignUser(final User user);
	/**
	* Removes a user from the server (eg, after logoff)
	* @param user user to be removed
	*/
	public void removeUser(final User user);
	/**
	* Returns the number of active users on the server
	* @return the number of active users on the server
	*/
	public int getNumberOfUsers();
	/**
	* Returns the active users on the server
	* @return the active users on the server
	*/
	public User[] getUsers();
}
