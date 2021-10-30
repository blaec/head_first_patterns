package patterns.iterator.dinerMerger.iterator;

import patterns.iterator.dinerMerger.MenuItem;

import java.util.ArrayList;

public class ArrayListIterator implements Iterator {
    ArrayList<MenuItem> items;
    int position = 0;

    public ArrayListIterator(ArrayList<MenuItem> items) {
        this.items = items;
    }

    @Override
    public MenuItem next() {
        MenuItem item = items.get(position);
        position = position + 1;
        return item;
    }

    @Override
    public boolean hasNext() {
        return position < items.size();
    }
}
