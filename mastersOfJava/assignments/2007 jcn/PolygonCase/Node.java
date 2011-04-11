import java.awt.Point;

/**
 * A node representing a location in (x,y) coordinate space, specified in
 * integer precision.
 */
public class Node extends Point implements Comparable<Node>
{
	private Node next;

	/**
	 * Constructs and initializes a node at the specified (x,y) location in the
	 * coordinate space
	 */
	public Node(int x, int y)
	{
		super(x, y);
	}

	/**
	 * Returns the successor node if any.
	 */
	public Node getNext()
	{
		return this.next;
	}

	/**
	 * Assigns a successor node.
	 */
	public void setNext(Node node)
	{
		if (this == node)
		{
			throw new IllegalArgumentException("node cannot be its own successor");
		}
		
		this.next = node;
	}

	/**
	 * Compares this node with the specified node for order. Compares by x
	 * coordinate and y coordinate respectively.
	 */
	@Override
	public int compareTo(Node obj)
	{
		Node node = (Node) obj;

		int result = this.x - node.x;
		if (result == 0)
		{
			result = this.y - node.y;
		}

		return result;
	}
}
