import junit.framework.TestCase;

public class HashCaseTest extends TestCase{

	private Inventory inventory;
	private Licence lc;
	private Leaf cannabis;
	private Leaf aztech;
	private Leaf otherCanabis;

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		lc = new LicenceImpl(Leaf.class);
		inventory = new Inventory(lc);
		cannabis = new Leaf("cannabis");
		aztech = new Leaf("aztech");
		otherCanabis = new Leaf("cannabis");
		
	}

	public void testLeafLicense(){
		try{
			lc.allowed(cannabis);
		}catch (Exception e){
			fail();
		}
	}
	
	public void testAddingOneLeafToInventory(){
		inventory.addItem(cannabis);
		assertEquals(1, inventory.getAmountOfItems(cannabis));
	}
	
	public void testAddingTwoLeavesToInventory(){
		inventory.addItem(cannabis);
		inventory.addItem(cannabis);
		assertEquals(2, inventory.getAmountOfItems(cannabis));
	}
	
	public void testAddingTwoLeavesOfSameTypeToInventory(){
		inventory.addItem(cannabis);
		inventory.addItem(otherCanabis);
		assertEquals(2, inventory.getAmountOfItems(cannabis));
	}
	
	public void testAddingTwoLeavesOfDifferentTypeToInventory(){
		inventory.addItem(cannabis);
		inventory.addItem(aztech);
		assertEquals(1, inventory.getAmountOfItems(cannabis));
		assertEquals(1, inventory.getAmountOfItems(aztech));
	}
	
	public void testAddingTwoLeavesOfSameTypeAndOneDifferentToInventory(){
		inventory.addItem(cannabis);
		inventory.addItem(otherCanabis);
		inventory.addItem(aztech);
		assertEquals(2, inventory.getAmountOfItems(cannabis));
		assertEquals(1, inventory.getAmountOfItems(aztech));
	}
}
