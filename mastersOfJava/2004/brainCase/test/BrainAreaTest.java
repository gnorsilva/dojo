import junit.framework.TestCase;

public class BrainAreaTest extends TestCase {

	public void testSameBrainAreaIsEqual(){
		BrainArea motor = new BrainArea("motor");
		BrainArea motor2 = new BrainArea("motor");
		assertTrue(motor.equals(motor2));
	}
	
	public void testDifferentBrainAreasAreNotEqual(){
		BrainArea motor = new BrainArea("motor");
		BrainArea speach = new BrainArea("speach");
		assertFalse(motor.equals(speach));
	}
}
