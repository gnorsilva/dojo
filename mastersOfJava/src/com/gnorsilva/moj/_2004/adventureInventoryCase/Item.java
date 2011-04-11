package com.gnorsilva.moj._2004.adventureInventoryCase;

/**
 * An item is an object that can be manipulated by the player. Typically
 * it can be taken or dropped. An item has a name and a description and 
 * also a size and a weight.
 */
public interface Item {

	/** returns the name (one word) of the item */
	public String getName();
	/** returns the description of the item */
	public String getDescription();

}
