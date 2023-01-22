package observer;

/**
 * A ShopOwner object that implements Observer
 * @author njreiss
 */
public class ShopOwner implements Observer{
    private Subject watchman;

    /**
     * Constructor for ShopOwner object
     * @param watchman the list of observers that ShopOwner will be registered to
     */
    public ShopOwner(Subject watchman){
        this.watchman = watchman;
        watchman.registerObserver(this);
    }

    /**
     * A method that decides the behavior of a ShopOwner based on warning level
     * @param warning is the level of alert as dictated by the watchmen
     */
    public void update(int warning){
        if(warning == 1){
            System.out.println("Shop Owner: Close down shop and head home");
        }
        else{
            System.out.println("Shop Owner: Drops everything and find nearest hideout");
        }
    }
}
