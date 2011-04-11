import java.util.ArrayList;
import java.util.List;

/**
 * SkyLineRendererImpl is the actual implementation of the SkyLineRenderer. 
 */
public class SkyLineRendererImpl implements SkyLineRenderer {

	private List myList=new ArrayList();

	/** clears the current set of buildings */
	public void clear() {
		//		
	}

	/** 
	 * adds a building to the current set of buildings.
	 * Note that the buildings may be added in any order.
	 * @param b the building to add.
	 * @throws NullPointerException if the building is null. 
	 */
	public void addBuilding(Building b) {
		//
	}

	/**
	 * returns the skyline as defined by the buildings. 
	 * @return an array of Nodes which describe the skyline from left to right.
	 *         If there are no buildings an empty array should be returned. 
	 */
	public Node[] getSkyLine() {
		//
		return null;
	}

}
