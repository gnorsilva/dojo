/**
 * This class represents the revision of a file.
 */
public class Revision extends BaseRevision
{
	public static class CVSImpl
	{
		/**
		 * Restores the revision numbers of the specified revision history such
		 * that Revision.getNumber() will return the correct number for each revision.
		 * 
		 * @param revisions revision history of one file, ordered by original
		 *                  revision numbers.
		 */
		public void restoreNumbers(Revision[] revisions)
		{
			//
			// Implement Here
			//
		}
	}

	/**
	 * Constructs and initializes a revision.
	 */
	public Revision(String content)
	{
		super(content);
	}

	/**
	 * Returns the revision number.
	 */
	public String getNumber()
	{
		//
		// Implement Here
		//
		
		return "1" + "." + 1;
	}
}