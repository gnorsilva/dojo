import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class RecordCopier implements Copier {

	@Override
	public Record copyRecord(Record origRecord) {
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		serializeRecord(origRecord, bos);
		return deserializeRecord(bos);
	}

	private Record deserializeRecord(ByteArrayOutputStream bos) {
		try {
			return readObjectAndClose(bos);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	private Record readObjectAndClose(ByteArrayOutputStream bos) throws IOException, ClassNotFoundException {
		ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
		ObjectInputStream ois = new ObjectInputStream(bis);
		Object obj = ois.readObject();
		ois.close();
		return (Record) obj;
	}

	private void serializeRecord(Record origRecord, ByteArrayOutputStream bos) {
		try {
			writeObjectAndClose(origRecord, bos);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void writeObjectAndClose(Record origRecord, ByteArrayOutputStream bos) throws IOException {
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject(origRecord);
		oos.flush();
		oos.close();
	}

}
