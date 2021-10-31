package patterns.iterator.a_dinerMerger.iterator;

import patterns.iterator.a_dinerMerger.MenuItem;

import java.util.List;

public class PancakeHouseMenuIterator implements Iterator {
    List<MenuItem> items;
    int position = 0;

    public PancakeHouseMenuIterator(List<MenuItem> items) {
        this.items = items;
    }

    @Override
    public MenuItem next() {
		/* 
		MenuItem item = items.get(position);
		position = position + 1;
		return item;
		*/
        // or shorten to:
        return items.get(position++);
    }

    @Override
    public boolean hasNext() {
		/*
		if (position >= items.size()) {
			return false;
		} else {
			return true;
		}
		*/
        // or shorten to:
        return items.size() > position;
    }
}
