package observer;

public interface Observer {
    /**
     * Called when whatever this observer is observing changes
     * <p>
     * If update accepts no arguments, this is a pull-model observer
     * Must ask the observable what changed
     * Data is fresh, not stale
     * <p>
     * If update accepts an argument, this is a push-model observer
     * If data is simple, can just pass the new data as argument to update
     * If data is complicated, might pass just a hint (maybe a String?)
     */
    void update();
}
