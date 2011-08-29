import junit.framework.TestCase;

public class RecordCopierTest extends TestCase {

	private Record origRecord;
	private Record copyRecord;

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		origRecord = new Record("MSOFJAVA", "Piet Klerkx");
		Copier copier = new RecordCopier();
		copyRecord = copier.copyRecord(origRecord);
	}

	public void testCopyingARecord() {
		assertEquals(origRecord.getHashKey(), copyRecord.getHashKey());
	}
	
	public void testCopiedRecordsAreDifferentObjects() {
		assertNotSame(origRecord, copyRecord);
	}

}
