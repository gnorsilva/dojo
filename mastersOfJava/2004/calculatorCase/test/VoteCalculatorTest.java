import junit.framework.TestCase;

public class VoteCalculatorTest extends TestCase {
	
	private VoteCalculator calc;

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		calc = new VoteCalculator();
	}

	public void testNullVotes(){
		try{
			calc.getTotal(null);
			fail();
		}catch (CalculatorException e){
			assertTrue(true);
		}
	}
	
	public void testEmptyVotes() throws CalculatorException{
		assertEquals(0,calc.getTotal(""));
	}
	
	public void test1Plus1Equals2() throws CalculatorException{
		String test = "1 + 1";
		assertEquals(2, calc.getTotal(test));
	}
	
	public void test1Plus2Equals3() throws CalculatorException{
		String test = "1 + 2";
		assertEquals(3, calc.getTotal(test));
	}
	
	public void test1Plus7Equals8() throws CalculatorException{
		String test = "1 + 7";
		assertEquals(8, calc.getTotal(test));
	}
	
	public void test5Minus2Equals3() throws CalculatorException{
		String test = "5 - 2";
		assertEquals(3, calc.getTotal(test));
	}
	
	public void test1Plus3Minus4Equals0() throws CalculatorException{
		String test = "1 + 3 - 4";
		assertEquals(0, calc.getTotal(test));
	}
	
	public void testNoSpacingsBetweenNumbers() throws CalculatorException{
		String test = "1+3-4";
		assertEquals(0, calc.getTotal(test));
	}
	
	public void testDifferentSpacingsBetweenNumbers() throws CalculatorException{
		String test = "1 +   3  -        4";
		assertEquals(0, calc.getTotal(test));
	}
}