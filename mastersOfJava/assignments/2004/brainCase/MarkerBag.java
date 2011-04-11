

/**
 * Special container to store which braincells are good and which are bad.
 * Medical procedure allow only those cells to be marked that are at the
 * location of the InnserSpace device. 
 */
public interface MarkerBag {

	/** returns true if the braincell was already marked */
	public boolean isMarked(BrainCell br);
	/** marks the braincell as a good braincell. */	
	public void markAsGood(BrainCell br);
	/** marks the braincell as a bad braincell. */	
	public void markAsBad(BrainCell br);

}
