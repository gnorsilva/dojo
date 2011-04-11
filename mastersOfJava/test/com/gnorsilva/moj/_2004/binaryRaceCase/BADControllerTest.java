package com.gnorsilva.moj._2004.binaryRaceCase;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BADControllerTest {
	BADController controller;
	
	@Before
	public void setup(){
		controller = new BADController(new BADRacer());
	}
	
	
	@Test
	public void control(){
		controller.start(0,1000,0,500);
		controller.takeAction();
		assertEquals(1,controller.getSpeed());
	}
	
}
