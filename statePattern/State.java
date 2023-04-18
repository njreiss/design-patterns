package statePattern;
/**
 * Abstract class state
 * @author njreiss
 */
public abstract class State {
  protected Package pgk;
  protected int quantity;
  /**
   * State constructor 
   * @param pkg package 
   * @param quantity number of packages
   */
  public State(Package pkg, int quantity) {
    this.pgk = pkg;
    this.quantity = quantity;
  }
  /**
   * abstract classes
   * @return strings
   */
  public abstract String getStatus();
  public abstract String getETA();
  public abstract String delay();
  /**
   * Uses context of quantity to assign appropriate verb
   * @param singular singular verb
   * @param plural plural verb
   * @return appropriate verb
   */
  protected String getVerb(String singular, String plural) {
    if (quantity == 1) {
      return singular;
    } else {
      return plural;
    }
  }
}
