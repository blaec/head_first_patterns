package patterns.iterator.a_dinerMerger.iterator;

import patterns.iterator.a_dinerMerger.MenuItem;

public interface Iterator {
	boolean hasNext();
	MenuItem next();
}
