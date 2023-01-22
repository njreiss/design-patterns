package observer;

/**
 * Interface for Subject
 * @author njreiss
 */
interface Subject{
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers();
}