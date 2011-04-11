/**
* Copies an instance of a Record
*/
public interface Copier {
	/**
	* Copies an instance of a Record
	* @param origRecord the record to be copied
	* @return the copied Record
	*/
	public Record copyRecord(final Record origRecord);
}
