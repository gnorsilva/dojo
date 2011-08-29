import java.io.Serializable;

/**
* The object representation of the CRM data
*/
public class Record extends AbstractRecord implements Serializable {
	/** the name of the record, mostly the customer */
	private String name;

	/**
	* Constructor 
	* @param hashInput the input for the generation of the hashKey 
	* @param name the name of the record, ie customer
	*/		
	public Record(final String hashInput, final String name) {
		super(hashInput);
		setName(name);
	}
	/**
	* Sets the name of the record
	* @param name the new name of the record
	*/
	public void setName(final String name) {
		this.name = name;
	}
	/**
	* Gets the name of the record
	* @return gets the name of the record
	*/
	public String getName() {
		return this.name;
	}
}
