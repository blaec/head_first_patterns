package patterns.iterator.a_dinerMerger.aggregate;

import patterns.iterator.a_dinerMerger.iterator.Iterator;

public interface Menu {
    Iterator createIterator();
}
