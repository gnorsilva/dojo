package com.gnorsilva.moj._0_easypeasy.spotcountercase;

import junit.framework.TestCase;


public class SpotCounterTest extends TestCase{
	
	private SpotCounter spotCounter;
	
	@Override
	protected void setUp() throws Exception {
		spotCounter = new SpotCounter();
		super.setUp();
	}

	public void testFirstScan(){
		Hit one = new POJO();
		Hit two = new SPOT();
		Hit three = new POJO();
		Radar spotRadar = new SPOTRadar(one,two,three);
		assertEquals(1,spotCounter.scan(spotRadar));
	}
	
}
