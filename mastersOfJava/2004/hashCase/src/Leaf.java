/**
 * Leaf represents a leaf of the Cannabis plant.
 */

public class Leaf {

	/** Holds the generic name of the leaf */ 
	private final String myBrand;
	
	public Leaf(String brand) {
		myBrand=brand;
	}
	
	public String getBrand() {
		return myBrand;
	}
	
	public String toString() {
		return "Leaf("+myBrand+")";
	}

	@Override
	public boolean equals(Object obj) {
		Leaf other = (Leaf) obj;
		if (isNull(obj) || isClassDifferent(obj) || isMyBrandDifferent(other))
			return false;
		return true;
	}

	private boolean isNull(Object obj) {
		return obj == null;
	}

	private boolean isClassDifferent(Object obj) {
		return getClass() != obj.getClass();
	}

	private boolean isMyBrandDifferent(Leaf other) {
		return !myBrand.equals(other.myBrand);
	}
	
	@Override
	public int hashCode() {
		return myBrand.hashCode();
	}

}
