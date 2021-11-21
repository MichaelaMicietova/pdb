package sk.upjs.gursky.pdb;

import java.nio.ByteBuffer;

import sk.upjs.gursky.bplustree.BPObject;

public class SalaryOffsetEntry implements BPObject<SalaryKey, SalaryOffsetEntry> {

	private static final long serialVersionUID = -6545630773379537035L;

	long salary;
	long offset;
	
	public SalaryOffsetEntry() {
	}
	
	@Override
	public String toString() {
	return super.toString();
	}
	
	public SalaryOffsetEntry(long salary, long offset) {
		this.salary = salary;
		this.offset = offset;
	}
	
	public String getSalary() {
		return salary;
	}
	
	public long getOffset() {
		return offset;
	}

	@Override
	public int compareTo(SalaryOffsetEntry o) {
		return this.salary.compareTo(o.salary);
		}
	
	@Override
	public void load(ByteBuffer bb) {
		
		salary = bb.getLong(0);
		
		offset = bb.getLong(1);
	}
	
	@Override
	public void save(ByteBuffer bb) {

		bb.putLong(salary)
		bb.putLong(offset);
		
	}
	
	@Override
	public int getSize() {
		return 28;
	}
	
	@Override
	public SalaryKey getKey() {
		return new SalaryKey(salary);
	}
	
	
	
}
