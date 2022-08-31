package mainpackage;

import java.util.ArrayList;
import java.util.List;

public class MyMap {

	Integer mSize = 0;
	Object key, value;
	List<Object> entry;
	String pairs;

	public MyMap(Integer size) {
		
		entry = new ArrayList<>(size);
		this.mSize = size;
		for (int i = 0; i < size; i++) {
			entry.add(new Pair(null, null));
		}
	}

	public MyMap() {
		entry = new ArrayList<>();
	}

	public void addItem(Object val, Object k) {
		entry.add(new Pair(val, k));
	}

	public void addItem(Object k) {
		entry.add(new Pair(k, null));
	}

	public void addItem(int index, Object val, Object k) {
		entry.add(index, new Pair(val, k));
	}

	public Object getKey(Object val) throws Throwable {
		entry.forEach(singleItem -> {
			if (((Pair) singleItem).B != null) {
				if (((Pair) singleItem).B.equals(val)) {
					key = ((Pair) singleItem).B;
					return;
				}
			} else {
				key = null;
			}
		});
		return key;
	}

	public Object getValue(Object k) {
		entry.forEach(singleItem -> {
			if (((Pair) singleItem).A != null) {
				if (((Pair) singleItem).A.equals(k)) {
					key = ((Pair) singleItem).B;
					return;
				}
			} else {
				key = null;
			}
		});
		return key;
	}

	public String getPair(Object k) throws Throwable{
		return String.format("{\n\t%s : %s\n}", k,this.getValue(k));
	}
	
	public String getAllPairs() {
		pairs = "{";
		entry.forEach(e->{
			pairs+=String.format("\n\t%s : %s\n", ((Pair) e).A, ((Pair) e).B);
		});
		pairs+="}";
		return pairs;
	}
	
	public void pop(Object k) {
		entry.remove(entry.indexOf(k));
	}

	public void pop() {
		entry.remove(entry.get(entry.size() - 1));
	}

	public Integer getSize() {
		return entry.size();
	}

	// 'Key:value' pair class
	class Pair {
		Object A, B;

		Pair(Object a, Object b) {
			this.A = a;
			this.B = b;
		}

		Pair(Object a) {
			this.A = a;
		}
	}
}
