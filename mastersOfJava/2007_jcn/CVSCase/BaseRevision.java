/**
 * This class provides basic revision functionality.
 */
public abstract class BaseRevision
{
	private String content;

	/**
	 * Constructs and initializes a base revision.
	 */
	public BaseRevision(String content)
	{
		this.content = content;
	}

	/**
	 * Returns the content.
	 */
	public final String getContent()
	{
		return this.content;
	}

	/**
	 * Returns the revision number.
	 */
	public abstract String getNumber();

	/**
	 * Tests wether the revision can be a branch successor of the specified revision.
	 * 
	 * Returns true if the content equals the content of the specified revision
	 * after removing one character but not the last one.
	 */
	public boolean canBeBranchOf(Revision rev)
	{
		boolean result = false;
		
		String s = rev.getContent();
		for (int i = 0; i < s.length() - 1; i++)
		{
			if (getContent().equals(s.substring(0, i) + s.substring(i + 1, s.length())))
			{
				result = true;
				break;
			}
		}

		return result;
	}

	/**
	 * Test wether the revision can be a linear successor of the specified revision.
	 * 
	 * Returns true if the content starts with but not equals the content of the
	 * specified revision.
	 */
	public boolean canBeRevisionOf(Revision rev)
	{
		String s = rev.getContent();
		return !getContent().equals(s) && getContent().startsWith(s);
	}
}
