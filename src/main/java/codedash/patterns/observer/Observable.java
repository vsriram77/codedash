package codedash.patterns.observer;

/**
 * Observable interface
 */
public interface Observable {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers();
}
