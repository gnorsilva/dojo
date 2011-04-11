

/**
 * A BrainCell is a part of Eriks brain. It holds concepts and idea's which are
 * connected to other concepts and idea's. Using his skilled eye DrBernard can
 * determine which BrainCells are good and which are bad.
 */
public interface BrainCell {

	/** returns braincells to which this braincell is connected. */ 
	public BrainCell[] getConnections();	
	/** returns true if the brain cell is good. */ 
	public boolean isGood();
	/** returns true if the brain cell is bad. */ 
	public boolean isBad();
	
	/** returns the concept stored in this braincell. */
	public String getConcept();
	/** generates a description for this braincell. */	
	public String toString();

}
