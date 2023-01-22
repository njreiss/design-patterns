package observer;
/**
 * A teacher object that implements observer
 * @author njreiss
 */
public class Teacher implements Observer{
    private Subject watchman;

    /**
     * Constructor to create Teacher object
     * @param watchman used to access the array list that contains all the observers
     */
    public Teacher(Subject watchman){
        this.watchman = watchman;
        watchman.registerObserver(this);
    }

    /**
     * A method that decides the behavior of a teacher based on warning level
     * @param warning is the level of alert as dictated by the watchmen
     */
    public void update(int warning){
        if(warning == 1){
            System.out.println("Teacher: Helps get every kid home safe");
        }
        else{
            System.out.println("Teacher: Brings all students to the underground shelter");
        }
    }
}
