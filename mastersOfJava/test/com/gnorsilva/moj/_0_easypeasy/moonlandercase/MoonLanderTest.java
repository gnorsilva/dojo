package com.gnorsilva.moj._0_easypeasy.moonlandercase;

import junit.framework.TestCase;

public class MoonLanderTest extends TestCase {

	private MoonLander moonLander;

	@Override
	protected void setUp() throws Exception {
		moonLander = new MoonLander();
		super.setUp();
	}
	
	public void testLander(){
		boolean result = moonLander.landShip(22.5, 15, 1000, 5);
		assertEquals(true, result);
	}

	
	
}
