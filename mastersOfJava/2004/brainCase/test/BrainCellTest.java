import junit.framework.TestCase;


public class BrainCellTest extends TestCase {

	private BrainArea area;

	public void testEqualBrainCells(){
		area = new BrainArea("speech");
		BrainCell en1 = new BrainCell("english", area, true);
		BrainCell en2 = new BrainCell("english", area, true);
		assertTrue(en1.equals(en2));
	}
	
	public void testDifferentBrainCells(){
		area = new BrainArea("speech");
		BrainCell en = new BrainCell("english", area, true);
		BrainCell pt = new BrainCell("portuguese", area, true);
		assertFalse(en.equals(pt));
	}
}
