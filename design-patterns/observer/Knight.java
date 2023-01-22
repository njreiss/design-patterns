package observer;

/**
 * A Knight object that implements Observer
 * @author njreiss
 */
public class Knight implements Observer{
    private Subject watchman;

    /**
     * Constructor for ShopOwner object
     * @param watchman the list of observers that Knight will be registered to
     */
    public Knight(Subject watchman){
        this.watchman = watchman;
        watchman.registerObserver(this);
    }
    /**
     * A method that decides the behavior of a Knight based on warning level
     * @param warning is the level of alert as dictated by the watchmen
     */
    public void update(int warning){
        if(warning == 1){
            System.out.println("Knight: Helps everyone get home safe");
        }
        else{
            System.out.println("Knight: Prepares for battle");
        }
    }
}

