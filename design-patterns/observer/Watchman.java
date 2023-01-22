package observer; 
import java.util.ArrayList;

/**
 * The watchman object that implements Subject. It kinda just seems like a 
 * container for the array list 
 * @author njreiss
 */
public class Watchman implements Subject{
    private ArrayList<Observer> observers;
    private int warning = 0;

    /**
     * A constructor for Watchman object. 
     */
    public Watchman(){
        observers = new ArrayList<Observer>();
    }

    /**
     * Adds observer to obervers list
     * @param observer Observer being added to observers list. 
     */
    public void registerObserver(Observer observer){
        observers.add(observer);
    }

    /**
     * Removes observer from observer list
     * @param observer Observer that is being removed from the observer list 
     */
    public void removeObserver(Observer observer){
        observers.remove(observer);
    }

    /**
     * Runs the update method for each observer in the observers arraylist
     */
    public void notifyObservers(){
        for(Observer observer : observers){
            observer.update(warning);
        }
    }
    /**
     * Types warnings as they are issued to the console, runs notifyObservers 
     * method, updates warning number 
     * @param warning Integer that represents the severity of the warning. 
     */
    public void issueWarning(int warning){
        this.warning = warning;
        if(warning == 1){
            System.out.println("WARNING:  1 trumpet was played!");    
        }
        else{
            System.out.println("WARNING:  2 trumpets were played!");
        }
        notifyObservers();
        this.warning++;
    }
}