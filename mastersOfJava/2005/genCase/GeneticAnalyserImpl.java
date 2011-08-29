

/**
 * GeneticAnalyser analyses parts of DNA strings.   
 */
public class GeneticAnalyserImpl implements GeneticAnalyser {

	private String beginMarker;
	private String endMarker;
	
	private String dna;

	private int pos;

	/** 
	 * sets the repeat begin sequence used for identifying a piece of
	 * repeating DNA.
	 * @param begin the begin sequence.
	 */ 
    public void setRepeatBeginSequence(String begin) {
		beginMarker=begin;
    }
	/** 
	 * sets the repeat end sequence used for identifying a piece of 
	 * repeating dna.
	 * @param end the end sequence. 
	 */     
	public void setRepeatEndSequence(String end) {
		endMarker=end;
	}
	
	/**
	 * sets the actual DNA string to analyse. The GeneticAnalyser 
	 * must discard any old data after invoking this method. 
	 * @param dna the DNA string to analyse.
	 */
	public void setDna(String dna) {
		this.dna=dna;
		//
		// Implement here.
		//
	}

	/**
	 * returns true if there is another GeneticResult with valid data available.  
	 */
	public boolean hasNext() {
		//
		// Implement Here.
		//
		return false;
	}
	
	/**
	 * returns the next GeneticResult
	 */
	public GeneticResult next() {
		//
		// Implement Here.
		//
		return null;
	}

}
