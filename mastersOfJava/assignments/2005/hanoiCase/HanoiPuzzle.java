/**
 * HanoiPuzzle representeert de bekende 'Torens van Hanoi' puzzel waarin een
 * aantal schijven van toenemende grootte 1 voor een van de linker naar de rechter
 * toren verplaatst moet worden, dusdanig dat er nooit een grotere schijf boven op
 * een kleinere terecht komt. 
 */
public interface HanoiPuzzle {
	
	/** geeft de eerste toren terug welke initieel alle schijven bevat. */
	public Tower getSourceTower();
	
	/** geeft de middelste toren (de hulp toren) terug */ 
	public Tower getMiddleTower();
	
	/** geeft de toren terug waarop de schijven uiteindelijk terecht moeten komen */
	public Tower getTargetTower();
	
	/** 
	 * verplaatst de bovenste schijf van de ene toren naar de andere toren
	 * @param source de toren waarvan de bovenste schijf verwijdert moet worden.
	 * @param target de toren waarop de schijf geplaatst moet worden
	 * @throws RuntimeException wanneer de schijf niet past of als het maximaal 
	 *         aantal zetten is overschreden
	 */
	public void moveDisk(Tower source,Tower target) throws InvalidMoveException;
	
	/** 
	 * @return true als de puzzel correct is opgelost - alle schrijven zitten op
	 *         de laatste toren.
	 */
	public boolean isSolved();

}
