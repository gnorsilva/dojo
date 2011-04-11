package com.gnorsilva.moj._2004.adventureInventoryCase;

import java.util.Arrays;


public class PlayerAdventurer implements Adventurer {
	private Room currentRoom;
	private Container inventory;
	
	public PlayerAdventurer(Container inventory) {
		this.inventory = inventory;
	}
	
	public PlayerAdventurer(){
		inventory = new Sack();
	}

	@Override
	public void enter(Room room) {
		currentRoom = room;
	}
	
	@Override
	public String performTakeOrDrop(String command) {
		command = command.toLowerCase();
		String [] commands = command.split(" ");
		if(Arrays.asList(TAKEWORDS).contains(commands[0])){
			return performTakeOrDrop(currentRoom,inventory,commands);
		}else if(Arrays.asList(DROPWORDS).contains(commands[0])){
			return performTakeOrDrop(inventory,currentRoom,commands);
		}else{
			return RESPONSE_NOTUNDERSTAND;
		}
	}

	private String performTakeOrDrop(Container source, Container recipient,String [] commands){

		if (source != null & commands.length > 1) {
			Item[] sourceItems = source.getItems();
			
			if (sourceItems != null) {
				
				if(commands.length==2){
					if(Arrays.asList(ALLWORDS).contains(commands[1])){
						for(Item i : sourceItems){
							source.removeItem(i);
							recipient.insertItem(i);
						}
						return RESPONSE_OK;
					} else {
						for (Item i : sourceItems) {
							if (i.getName().equalsIgnoreCase(commands[1])) {
								source.removeItem(i);
								recipient.insertItem(i);
								return RESPONSE_OK;
							}
						}
					}
				}
				
				if(commands.length==4){
					if(ANDWORDS[0].equals(commands[2])){
						return switchTwoItems(source, sourceItems, recipient, commands[1],commands[3]);
					}
					
					if( Arrays.asList(ALLWORDS).contains(commands[1])
							&
						Arrays.asList(BUTWORDS).contains(commands[2])){

						for(Item i : sourceItems){
							if(!i.getName().equalsIgnoreCase(commands[3])){
							source.removeItem(i);
							recipient.insertItem(i);
							}
						}
						return RESPONSE_OK;
					}
				}
				
				if (commands.length == 5) {
					if (ANDWORDS[1].equals(commands[1]) & ANDWORDS[0].equals(commands[3])) {
						return switchTwoItems(source, sourceItems, recipient, commands[2], commands[4]);
					}
				}
			}
		}

		return RESPONSE_NOTHERE;
	}
	
	private String switchTwoItems(Container source, Item [] sourceItems, Container recipient, String itemA, String itemB){
		Item itemToBeRemoved1st = null;
		
		for (Item i : sourceItems) {
			if (i.getName().equalsIgnoreCase(itemA)) {
				itemToBeRemoved1st = i;
				break;
			}
		}
		
		if(itemToBeRemoved1st !=null){
			for (Item i : sourceItems) {
				if (i.getName().equalsIgnoreCase(itemB)) {
					source.removeItem(itemToBeRemoved1st);
					recipient.insertItem(itemToBeRemoved1st);
					
					source.removeItem(i);
					recipient.insertItem(i);
					
					return RESPONSE_OK;
				}
			}
		}

		return RESPONSE_NOTHERE;
	}

	
}
