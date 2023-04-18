package statePattern;
/** 
 * Package object
 * @author njreiss
 */
public class Package {
  private String name;
  private int quantity;
  private State state;
  private State orderedState;
  private State inTransitState;
  private State deliveredState;
  /**
   * Package constructor
   * @param name package name
   * @param quantity number of object
   */
  public Package (String name, int quantity) {
    this.name = name;
    this.quantity = quantity;
    orderedState = new OrderedState(this, quantity);
    inTransitState = new InTransitState(this, quantity);
    deliveredState = new DeliveredState(this, quantity);

  }
  /**
   * Sets state to ordered
   * @return status and eta
   */
  public String order() {
    this.state = orderedState;
    return state.getStatus() + "\n" + state.getETA();
  } 
  /**
   * Sets state to inTransit
   * @return status and eta
   */
  public String mail() {
    this.state = inTransitState;
    return state.getStatus() + "\n" + state.getETA();
  }
  /**
   * Sets state to delivered
   * @return status
   */
  public String received() {
    this.state = deliveredState;
    return state.getStatus();
  }
  /**
   * gets delay
   * @return delay
   */
  public String delay() {
    return state.delay();
  }
  /**
   * sets state
   * @param state
   */
  public void setState(State state) {
    this.state = state;
  }
  /**
   * gets name
   * @return name
   */
  public String getName() {
    return name;
  }
}

