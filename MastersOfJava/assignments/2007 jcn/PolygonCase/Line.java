import java.awt.Point;

/**
 * This Line represents a line segment in (x,y) coordinate space.
 * 
 * Based on {@link java.awt.geom.Line2D}.
 */
public interface Line extends Cloneable
{
	/**
	 * Returns the start Point of this Line.
	 */
	public Point getP1();

	/**
	 * Returns the end Point of this Line.
	 */
	public Point getP2();

	/**
	 * Returns an indicator of where the specified Point P lies with respect to
	 * this line segment. The return value can be either 1, -1, or 0 and
	 * indicates in which direction the specified line must pivot around its
	 * first end point, P1, in order to point at the specified point P.
	 * 
	 * A return value of 1 indicates that the line segment must turn in the
	 * direction that takes the positive X axis towards the negative Y axis.
	 * In the default coordinate system used by Java 2D, this direction is
	 * counterclockwise.
	 * 
	 * A return value of -1 indicates that the line segment must turn in the
	 * direction that takes the positive X axis towards the positive Y axis.
	 * In the default coordinate system, this direction is clockwise.
	 * 
	 * A return value of 0 indicates that the point lies exactly on the line
	 * segment. Note that an indicator value of 0 is rare and not useful
	 * for determining colinearity because of floating point rounding issues.
	 * 
	 * If the point is colinear with the line segment, but not between the end
	 * points, then the value will be -1 if the point lies "beyond P1" or 1 if
	 * the point lies "beyond P2".
	 * 
	 * @see
	 * 	{@link java.awt.geom.Line2D#relativeCCW(java.awt.geom.Point2D)}
	 */
	public int relativeCCW(Point p);

	/**
	 * Returns the distance from a Point P to this line segment.
	 * 
	 * The distance measured is the distance between the specified point P and
	 * the closest point between the specified end points.
	 * 
	 * If the specified point P intersects the line segment in between the end
	 * points, this method returns 0.0
	 * 
	 * @see
	 * 	{@link java.awt.geom.Line2D#ptSegDist(java.awt.geom.Point2D)}
	 */
	public double ptSegDist(Point p);

	/**
	 * Returns the distance from a Point P to this line.
	 * 
	 * The distance measured is the distance between the specified point P and
	 * the closest point on the infinitely-extended line defined by the
	 * specified coordinates.
	 * 
	 * If the specified point P intersects the line, this method returns 0.0. 
	 * 
	 * @see
	 * 	{@link java.awt.geom.Line2D#ptLineDist(java.awt.geom.Point2D)}
	 */
	public double ptLineDist(Point p);
}
