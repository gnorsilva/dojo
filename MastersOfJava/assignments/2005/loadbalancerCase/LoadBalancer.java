/**
* The loadbalancer takes care of a number of things
* <ul>
* <li/>dealing with a new server to be handled by the loadbalancer
* <li/>dealing with a server going down
* <li/>dealing with a new user trying to get assigned to a server
* </ul>
*/
public interface LoadBalancer {
	/**
	* A new server comes up. The loadbalancer must make sure this 
	* server is taken up in the equation when assigning new users 
	* to a server.
	* @param server the new server
	*/
	public void serverUp(final Server server);
	/**
	* A server goes down. The loadbalancer must make sure that no
	* user gets assigned to this server.
	* @param server the server going down
	*/
	public void serverDown(final Server server);
	/**
	* A user asks for assignment to a server. The loadbalancer must
	* assign this user to a server, but according to one simple rule:
	* <ul>
	* <li/>all active servers are used in the equation
	* <li/>no server that is down is used in the equation
	* <li/>the loadbalancer aims to balance the number of users on
	* each server
	* <li/>when servers are evenly matched, round robin is used
	* based on the alphabetical order of the server name
	* </ul>
	* @param user user to be assigned to an active server
	*/
	public void assignUser(final User user);
	/**
	* Returns the active servers
	* @return the active servers
	*/
	public Server[] getActiveServers();	
}
