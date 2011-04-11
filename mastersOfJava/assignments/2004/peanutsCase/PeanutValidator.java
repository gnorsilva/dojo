/**
 * The Peanut Validator has the responsibility to check produced
 * peanuts for defects and only allow the perfect peanuts to pass.
 */
public interface PeanutValidator {
	/**
	* The validate method takes an array of Peanut objects and checks
	* these objects for validity. Validity is defined as a Peanut 
	* having a perfect taste, a perfect crunchiness and a perfect
	* form (See also Peanut.TASTE_OK, Peanut.CRUNCHINESS_OK and
	* Peanut.FORM_OK).
	* @param peanuts an array of Peanut non-validated objects
	* @return the validated Peanut objects
	* @exception NutsException is thrown when the input parameters
	* contain an error
	*/
	public Peanut[] validate(Peanut[] peanuts) throws NutsException;
}
