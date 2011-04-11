/**
* Contains ways to convert byte arrays to a String
* @author Robert Bor / algorithm made by Erik Hooijmeijer
*/
public class Utils {
	/**
	* Converts a byte array to a String representation
	* @param d the byte array to be converted to text
	* @return the String containing the representation of the byte array
	*/
	public static String byteArrayToString(byte[] d) {
		return hexString(intArray(d));
	}
	/**
	* Converts an integer array to a String
	* @param d the integer array to be converted
	* @return the String containing the representation of the integer array
	*/
	protected static String hexString(int[] d) {
		StringBuffer sb=new StringBuffer();
		for (int t=0;t<d.length;t++) {
			sb.append((char)((d[t]>>4)<10 ? '0'+(d[t]>>4) : 'A'+((d[t]>>4)-10))); 
			sb.append((char)((d[t]&0x0F)<10 ? '0'+(d[t]&0x0F) : 'A'+((d[t]&0x0F)-10))); 
		}
		return sb.toString();
	}
	/**
	* Converts a byte array to an integer array
	* @param d the byte array to be converted
	* @return the integer array containing the values of the byte array
	*/
	protected static int[] intArray(byte[] d) {
		int[] r=new int[d.length];
		for (int t=0;t<d.length;t++) {
			r[t]=d[t]&0xFF;
		}
		return r; 
	}
}
