package sk.upjs.gursky.pdb;

import java.nio.ByteBuffer;

public class SalaryKey {

private long key;
	
	public SalaryKey() {}
	
	public SalaryKey(long key) {
		
		this.key = key;
	}
	
	public int getSize() {
		
		return 4;
	}
	
	public void load(ByteBuffer bb) {
		key = bb.getLong();
		
	}
	
	public void save(ByteBuffer bb) {
		
		bb.putLong(key);
	}
	
	public int compareTo(PersonStringKey personStringKey) {
		
		return key.compareTo(SalaryKey.key);
	}
	
}
