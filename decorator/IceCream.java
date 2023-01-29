package decorator;
/**
 * An abstract class IceCream
 * @author njreiss
 */
public abstract class IceCream {
  protected String description;
  /**
   * Constructor for abstract IceCream object
   */
  public IceCream(){
    
  }
  /**
   * toString that returns description of ice cream
   */
  public String toString(){
    return description;
  }
  /**
   * Abstract method getCost that returns double
   */
  public abstract double getCost();
}
