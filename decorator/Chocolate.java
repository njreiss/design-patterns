package decorator;
/**
 * A Chocolate object that extends ScoopDecorator
 * @author njreiss
 */
public class Chocolate extends ScoopDecorator{
  /**
   * Constructor for Chocolate object
   * @param iceCream the other flavors/container for the icecream
   * @param numScoops number of scoops of chocolate ice cream
   */
  public Chocolate(IceCream iceCream, int numScoops){
    super(iceCream, numScoops);
    super.flavorCost = 1.50;
    super.flavor = "chocolate";
  }
}
