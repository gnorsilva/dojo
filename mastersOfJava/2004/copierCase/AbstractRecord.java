import java.io.Serializable;

/**
* Super class of Record. Contains the "security"
*/
public abstract class AbstractRecord implements Serializable {
	/** Size of the buffer for the hash key */
	private static final int BUFFER_SIZE = 8;
	/** The hash key itself */
	private final String hashKey;
	
	/**
	* Constructor
	* @param hashInput input for the generation of the hash key
	*/
	public AbstractRecord(final String hashInput) {
		this.hashKey = calculateHashKey(hashInput);
	}
	/**
	* Returns the hash key
	* @return hashkey
	*/
	public String getHashKey() {
		return this.hashKey;	
	}
	/**
	* Determines the hash key on the basis of an input word. The
	* word must be eight characters long and all in upper capitals
	* @param hashInput the input for the hash key generation process
	* @return the generated hash key
	*/
	private static String calculateHashKey(String hashInput) {
		if (hashInput.length() != 8) {
			return null;
		}
		StringBuffer hashKey = new StringBuffer("AAAAAAAA");
		for (int pos = 0; pos < hashInput.length(); pos++) {
			char currentChar = hashInput.charAt(pos);
			if (!Character.isUpperCase(currentChar)) {
				return null;
			}
			int currentNumber = charToInt(currentChar); // A=1,B=2,C=3,etc,Y=25,Z=26
			if (pos % 2 == 0) { // Turn the wheel left (subtract)
				currentNumber *= -1;		
			}
			for (int addPos = pos; addPos < BUFFER_SIZE; addPos++) {
				int hashKeyNumber = charToInt(hashKey.charAt(pos));
				hashKeyNumber += currentNumber;
				if (hashKeyNumber <= 0) {
					hashKeyNumber += 26;	
				}
				if (hashKeyNumber > 26) {
					hashKeyNumber -= 26;
				}
				hashKey.setCharAt(addPos, intToChar(hashKeyNumber));
			}
		}
		return hashKey.toString();
	}		
	/**
	* Translates a number to a character
	* @param number the number to be translated
	* @return the translated character
	*/
	private static char intToChar(int number) {
		return (char)(number + 'A' - 1);
	}
	/**
	* Translates a letter to an number
	* @param currentChar the character to be translated
	* @return the translated number
	*/
	private static int charToInt(char currentChar) {
		return currentChar - 'A' + 1;
	}
}
