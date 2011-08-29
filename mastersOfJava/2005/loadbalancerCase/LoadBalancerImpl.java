import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/**
* Implementation of the LoadBalancer interface. This implementation
* will have to be completed by the Masters of Java entrant
*/
public class LoadBalancerImpl implements LoadBalancer {
	// IMPLEMENT HERE

	/**
	* Constructor
	*/	
	public LoadBalancerImpl() {
		// IMPLEMENT HERE
	}
	/**
	* A new server comes up. The loadbalancer must make sure this 
	* server is taken up in the equation when assigning new users 
	* to a server.
	* @param server the new server
	*/
	public void serverUp(final Server server) {
		// IMPLEMENT HERE
	}
	/**
	* A server goes down. The loadbalancer must make sure that no
	* user gets assigned to this server. Reassigns users.
	* @param server the server going down
	*/
	public void serverDown(final Server server) {
		// IMPLEMENT HERE
	}
	/**
	* A user asks for assignment to a server. The loadbalancer must
	* assign this user to a server, but according to a set of rules:
	* <ul>
	* <li/>all active servers are used in the equation
	* <li/>no server that is down is used in the equation
	* <li/>the loadbalancer aims to balance the number of users on
	* each server
	* <li/>when servers are evenly matched, round robin is used
	* based on the alphabetical order of the server name
	* <li/>users that are on a downed server are out of luck; they
	* will either be reassinged by the scenario or not at all
	* </ul>
	* @param user user to be assigned to an active server
	*/
	public void assignUser(final User user) {
		// IMPLEMENT HERE
	}
	/**
	* Returns the active servers
	* @return the active servers
	*/
	public Server[] getActiveServers() {
		// IMPLEMENT HERE
		return null;
	}
}
