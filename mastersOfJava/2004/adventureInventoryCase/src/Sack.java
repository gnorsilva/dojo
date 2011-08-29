/**
 * 
 */
import java.util.ArrayList;

/**
 * @author xalo
 *
 */
public class Sack implements Container {
	ArrayList<Item> items = new ArrayList<Item>();
	
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
