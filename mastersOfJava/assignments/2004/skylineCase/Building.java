

/**
 * Describes the geometry of a building. For simplicity all buildings are
 * considered 2D boxes with a width and a height. The depth is not taken 
 * into consideration in this system.
 * 
 *                    Width
 *                    <...>
 *                    /---\ ^
 *                    |   | .
 *                    |   | . Height
 * <....Position.....>|   | .
 * -------------------------------------------- Horizon
 */

public interface Building {

	public int getWidth();
	public int getHeight();
	
	public int getPosition();

}
