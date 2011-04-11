

/**
 * Leaf represents a leaf of the Cannabis plant.
 */

public class Leaf {

	/** Holds the generic name of the leaf */ 
	private String myBrand;
	
	public Leaf(String brand) {
		myBrand=brand;
	}
	
	public String getBrand() {
		return myBrand;
	}
	
	public String toString() {
		return "Leaf("+myBrand+")";
	}

}
