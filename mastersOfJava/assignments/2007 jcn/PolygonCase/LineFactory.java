import java.awt.Point;

/**
 * This Factory class can be used to instantiate new Lines.
 */
public interface LineFactory
{
	/**
	 * Constructs and initializes a Line from the specified Point objects
	 * 
	 * @param p1 - the start Point of this line segment
	 * @param p2 - the end Point of this line segment
	 */
	Line newLine(Point p1, Point p2);
}
