package statePattern;
/**
 * A InTransitState class, a state assigned upon package transit
 * @author njreiss
 */
public class InTransitState extends State{
  private int days;
  /**
   * An InTransitState constructor, calls superconstructor
   * @param pkg super param
   * @param quantity super param
   */
  public InTransitState(Package pkg, int quantity) {
    super(pkg, quantity);
    days = 5;
  }
  /**
   * getStatus calls methods from state and package
   * @return string using name and verb describing status
   */
  public String getStatus() {
    return "The " + super.pgk.getName() + super.getVerb(" is ", " are ") + "out for delivery";
  }
  /**
   * getETA calls methods from package
   * @return string using name describing eta
   */
  public String getETA() {
    return "The " + super.pgk.getName() + " should arrive within " + days + " days";
  }
  /**
   * delay updates days and calls methods from state and package
   * @return string using name and verb to describe the delay
   */
  public String delay() {
    days += 3;
    return "The " + super.pgk.getName() + super.getVerb(" has "," have ") + " experienced a delay in shipping.\nThe " + super.pgk.getName() + " should arrive within " + days + " days";
  }
}
