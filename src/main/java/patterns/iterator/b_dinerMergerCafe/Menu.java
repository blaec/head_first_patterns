package patterns.iterator.b_dinerMergerCafe;

import java.util.Iterator;

public interface Menu {
	public Iterator<MenuItem> createIterator();
}
