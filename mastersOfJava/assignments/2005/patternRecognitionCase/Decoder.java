/**
 * The Decoder interface is responsible for the decoding 
 * of a hidden message in a piece of text. 
 */
public interface Decoder {

	/** @returns the name of this decoder */
	public String getName(); 
	/**
	 * decodes the message. 
	 * @param message the message to decode.
	 * @return the decoded message.
	 */
	public String decode(String message);
	
}
