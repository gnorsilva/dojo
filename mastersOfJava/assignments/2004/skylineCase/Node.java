

/**
 * Contains a point (x-position,height) on the skyline. 
 */

public class Node {

	private int p;
	private int h;
	
	public Node(int p,int h) {
		this.p=p;
		this.h=h;
	}
	
	public Node(Node n) {
		this.p=n.getPosition();
		this.h=n.getHeight();
	}
	
	public int getPosition() { return p;	}
	public int getHeight() { return h;	}
	
	public boolean equals(Object o) {
		if (o instanceof Node) {
			Node n=(Node)o;
			return ((n.h==this.h)&&(n.p==this.p));
		} else return false;
	}
	public int hashCode() {
		return p<<16+h;
	}

	public String toString() {
		return "("+p+" "+h+")";
	}

}
