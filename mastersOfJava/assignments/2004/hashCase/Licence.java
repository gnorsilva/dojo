

/**
 * Licence - Enforces licence rules and limitations.
 * (C) 2004 InAccurate the Netherlands B.V.
 * Modification and or Reverse Engineering strictly
 * prohibited. 
 */

public interface Licence {

	/**
	 * checks if the specified object is allowed within the system.
	 * @param o the object to check.
	 * @throws SecurityException if the licence does not allow this object to be used.
	 */
	public void allowed(Object o) throws SecurityException;

}
