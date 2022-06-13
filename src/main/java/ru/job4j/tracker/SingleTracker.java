package ru.job4j.tracker;

public final class SingleTracker {
    private static  SingleTracker singleTracker = null;
    private Tracker tracker = new Tracker();

    private SingleTracker(){}

    private static SingleTracker getSingleTracker() {
        if (singleTracker == null) {
            singleTracker = new SingleTracker();
        }
        return singleTracker;
    }

    public Item add(Item item) {
        return tracker.add(item);
    }

    public Item findById(int id) {
        return tracker.findById(id);
    }

    public Item[] findByName(String key) {
        return tracker.findByName(key);
    }

    public boolean delete(int id) {
        return tracker.delete(id);
    }

    public boolean replace(int id, Item item) {
        return tracker.replace(id, item);
    }

    public Item[] findAll() {
        return tracker.findAll();
    }
}
