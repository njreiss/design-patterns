package statePattern;
/**
 * A DeliveredState class, a state assigned upon package delivery
 * @author njreiss
 */
public class DeliveredState extends State{
  /**
   * A DeliveredState constructor, calls superconstructor
   * @param pkg superconstructor param
   * @param quantity superconstructor param
   */
  public DeliveredState(Package pkg, int quantity) {
    super(pkg, quantity);
  }
  /**
   * getStatus calls methods from state and package
   * @return string using name and verb describing status
   */
  public String getStatus() {
    return "The " + super.pgk.getName() + super.getVerb(" is ", " are ") + "here for you";
  }
  /**
   * getETA calls methods from state and package
   * @return string using name and verb describing eta
   */
  public String getETA() {
    return "The " + super.pgk.getName() + super.getVerb(" is ", " are ") + "here";

  }
  /**
   * delay calls methods from state and package
   * @return string using name and verb describing delay
   */
  public String delay() {
    return "The " + super.pgk.getName() + super.getVerb(" has ", " have ") + "already been delivered";
  }
}
