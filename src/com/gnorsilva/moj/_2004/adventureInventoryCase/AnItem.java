/**
 * 
 */
package com.gnorsilva.moj._2004.adventureInventoryCase;

/**
 * @author xalo
 *
 */
public class AnItem implements Item{
	private String name;
	private String description;

	public AnItem(String name){
		this.name = name;
		this.description = name;
	}
	
	public AnItem(String name, String description){
		this.name = name;
		this.description = description;
	}
	
	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public String getName() {
		return name;
	}
}