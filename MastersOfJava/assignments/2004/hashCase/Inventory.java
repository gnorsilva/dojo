import java.util.HashMap;
import java.util.Map;

/**
 * Inventory - manages the inventory of a small shop.
 * (C) 2004 InAccurate the Netherlands B.V.
 * Modification and or Reverse Engineering strictly
 * prohibited. 
 */

public class Inventory {

	/** stores the inventory. */
	private Map myInventory=new HashMap();
	private Licence myLicence;
	
	public Inventory(Licence lc) {
		myLicence=lc;
	}
	
	/**
	 * Adds an item to the inventory. 
	 * @param o the item to add.
	 */
	public void addItem(Object o) {
		myLicence.allowed(o);
		if (myInventory.containsKey(o)) {
			Integer i=(Integer)myInventory.get(o);
			myInventory.put(o,new Integer(i.intValue()+1));
		} else {
			myInventory.put(o,new Integer(1));
		}
	}
	
	/**
	 * Removes an item from the inventory. 
	 * @param o the item to remove.
	 * @throws NullPointerException if there are no more items like the item in the argument.
	 */
	public void removeItem(Object o) {
		myLicence.allowed(o);
		if (myInventory.containsKey(o)) {
			Integer i=(Integer)myInventory.get(o);
			if (i.intValue()>0) {
				myInventory.put(o,new Integer(i.intValue()-1));
			} else {
				myInventory.remove(o);
			}
		} else throw new NullPointerException("No leaves left.");
	}
	
	/** returns an array of items of which are available in the shop */
	public Object[] getItems() {
		return myInventory.keySet().toArray(new Object[myInventory.size()]);
	}
	
	/** returns the amount of items available of a specific item */ 
	public int getAmountOfItems(Object item) {
		myLicence.allowed(item);
		return ((Integer)myInventory.get(item)).intValue();
	}

}
