/**
* A proud member of the Cyber Police (tm) -- the unit responsible
* for solving various cybercrimes, from the light (such as illegally
* copying software) to the heinous (DOS attacks).
* @author Robert Bor
*/
public class CyberPoliceAgentImpl implements CyberPoliceAgent {
	/**
	* Constructor
	*/
	public CyberPoliceAgentImpl() {
		// needs no implementation
	}
	/**
	* The Cyber Policy Agent will set up a stakeout location in the
	* company and see if he can catch the criminal. The list of criminals
	* is returned as an array of employees
	* @param company the stakeout location
	* @return the list of employees checking in illegal bytestreams
	*/
	public Employee[] performStakeOut(Company company) {
		// IMPLEMENT HERE
		return null;
	}
	/**
	* This algorithm is passed by the CyberPoliceAgent to a CompanyByteStream
	* in order to determine the security code. This code can be used to
	* compare byte streams
	*/	
	public class SecurityCodeAlgorithmImpl implements SecurityCodeAlgorithm {
		// IMPLEMENT HERE

		/**
		* Constructor
		*/
		public SecurityCodeAlgorithmImpl() {
			// IMPLEMENT HERE
		}
		/** 
		* The method is called by CompanyByteStream to feed chunks of data
		* to the SecurityCodeAlgorithm. The algorithm is expected to be 
		* able to deal with these chunks. Note that the chunks are of
		* indeterminate size. Ie, a chunk can be both 4 bytes, but it could
		* just as well be 100 bytes.
		* @param byteStream the chunk fed to the algorithm
		*/
		public void feedData(byte[] byteStream) {
			// IMPLEMENT HERE
		}
		/**
		* Returns the security code calculated by the algorithm. The class
		* had its feedData method called at least once, before a value
		* is legally available.
		* @return the security code calculated by the algorithm
		*/ 
		public String getSecurityCode() {
			// IMPLEMENT HERE
			return null;
		}
		/**
		* Converts a byte array to a String. This method is used for
		* debugging purposes the cyber police
		* @param byteStream byte array to be converted to text
		* @return the text representation of the byte array
		*/
		protected String convertBytesToString(byte[] byteStream) {
			return Utils.byteArrayToString(byteStream);
		}
	}
}
