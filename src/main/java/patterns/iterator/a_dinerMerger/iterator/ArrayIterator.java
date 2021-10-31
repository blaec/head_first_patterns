package patterns.iterator.a_dinerMerger.iterator;

import patterns.iterator.a_dinerMerger.MenuItem;

public class ArrayIterator implements Iterator {
    MenuItem[] items;
    int position = 0;

    public ArrayIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = items[position];
        position = position + 1;
        return menuItem;
    }

    @Override
    public boolean hasNext() {
        return position < items.length && items[position] != null;
    }
}
