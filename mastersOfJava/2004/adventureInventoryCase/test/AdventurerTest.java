import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class AdventurerTest {
	Adventurer jack;
	
	@Before
	public void setUp() throws Exception {
		Container inventory = new Sack();
		addTestItemsToPlayerContainer(inventory);

		Room lumberYard = new ARoom("LumberYard", "A lumber yard");
		addTestItemsToRoom(lumberYard);
		
		jack = new PlayerAdventurer(inventory);
		jack.enter(lumberYard);
	}
	
	private void addTestItemsToPlayerContainer(Container container){
		container.insertItem(new AnItem("banana"));
		container.insertItem(new AnItem("gun"));
		container.insertItem(new AnItem("lamp"));
		container.insertItem(new AnItem("knife"));
	}
	
	private void addTestItemsToRoom(Container container) {
		container.insertItem(new AnItem("shovel"));
		container.insertItem(new AnItem("wood"));
		container.insertItem(new AnItem("axe"));
		container.insertItem(new AnItem("saw"));
	}
	
	@Test
	public void testTakingCommands() {
		assertEquals(Adventurer.RESPONSE_NOTHERE, jack.performTakeOrDrop("take"));
		assertEquals(Adventurer.RESPONSE_NOTHERE, jack.performTakeOrDrop("TAKE"));
		assertEquals(Adventurer.RESPONSE_NOTHERE, jack.performTakeOrDrop("fetch"));
		assertEquals(Adventurer.RESPONSE_NOTHERE, jack.performTakeOrDrop("FETCH"));
		assertEquals(Adventurer.RESPONSE_NOTHERE, jack.performTakeOrDrop("get"));
		assertEquals(Adventurer.RESPONSE_NOTHERE, jack.performTakeOrDrop("GET"));
	}
	
	@Test
	public void testDroppingCommands() {
		assertEquals(Adventurer.RESPONSE_NOTHERE, jack.performTakeOrDrop("drop"));
		assertEquals(Adventurer.RESPONSE_NOTHERE, jack.performTakeOrDrop("DROP"));
		assertEquals(Adventurer.RESPONSE_NOTHERE, jack.performTakeOrDrop("leave"));
		assertEquals(Adventurer.RESPONSE_NOTHERE, jack.performTakeOrDrop("LEAVE"));
		assertEquals(Adventurer.RESPONSE_NOTHERE, jack.performTakeOrDrop("dump"));
		assertEquals(Adventurer.RESPONSE_NOTHERE, jack.performTakeOrDrop("DUMP"));
	}
	
	@Test
	public void testWrongCommands(){
		assertEquals(Adventurer.RESPONSE_NOTUNDERSTAND, jack.performTakeOrDrop("all"));
		assertEquals(Adventurer.RESPONSE_NOTUNDERSTAND, jack.performTakeOrDrop("SHOULD NOT UNDERSTAND"));
		assertEquals(Adventurer.RESPONSE_NOTUNDERSTAND, jack.performTakeOrDrop("hello banana"));
	}
	
	@Test
	public void testTakingItems(){
		assertEquals(Adventurer.RESPONSE_NOTHERE, jack.performTakeOrDrop("take banana"));
		assertEquals(Adventurer.RESPONSE_OK, jack.performTakeOrDrop("take shovel"));
		assertEquals(Adventurer.RESPONSE_NOTHERE, jack.performTakeOrDrop("take shovel"));
	}
	
	@Test
	public void testDroppingItems(){
		assertEquals(Adventurer.RESPONSE_NOTHERE, jack.performTakeOrDrop("drop shovel"));
		assertEquals(Adventurer.RESPONSE_OK, jack.performTakeOrDrop("drop banana"));
		assertEquals(Adventurer.RESPONSE_NOTHERE, jack.performTakeOrDrop("drop banana"));
	}
	
	@Test
	public void testTakingTwoItems(){
		assertEquals(Adventurer.RESPONSE_OK, jack.performTakeOrDrop("take wood and axe"));
		assertEquals(Adventurer.RESPONSE_NOTHERE, jack.performTakeOrDrop("take wood and axe"));
		assertEquals(Adventurer.RESPONSE_NOTHERE, jack.performTakeOrDrop("take both wood and axe"));
		assertEquals(Adventurer.RESPONSE_NOTHERE, jack.performTakeOrDrop("take wood and shovel"));
		assertEquals(Adventurer.RESPONSE_NOTHERE, jack.performTakeOrDrop("take shovel and wood"));
		assertEquals(Adventurer.RESPONSE_NOTHERE, jack.performTakeOrDrop("take both shovel and wood"));
		assertEquals(Adventurer.RESPONSE_NOTHERE, jack.performTakeOrDrop("take both wood and shovel"));
		assertEquals(Adventurer.RESPONSE_NOTHERE, jack.performTakeOrDrop("take both saw and wood"));
		assertEquals(Adventurer.RESPONSE_OK, jack.performTakeOrDrop("take both shovel and saw"));
		assertEquals(Adventurer.RESPONSE_NOTHERE, jack.performTakeOrDrop("take both shovel and saw"));
		assertEquals(Adventurer.RESPONSE_NOTHERE, jack.performTakeOrDrop("take shovel"));
		assertEquals(Adventurer.RESPONSE_NOTHERE, jack.performTakeOrDrop("take both shovel and saw"));
		assertEquals(Adventurer.RESPONSE_NOTHERE, jack.performTakeOrDrop("take banana and gun"));
	}
	
	@Test
	public void testDroppingTwoItems(){
		assertEquals(Adventurer.RESPONSE_NOTHERE, jack.performTakeOrDrop("drop wood and axe"));
		assertEquals(Adventurer.RESPONSE_OK, jack.performTakeOrDrop("drop banana and gun"));
		assertEquals(Adventurer.RESPONSE_NOTHERE, jack.performTakeOrDrop("drop banana and gun"));
		assertEquals(Adventurer.RESPONSE_NOTHERE, jack.performTakeOrDrop("drop both banana and gun"));
		assertEquals(Adventurer.RESPONSE_NOTHERE, jack.performTakeOrDrop("drop banana and knife"));
		assertEquals(Adventurer.RESPONSE_NOTHERE, jack.performTakeOrDrop("drop knife and banana"));
		assertEquals(Adventurer.RESPONSE_NOTHERE, jack.performTakeOrDrop("drop both knife and banana"));
		assertEquals(Adventurer.RESPONSE_NOTHERE, jack.performTakeOrDrop("drop both banana and knife"));
		assertEquals(Adventurer.RESPONSE_NOTHERE, jack.performTakeOrDrop("drop both lamp and banana"));
		assertEquals(Adventurer.RESPONSE_OK, jack.performTakeOrDrop("drop both knife and lamp"));
		assertEquals(Adventurer.RESPONSE_NOTHERE, jack.performTakeOrDrop("drop both knife and lamp"));
		assertEquals(Adventurer.RESPONSE_NOTHERE, jack.performTakeOrDrop("drop knife"));
		assertEquals(Adventurer.RESPONSE_NOTHERE, jack.performTakeOrDrop("drop both knife and lamp"));
	}
	
	@Test
	public void testTakeAll(){
		assertEquals(Adventurer.RESPONSE_OK, jack.performTakeOrDrop("take all"));
		assertEquals(Adventurer.RESPONSE_NOTHERE, jack.performTakeOrDrop("take shovel"));
		assertEquals(Adventurer.RESPONSE_NOTHERE, jack.performTakeOrDrop("take wood"));
		assertEquals(Adventurer.RESPONSE_NOTHERE, jack.performTakeOrDrop("take axe"));
		assertEquals(Adventurer.RESPONSE_NOTHERE, jack.performTakeOrDrop("take saw"));
	}
	
	@Test
	public void testTakeEverything(){
		assertEquals(Adventurer.RESPONSE_OK, jack.performTakeOrDrop("take everything"));
		assertEquals(Adventurer.RESPONSE_NOTHERE, jack.performTakeOrDrop("take shovel"));
		assertEquals(Adventurer.RESPONSE_NOTHERE, jack.performTakeOrDrop("take wood"));
		assertEquals(Adventurer.RESPONSE_NOTHERE, jack.performTakeOrDrop("take axe"));
		assertEquals(Adventurer.RESPONSE_NOTHERE, jack.performTakeOrDrop("take saw"));
	}
	
	@Test
	public void testDropAll(){
		assertEquals(Adventurer.RESPONSE_OK, jack.performTakeOrDrop("drop all"));
		assertEquals(Adventurer.RESPONSE_NOTHERE, jack.performTakeOrDrop("drop banana"));
		assertEquals(Adventurer.RESPONSE_NOTHERE, jack.performTakeOrDrop("drop gun"));
		assertEquals(Adventurer.RESPONSE_NOTHERE, jack.performTakeOrDrop("drop lamp"));
		assertEquals(Adventurer.RESPONSE_NOTHERE, jack.performTakeOrDrop("drop knife"));
	}
	
	@Test
	public void testDropEverything(){
		assertEquals(Adventurer.RESPONSE_OK, jack.performTakeOrDrop("drop everything"));
		assertEquals(Adventurer.RESPONSE_NOTHERE, jack.performTakeOrDrop("drop banana"));
		assertEquals(Adventurer.RESPONSE_NOTHERE, jack.performTakeOrDrop("drop gun"));
		assertEquals(Adventurer.RESPONSE_NOTHERE, jack.performTakeOrDrop("drop lamp"));
		assertEquals(Adventurer.RESPONSE_NOTHERE, jack.performTakeOrDrop("drop knife"));
	}

	@Test
	public void testTakeAllBut(){
		assertEquals(Adventurer.RESPONSE_OK, jack.performTakeOrDrop("take all but shovel"));
		assertEquals(Adventurer.RESPONSE_NOTHERE, jack.performTakeOrDrop("take wood"));
		assertEquals(Adventurer.RESPONSE_NOTHERE, jack.performTakeOrDrop("take axe"));
		assertEquals(Adventurer.RESPONSE_NOTHERE, jack.performTakeOrDrop("take saw"));
		assertEquals(Adventurer.RESPONSE_OK, jack.performTakeOrDrop("take shovel"));
	}
	
	@Test
	public void testTakeEverythingBut(){
		assertEquals(Adventurer.RESPONSE_OK, jack.performTakeOrDrop("take everything but shovel"));
		assertEquals(Adventurer.RESPONSE_NOTHERE, jack.performTakeOrDrop("take wood"));
		assertEquals(Adventurer.RESPONSE_NOTHERE, jack.performTakeOrDrop("take axe"));
		assertEquals(Adventurer.RESPONSE_NOTHERE, jack.performTakeOrDrop("take saw"));
		assertEquals(Adventurer.RESPONSE_OK, jack.performTakeOrDrop("take shovel"));
	}
	
	@Test
	public void testDropAllExcept(){
		assertEquals(Adventurer.RESPONSE_OK, jack.performTakeOrDrop("drop all except knife"));
		assertEquals(Adventurer.RESPONSE_NOTHERE, jack.performTakeOrDrop("drop banana"));
		assertEquals(Adventurer.RESPONSE_NOTHERE, jack.performTakeOrDrop("drop gun"));
		assertEquals(Adventurer.RESPONSE_NOTHERE, jack.performTakeOrDrop("drop lamp"));
		assertEquals(Adventurer.RESPONSE_OK, jack.performTakeOrDrop("drop knife"));
	}
	
	@Test
	public void testDropEverythingExcept(){
		assertEquals(Adventurer.RESPONSE_OK, jack.performTakeOrDrop("drop everything except knife"));
		assertEquals(Adventurer.RESPONSE_NOTHERE, jack.performTakeOrDrop("drop banana"));
		assertEquals(Adventurer.RESPONSE_NOTHERE, jack.performTakeOrDrop("drop gun"));
		assertEquals(Adventurer.RESPONSE_NOTHERE, jack.performTakeOrDrop("drop lamp"));
		assertEquals(Adventurer.RESPONSE_OK, jack.performTakeOrDrop("drop knife"));
	}
}
