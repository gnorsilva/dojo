/**
 * GeneticAnalyser analyses parts of DNA strings.   
 */

public interface GeneticAnalyser {

	/** 
	 * sets the repeat begin sequence used for identifying a piece of
	 * repeating DNA.
	 * @param begin the begin sequence.
	 */ 
	public void setRepeatBeginSequence(String begin);
	
	/** 
	 * sets the repeat end sequence used for identifying a piece of 
	 * repeating dna.
	 * @param end the end sequence. 
	 */ 
	public void setRepeatEndSequence(String end);
	
	/**
	 * sets the actual DNA string to analyse. The GeneticAnalyser 
	 * must discard any old data after invoking this method. 
	 * @param dna the string to analyse.
	 */
	public void setDna(String dna);

	/**
	 * returns true if there is another GeneticResult with valid data available.  
	 */
	public boolean hasNext();
	
	/**
	 * returns the next GeneticResult
	 */
	public GeneticResult next();
	
}
