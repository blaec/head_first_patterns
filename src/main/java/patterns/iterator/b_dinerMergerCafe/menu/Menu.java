package patterns.iterator.b_dinerMergerCafe.menu;

import patterns.iterator.b_dinerMergerCafe.MenuItem;

import java.util.Iterator;

public interface Menu {
    Iterator<MenuItem> createIterator();
}
