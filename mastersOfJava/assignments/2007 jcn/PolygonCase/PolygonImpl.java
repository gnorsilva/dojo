import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * Implementation class of the Polygon Case.
 */
public class PolygonImpl
{
	/**
	 * Builds a convex polygon of nodes by successive assignment of successors
	 * through calling Node.setNext(Node) appropriately.
	 * 
	 * All remaining nodes must be enclosed by the polygon entirely.
	 * 
	 * @param nodes set of at least 3 nodes, not all lying on the same line
	 * @param lineFactory factory which can be used for creating new lines
	 */
	public void buildPolygon(Set<Node> nodes, LineFactory lineFactory)
	{
		// Create a list of all nodes having a well-defined ordering
		List<Node> list = new ArrayList<Node>(nodes);
		Collections.sort(list);

		// Choose a suitable node to start with
		// Do not exclude the start node from further selection
		Node start = list.remove(0);
		list.add(start);
		
		//
		// Implement Here
		//
	}
}
