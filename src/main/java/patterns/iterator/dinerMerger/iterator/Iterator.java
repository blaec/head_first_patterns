package patterns.iterator.dinerMerger.iterator;

import patterns.iterator.dinerMerger.MenuItem;

public interface Iterator {
	boolean hasNext();
	MenuItem next();
}
