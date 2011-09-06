import junit.framework.TestCase;

public class HelloWorldTestCase extends TestCase {

	public void testSayIt(){
		String result;
		
		result = HelloWorldCase.sayIt("Zaphod");
		assertEquals("Hello Zaphod", result);
		
		result = HelloWorldCase.sayIt("Gargravarr");
		assertEquals("Hello Gargravarr", result);
		
		result = HelloWorldCase.sayIt(null);
		assertEquals("Hello", result);
	}
	
}
