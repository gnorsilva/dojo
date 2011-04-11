import java.awt.Color;

/**
 * Bitmap holds an image of width x height pixels. Each pixel has
 * a java.awt.Color
 */
public interface Bitmap {

	/** returns the width of the image in pixels. */
	public int getWidth();
	/** returns the height of the image in pixels. */
	public int getHeight();
	
	/** 
	 * returns the color of the pixel at coordinate x,y
	 * @param x the x coordinate of the pixel. 
	 * @param y the y coordinate of the pixel.
	 * @return the color of the specified pixel. 
	 */
	public Color getPixel(int x,int y);
	/** 
	 * sets the color of the pixel at coordinate x,y
	 * @param x the x coordinate of the pixel. 
	 * @param y the y coordinate of the pixel.
	 * @param c the color to set.
	 */
	public void setPixel(int x,int y,Color c);

	/**
	 * makes a copy of the bitmap.
	 * @return a copy of the bitmap.
	 */
	public Bitmap copy();
	
}
