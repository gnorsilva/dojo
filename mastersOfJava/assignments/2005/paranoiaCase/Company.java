import java.util.Iterator;

/**
* Company containing the settings for the bytestreams
*/
public interface Company {
	/**
	* Gets the array of byte stream with the legitimate objects
	* @return all legitimate byte streams
	*/	
	public CompanyByteStream[] getLegalByteStreams();
	/**
	* Gets a checkin event where an employee will check in a 
	* byte stream into the corporate system
	* @return the iterator on the checking events, stating which employee is checking in what byte stream
	*/
	public Iterator getCheckinEvents();
	/**
	* Getter
	* @return returns the name of the company
	*/
	public String getName();
}
