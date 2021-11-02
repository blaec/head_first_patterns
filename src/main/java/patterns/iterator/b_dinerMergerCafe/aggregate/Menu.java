package patterns.iterator.b_dinerMergerCafe.aggregate;

import patterns.iterator.b_dinerMergerCafe.MenuItem;

import java.util.Iterator;

public interface Menu {
    Iterator<MenuItem> createIterator();
}
