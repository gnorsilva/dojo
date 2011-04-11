/**
* The byte stream has a name and the content of the byte
* stream. Note that the Cyber Police has a added a field, called
* security code. This has some room for adopting a controlling
* number to perform the comparing check upon. <br>
* Also note that equals HAS BEEN IMPLEMENTED. It compares the 
* security codes of the byte streams.
* @author Robert Bor.
*/
public interface CompanyByteStream {
	/**
	* Getter for name
	* @return the name of the byte stream
	*/
	public String getName();
	/**
	* Setter for the security code
	* @param securityCode the security code for the byte stream
	*/
	public void setSecurityCode(final String securityCode);
	/**
	* Getter for the security code
	* @return the security code for the byte stream
	*/
	public String getSecurityCode();
	/**
	* IMPLEMENTED BY CYBER POLICE. Calculates the security code which represents
	* the byte stream. 
	* @param digester the security code algorithm which calculates the security code.
	*   The digester is fed chunks of the bytestream by calling 
	*   SecurityCodeAlgorithm.feedData(byte[] byteStream). This feeding happens
	*   piecemeal in chunks of unknown size.
	* @return the string representation of the security code algorith. This result
	* is gotten by calling SecurityCodeAlgorithm.getSecurityCode()
	*/
	public String calculateSecurityCode(CyberPoliceAgent.SecurityCodeAlgorithm digester);
	/**
	* Compares the two security codes
	* @param matchObj the CompanyByteStreamImpl object to be compared
	* @return true; the security codes are equal<br>
	* false; the security codes are not equal
	*/
	public boolean equals(Object matchObj);
}
