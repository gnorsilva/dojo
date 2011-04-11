//------------------------------------------------------------------------------
// Author   : Ronald van Eijck
// Copyright: (c) 16-sep-2007 Ronald van Eijck
//------------------------------------------------------------------------------

/**
 * Deze interface geeft toegang tot de puzzel data
 */
public interface Puzzel
{
	/**
	 * Vraag letter op uit de puzzel op locatie x, y.
	 * 
	 * @param x X-Coordinaat van de letter [0 .. width>
	 * @param y Y-Coordinaat van de letter [0 .. height>
	 * @return Letter op de opgegeven coordinaat
	 */
	public char getLetter(int x, int y);

	/**
	 * Breedte van de puzzel.
	 *  
	 * @return breedte van de puzzel
	 */
	public int getWidth();
	
	/**
	 * Hoogte van de puzzel
	 * 
	 * @return hoogte van de puzzel
	 */
	public int getHeight();
}
