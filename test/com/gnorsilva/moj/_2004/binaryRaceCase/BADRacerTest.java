package com.gnorsilva.moj._2004.binaryRaceCase;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BADRacerTest {
	
	BADRacer bad;
	 
	@Before
	public void setup(){
		bad = new BADRacer();
	}
	
	@Test
	public void testDistanceCalculator(){
		assertEquals(0,bad.calculateDistanceToStop(1));
		assertEquals(1,bad.calculateDistanceToStop(2));
		assertEquals(3,bad.calculateDistanceToStop(4));
		assertEquals(7,bad.calculateDistanceToStop(8));
	}
	
	@Test
	public void testLogFunction(){
		assertEquals(1, bad.log2(2));
		assertEquals(2, bad.log2(4));
		assertEquals(4, bad.log2(16));
		assertEquals(8, bad.log2(256));
	}
	
	@Test
	public void testFuelToStop(){
		assertEquals(2, bad.getFuelToStop(1));
		assertEquals(4, bad.getFuelToStop(2));
		assertEquals(6, bad.getFuelToStop(4));
		assertEquals(8, bad.getFuelToStop(8));
		assertEquals(10, bad.getFuelToStop(16));
		assertEquals(2, bad.getFuelToStop(-1));
		assertEquals(4, bad.getFuelToStop(-2));
		assertEquals(6, bad.getFuelToStop(-4));
		assertEquals(8, bad.getFuelToStop(-8));
		assertEquals(10, bad.getFuelToStop(-16));
		assertEquals(0, bad.getFuelToStop(0));
	}
	
	@Test
	public void testNoStart(){
		assertEquals(Racer.REVERSE, bad.decide(4, 4, 32));
		assertEquals(Racer.DONOTHING, bad.decide(0, 0, 32));
	}
	
	@Test
	public void DecideToAhead(){
		bad.start(0,128);
		assertEquals(Racer.AHEAD, bad.decide(0,32,32));
		assertEquals(Racer.AHEAD, bad.decide(0,16,32));
		assertEquals(Racer.AHEAD, bad.decide(16,-16,128));
		
		bad.start(0,13);
		assertEquals(Racer.AHEAD, bad.decide(0,2,32));
		
		bad.start(200,500);
		assertEquals(Racer.AHEAD, bad.decide(0,8,300));
		
		bad.start(0,8);
		assertEquals(Racer.AHEAD, bad.decide(11,-4,300));
		assertEquals(Racer.AHEAD, bad.decide(9,-2,300));
		assertEquals(Racer.AHEAD, bad.decide(8,-1,300));
	}
	
	@Test
	public void DecideToReverse(){
		bad.start(0,8);
		assertEquals(Racer.REVERSE, bad.decide(0,32,128));
		assertEquals(Racer.REVERSE, bad.decide(0,16,128));
		assertEquals(Racer.REVERSE, bad.decide(8,8,128));
		assertEquals(Racer.REVERSE, bad.decide(20,-4,70));
		assertEquals(Racer.REVERSE, bad.decide(4,4,7));
		assertEquals(Racer.REVERSE, bad.decide(32,-4,80));
		
		bad.start(0,4);
		assertEquals(Racer.REVERSE, bad.decide(0,16,128));
		assertEquals(Racer.REVERSE, bad.decide(0,8,32));
		
		bad.start(0,2);
		assertEquals(Racer.REVERSE, bad.decide(0,4,32));
	}
	
	@Test
	public void DecideToDoNothing(){
		bad.start(0, 32);
		assertEquals(Racer.DONOTHING, bad.decide(50,-4,7));
		assertEquals(Racer.DONOTHING, bad.decide(50,-4,8));
		assertEquals(Racer.DONOTHING, bad.decide(50,-4,9));
	}
	
	@Test
	public void DecideToGiveUp(){
		bad.start(Racer.MINES_LEFT,Racer.MINES_RIGHT);
		assertEquals(Racer.GIVEUP, bad.decide(Racer.MINES_RIGHT - 10 ,16,32));
		assertEquals(Racer.GIVEUP, bad.decide(Racer.MINES_LEFT + 10 ,-16,32));
	}
	
	@Test
	public void DecideTestFuel(){
		bad.start(0,32);
		assertEquals(Racer.REVERSE, bad.decide(0,4,6));
		assertEquals(Racer.DONOTHING, bad.decide(0,4,7));
		assertEquals(Racer.GIVEUP, bad.decide(0,4,5));
		assertEquals(Racer.GIVEUP, bad.decide(0,4,4));
		assertEquals(Racer.GIVEUP, bad.decide(0,4,3));

		assertEquals(Racer.REVERSE, bad.decide(0,2,4));
		assertEquals(Racer.DONOTHING, bad.decide(0,2,5));
		assertEquals(Racer.DONOTHING, bad.decide(0,2,6));
		assertEquals(Racer.DONOTHING, bad.decide(0,2,7));
		assertEquals(Racer.GIVEUP, bad.decide(0,2,3));
		
		assertEquals(Racer.AHEAD, bad.decide(7,-4,7));
		assertEquals(Racer.DONOTHING, bad.decide(50,-4,7));
		
		assertEquals(Racer.GIVEUP, bad.decide(4,-2,3));
	}
	
	@Test
	public void DecideTestCaseOne(){
		bad.start(0, 8);
		assertEquals(Racer.AHEAD, bad.decide(0, 0, 16));
		assertEquals(Racer.AHEAD, bad.decide(1, 1, 14));
		assertEquals(Racer.DONOTHING, bad.decide(3, 2, 12));
		assertEquals(Racer.DONOTHING, bad.decide(5, 2, 11));
		assertEquals(Racer.REVERSE, bad.decide(7, 2, 10));
		assertEquals(Racer.REVERSE, bad.decide(8, 1, 8));
	}
	
	@Test
	public void DecideTestCaseTwo(){
		bad.start(0,4);
		assertEquals(Racer.REVERSE, bad.decide(0,4,32));
		assertEquals(Racer.REVERSE, bad.decide(2,2,30));
		assertEquals(Racer.DONOTHING, bad.decide(3,1,30));
		assertEquals(Racer.REVERSE, bad.decide(4,1,30));
	}
	
	@Test
	public void DecideTestCaseThree(){
		bad.start(0, 13);
		assertEquals(Racer.AHEAD, bad.decide(0, 2, 16));
		assertEquals(Racer.DONOTHING, bad.decide(4, 4, 14));
		assertEquals(Racer.REVERSE, bad.decide(8, 4, 13));
		assertEquals(Racer.DONOTHING, bad.decide(10, 2, 11));
		assertEquals(Racer.REVERSE, bad.decide(12, 2, 10));
		assertEquals(Racer.REVERSE, bad.decide(13, 1, 8));
	}
	
	@Test
	public void DecideTestCaseFour(){
		bad.start(0, 13);
		assertEquals(Racer.AHEAD, bad.decide(0, 2, 8));
		assertEquals(Racer.REVERSE, bad.decide(4, 4, 6));
		assertEquals(Racer.REVERSE, bad.decide(6, 2, 4));
		assertEquals(Racer.REVERSE, bad.decide(7, 1, 2));
		assertEquals(Racer.REVERSE, bad.decide(7, 0, 0));
	}
	
}
