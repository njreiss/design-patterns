package statePattern;
/**
 * A OrderedState class, a state assigned upon package order
 * @author njreiss
 */

public class OrderedState extends State{
  private int days;
  /**
   * An OrderedState constructor, calls superconstructor
   * @param pkg super param
   * @param quantity super param
   */

  public OrderedState(Package pkg, int quantity) {
    super(pkg, quantity);
    days = 2;
  }
  /**
   * getStatus calls methods from state and package
   * @return string using name and verb describing status
   */
  public String getStatus() {
    return "The " + super.pgk.getName() + super.getVerb(" was ", " were ") + "ordered";
  }
  /**
   * getETA calls methods from package
   * @return string using name describing eta
   */
  public String getETA() {
    return "The " + super.pgk.getName() + " will be shipped within " + days + " business days";
  }
  /**
   * delay updates days and calls methods from package
   * @return string using name and verb to describe the delay
   */
  public String delay() {
    days += 2;
    return "The " + super.pgk.getName() + " experienced a slight delay in manufacturing.\nThe " + super.pgk.getName() + " will be shipped within " + days + " business days";
  }

}
