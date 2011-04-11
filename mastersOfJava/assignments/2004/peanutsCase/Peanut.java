/**
 * A Peanut from company Diffuse is always Ok! This object embodies
 * the quality of the Diffuse peanuts as it holds the most important
 * data for the peanuts -- a name (every peanut is named as soon as
 * it enters the factory!), tastiness (from too salt to saltless),
 * crunchiness (from too hard to too soft) and form (from too round
 * to too square).
 */
public class Peanut extends Object {
	/** The name of the peanut (sentimental) */
	private String name;
	/** 
	* The tastiness of the peanut. Could be either TASTE_TOO_SALTY,
	* TASTE_OK or TASTE_TOO_SALTLESS.
	*/
	private int tastiness;
	/** 
	* The Crunchiness of the peanut. Could be either CRUNCHINESS_TOO_HARD,
	* CRUNCHINESS_OK or CRUNCHINESS_TOO_SOFT.
	*/
	private int crunchiness;
	/** 
	* The form of the peanut. Could be either FORM_TOO_ROUND, 
	* FORM_OK or FORM_TOO_SQUARE.
	*/
	private int form;
	
	public static final int TASTE_TOO_SALTY 		= 1;
	public static final int TASTE_OK				= 2;
	public static final int TASTE_TOO_SALTLESS 		= 3;
	
	public static final int CRUNCHINESS_TOO_HARD		= 1;
	public static final int CRUNCHINESS_OK			= 2;
	public static final int CRUNCHINESS_TOO_SOFT		= 3;

	public static final int FORM_TOO_ROUND			= 1;
	public static final int FORM_OK				= 2;
	public static final int FORM_TOO_SQUARE			= 3;
	
	/**
	* The peanut is always constructed with all its basic values, which are
	* scanned as soon as it leaves the factory.
	*/
	public Peanut(String newName, int newTastiness, int newCrunchiness, int newForm) {
		setName(newName);
		setTastiness(newTastiness);
		setCrunchiness(newCrunchiness);
		setForm(newForm);
	}
	/**
	* Getter
	* @return the name of the Peanut
	*/
	public String getName() {
		return this.name;	
	}
	/**
	* Getter
	* @return the tastiness of the Peanut. Could be either TASTE_TOO_SALTY,
	* TASTE_OK or TASTE_TOO_SALTLESS.
	*/
	public int getTastiness() {
		return this.tastiness;		
	}
	/**
	* Getter
	* @return the crunchiness of the Peanut. Could be either CRUNCHINESS_TOO_HARD,
	* CRUNCHINESS_OK or CRUNCHINESS_TOO_SOFT.
	*/
	public int getCrunchiness() {
		return this.crunchiness;
	}
	/**
	* Getter
	* @return the form of the Peanut. Could be either FORM_TOO_ROUND, 
	* FORM_OK or FORM_TOO_SQUARE.
	*/
	public int getForm() {
		return this.form;
	}
	/**
	* Setter
	* @param newName the name of the Peanut
	*/
	protected void setName(String newName) {
		this.name = newName;	
	}
	/**
	* Setter
	* @param newTastiness the tastiness of the Peanut
	*/
	protected void setTastiness(int newTastiness) {
		this.tastiness = newTastiness;
	}
	/**
	* Setter
	* @param newCrunchiness the crunchiness of the Peanut
	*/
	protected void setCrunchiness(int newCrunchiness) {
		this.crunchiness = newCrunchiness;
	}
	/**
	* Setter
	* @param newForm the form of the Peanut
	*/
	protected void setForm(int newForm) {
		this.form = newForm;
	}
	/**
	* Returns the Peanut object in the following form
	* <code><pre>
	* [name]: tastiness=[tastiness], crunchiness=[crunchiness], form=[form]
	* </pre></code>
	* @return the string representation of Peanut
	*/
	public String toString() {
		StringBuffer returnString = new StringBuffer();
		returnString.append("\"");	
		returnString.append(getName());
		returnString.append("\"");	
		returnString.append(", Peanut.");	
		switch (getTastiness()) {
			case Peanut.TASTE_TOO_SALTY :
				returnString.append("TASTE_TOO_SALTY");
				break;	
			case Peanut.TASTE_OK :
				returnString.append("TASTE_OK");
				break;	
			case Peanut.TASTE_TOO_SALTLESS :
				returnString.append("TASTE_TOO_SALTLESS");
				break;	
		}
		returnString.append(", Peanut.");	
		switch (getCrunchiness()) {
			case Peanut.CRUNCHINESS_TOO_HARD :
				returnString.append("CRUNCHINESS_TOO_HARD");
				break;
			case Peanut.CRUNCHINESS_OK :
				returnString.append("CRUNCHINESS_OK");
				break;
			case Peanut.CRUNCHINESS_TOO_SOFT :
				returnString.append("CRUNCHINESS_TOO_SOFT");
				break;
		}
		returnString.append(", Peanut.");	
		switch (getForm()) {
			case Peanut.FORM_TOO_ROUND :
				returnString.append("FORM_TOO_ROUND");
				break;
			case Peanut.FORM_OK :
				returnString.append("FORM_OK");
				break;
			case Peanut.FORM_TOO_SQUARE :
				returnString.append("FORM_TOO_SQUARE");
				break;
		}		
		return returnString.toString();
	}
}
