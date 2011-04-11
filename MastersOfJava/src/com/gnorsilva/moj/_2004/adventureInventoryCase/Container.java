package com.gnorsilva.moj._2004.adventureInventoryCase;

/**
 * A container is somethings that can hold Items. As in real life
 * there are limits to how many items and how much weight you can put
 * into a container.
 */
public interface Container {

	/** returns the items in this container */
	public Item[] getItems();
	/** adds an item to this container. */
	public void insertItem(Item i);
	/** removes an item from this container */
	public void removeItem(Item i);

}
