/**
 * Tower representeert een toren in de Torens van Hanoi puzzel. 
 * Op een toren zitten 0 of meerdere schijven welke in grootte afnemen want
 * er mag nooit een grotere schijf boven een kleinere zitten.  
 */
public interface Tower {

	/** @return de hoogte van de schijven op de toren */
	public int getHeight();
	
	/**
	 * @return de grootte van de meest boven gelegen schijf.
	 * Wanneer de toren leeg is (height==0) dan geeft deze 
	 * methode Integer.MAX_VALUE terug. 
	 */
	public int getTopDiskSize();

}
