/**
 * Bitmap holds an monochrome image of width x height pixels. 
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
	 * @return true if the pixel is set. 
	 */
	public boolean getPixel(int x,int y);
	/** 
	 * sets the color of the pixel at coordinate x,y
	 * @param x the x coordinate of the pixel. 
	 * @param y the y coordinate of the pixel.
	 * @param value true if the pixel must be set, false if cleared.
	 */
	public void setPixel(int x,int y,boolean value);
	
}