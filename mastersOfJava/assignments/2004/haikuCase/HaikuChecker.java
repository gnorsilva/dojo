/**
 * Haiku is one of the most important form of traditional japanese poetry. 
 * Haiku is, today, a 17-syllable verse form consisting of three lines of 5, 7, and 5 syllables. 
 * Each Haiku must contain a kigo, a season word, which indicate in which season the Haiku is set. 
 */

public interface HaikuChecker {

	/**
	 * Season constants. An haiku should at least contain one reference to a season.
	 */
	public static final String[] SEASONS=new String[] { "lente","zomer","herfst","winter" };

	/**
	 * Checks if the given haiku is a valid one.
	 * - it consists of 3 lines 
	 * - line one consists of 5 syllables.
	 * - line two consists of 7 syllables.
	 * - line three consists of 5 syllables.
	 * - It contains at least one reference to a season.
	 * @throws InvalidHaikuException if the haiku is invalid.
	 */
	public void check(String[] haiku) throws InvalidHaikuException;
	

}
