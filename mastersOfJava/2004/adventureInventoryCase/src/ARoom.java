/**
 * 
 */
import java.util.ArrayList;

/**
 * @author xalo
 *
 */
public class ARoom implements Room {
	ArrayList<Item> items = new ArrayList<Item>();
	private String description;
	private String title;
	
	public ARoom(String title, String description) {
		this.title = title;
		this.description = description;
	}

	public String getDescription() {
		return description;
	}
	
	@Override
	public String getTitle() {
		return title;
	}
	
	@Override
	public Item[] getItems() {
		return items.toArray( new Item[items.size()] );
	}
	
	@Override
	public void insertItem(Item i) {
		items.add(i);
	}
	
	@Override
	public void removeItem(Item i) {
		items.remove(i);
	}
}
